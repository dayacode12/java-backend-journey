# Backend CRUD API Roadmap: Spring Boot + SQL + DBMS

This is the first practical backend track for the repository. The goal is to build a complete local CRUD API using only open-source tools before moving to AWS Free Tier.

## Target Project

Build an `Employee Management API`.

```text
Client/Postman
  -> REST Controller
  -> Service Layer
  -> Repository Layer
  -> PostgreSQL Database
```

Core CRUD operations:

```text
Create employee  -> POST /api/employees
Read all         -> GET /api/employees
Read one         -> GET /api/employees/{id}
Update employee  -> PUT /api/employees/{id}
Delete employee  -> DELETE /api/employees/{id}
```

## Open-Source Tool Stack

```text
Java 17+
Spring Boot
Spring Web
Spring Data JPA
Hibernate
PostgreSQL
Maven
Docker Desktop, optional
DBeaver or pgAdmin
Postman, Hoppscotch, or Thunder Client
Git + GitHub
JUnit + Mockito
```

## Phase 1: DBMS Basics

Learn before coding the API:

```text
Database
Table
Row
Column
Primary key
Foreign key
Constraint
Index
Transaction
ACID
Normalization
Relationship: one-to-one, one-to-many, many-to-many
```

Example employee table:

```sql
CREATE TABLE employees (
    id BIGSERIAL PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    department VARCHAR(100),
    salary NUMERIC(10, 2),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

## Phase 2: SQL CRUD

Practice these directly in PostgreSQL first.

```sql
-- Create
INSERT INTO employees (first_name, last_name, email, department, salary)
VALUES ('Asha', 'Rao', 'asha.rao@example.com', 'Engineering', 75000);

-- Read all
SELECT * FROM employees;

-- Read one
SELECT * FROM employees WHERE id = 1;

-- Update
UPDATE employees
SET department = 'Platform', salary = 82000
WHERE id = 1;

-- Delete
DELETE FROM employees WHERE id = 1;
```

Must-learn SQL after basic CRUD:

```text
WHERE
ORDER BY
LIMIT
LIKE
COUNT
GROUP BY
HAVING
INNER JOIN
LEFT JOIN
Indexes
Transactions
```

## Phase 3: Local Spring Boot Setup

Create a project from Spring Initializr.

Dependencies:

```text
Spring Web
Spring Data JPA
PostgreSQL Driver
Validation
Lombok, optional
Spring Boot DevTools, optional
```

Recommended package structure:

```text
com.example.employeeapi
  controller
  service
  repository
  entity
  dto
  exception
```

## Phase 4: PostgreSQL Connection

`src/main/resources/application.properties`

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/employee_db
spring.datasource.username=postgres
spring.datasource.password=postgres

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

For learning, `ddl-auto=update` is acceptable. For production, use migrations with Flyway or Liquibase.

## Phase 5: Entity

```java
package com.example.employeeapi.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    private String department;
    private BigDecimal salary;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
```

## Phase 6: Repository

```java
package com.example.employeeapi.repository;

import com.example.employeeapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    boolean existsByEmail(String email);
}
```

## Phase 7: Service

```java
package com.example.employeeapi.service;

import com.example.employeeapi.entity.Employee;
import com.example.employeeapi.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee findById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found: " + id));
    }

    public Employee update(Long id, Employee updatedEmployee) {
        Employee employee = findById(id);

        employee.setFirstName(updatedEmployee.getFirstName());
        employee.setLastName(updatedEmployee.getLastName());
        employee.setEmail(updatedEmployee.getEmail());
        employee.setDepartment(updatedEmployee.getDepartment());
        employee.setSalary(updatedEmployee.getSalary());

        return employeeRepository.save(employee);
    }

    public void delete(Long id) {
        Employee employee = findById(id);
        employeeRepository.delete(employee);
    }
}
```

## Phase 8: REST Controller

```java
package com.example.employeeapi.controller;

import com.example.employeeapi.entity.Employee;
import com.example.employeeapi.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee create(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }

    @GetMapping
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable Long id) {
        return employeeService.findById(id);
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.update(id, employee);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        employeeService.delete(id);
    }
}
```

## Phase 9: API Test Requests

Create employee:

```http
POST http://localhost:8080/api/employees
Content-Type: application/json

{
  "firstName": "Asha",
  "lastName": "Rao",
  "email": "asha.rao@example.com",
  "department": "Engineering",
  "salary": 75000
}
```

Get all:

```http
GET http://localhost:8080/api/employees
```

Get one:

```http
GET http://localhost:8080/api/employees/1
```

Update:

```http
PUT http://localhost:8080/api/employees/1
Content-Type: application/json

{
  "firstName": "Asha",
  "lastName": "Rao",
  "email": "asha.rao@example.com",
  "department": "Platform",
  "salary": 82000
}
```

Delete:

```http
DELETE http://localhost:8080/api/employees/1
```

## Phase 10: Add These Next

After basic CRUD works:

```text
DTO classes
Input validation
Global exception handling
Pagination
Sorting
Search by department
Find by email
Swagger/OpenAPI
Unit tests
Integration tests
Docker Compose with PostgreSQL
GitHub Actions
AWS EC2 deployment
AWS RDS PostgreSQL
```

## Learning Resources

Official and open-source references:

```text
Spring guide: Accessing Data with JPA
https://spring.io/guides/gs/accessing-data-jpa

Spring guide: Accessing JPA Data with REST
https://spring.io/guides/gs/accessing-data-rest

Spring Data JPA GitHub
https://github.com/spring-projects/spring-data-jpa

Spring Data Examples GitHub
https://github.com/spring-projects/spring-data-examples

Spring PetClinic GitHub
https://github.com/spring-projects/spring-petclinic

Spring PetClinic REST GitHub
https://github.com/spring-petclinic/spring-petclinic-rest

PostgreSQL Docker Official Image
https://hub.docker.com/_/postgres

PostgreSQL Docker GitHub
https://github.com/docker-library/postgres
```

## First Milestone Checklist

```text
[ ] Install Java 17+
[ ] Install IntelliJ IDEA Community
[ ] Install PostgreSQL
[ ] Install DBeaver or pgAdmin
[ ] Create employee_db
[ ] Practice SQL CRUD manually
[ ] Create Spring Boot project
[ ] Connect Spring Boot to PostgreSQL
[ ] Create Employee entity
[ ] Create EmployeeRepository
[ ] Create EmployeeService
[ ] Create EmployeeController
[ ] Test all CRUD APIs
[ ] Commit project to GitHub
```
