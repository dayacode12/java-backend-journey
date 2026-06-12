# Java Backend Journey 🚀

Transitioning from QA Automation to Java Backend Development through structured learning and hands-on projects.

---

## Table of Contents

- [Overview](#overview)
- [Learning Roadmap](#learning-roadmap)
- [Prerequisites & Setup](#prerequisites--setup)
- [Projects](#projects)
- [LeetCode Resources](#leetcode-resources)
- [Learning Resources](#learning-resources)
- [Getting Started](#getting-started)
- [Contributing](#contributing)

---

## Overview

This repository documents my journey transitioning from QA Automation to Java Backend Development. It contains structured learning materials, hands-on projects, and coding problems solved during the process.

**Target Skills:**
- Core Java & OOP concepts
- Data Structures & Algorithms
- Spring Framework & Spring Boot
- RESTful API Development
- Database Design & SQL
- Testing & Quality Assurance
- System Design Principles

---

## Learning Roadmap

### Phase 1: Java Fundamentals (Weeks 1-3)
- [ ] Java Basics (variables, data types, operators)
- [ ] Control Flow (if-else, loops, switch statements)
- [ ] Object-Oriented Programming (classes, inheritance, polymorphism, encapsulation, abstraction)
- [ ] Exception Handling
- [ ] Collections Framework (List, Set, Map)

### Phase 2: Data Structures & Algorithms (Weeks 4-8)
- [ ] Arrays & Strings
- [ ] Linked Lists
- [ ] Stacks & Queues
- [ ] Trees & Binary Search Trees
- [ ] Graphs
- [ ] Sorting & Searching Algorithms
- [ ] Dynamic Programming
- [ ] Bit Manipulation

### Phase 3: Intermediate Java (Weeks 9-11)
- [ ] Generics & Type Safety
- [ ] Functional Programming (Lambdas, Streams)
- [ ] File I/O
- [ ] Multithreading & Concurrency
- [ ] Reflection & Annotations

### Phase 4: Spring & Spring Boot (Weeks 12-16)
- [ ] Spring Framework Basics
- [ ] Dependency Injection & IoC Container
- [ ] Spring Boot Project Setup
- [ ] Spring MVC
- [ ] RESTful API Development
- [ ] Exception Handling in REST APIs

### Phase 5: Database & Persistence (Weeks 17-19)
- [ ] SQL Fundamentals
- [ ] Database Design
- [ ] JPA & Hibernate
- [ ] Spring Data JPA
- [ ] Transactions & ACID Properties

### Phase 6: Advanced Topics (Weeks 20+)
- [ ] Authentication & Authorization
- [ ] API Security
- [ ] Microservices Architecture
- [ ] Docker & Containerization
- [ ] CI/CD Pipelines
- [ ] Testing (Unit, Integration)
- [ ] Monitoring & Logging

---

## Prerequisites & Setup

### System Requirements

- **Java Development Kit (JDK):** Version 11 or higher
  - [Download JDK](https://www.oracle.com/java/technologies/downloads/)
- **Apache Maven:** Version 3.6 or higher
  - [Download Maven](https://maven.apache.org/download.cgi)
- **Git:** Version 2.0 or higher
  - [Download Git](https://git-scm.com/)
- **IDE:** IntelliJ IDEA Community Edition or VS Code
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
  - [VS Code](https://code.visualstudio.com/)

### Installation & Configuration

#### 1. Install JDK
```bash
# Linux (Ubuntu/Debian)
sudo apt-get install openjdk-11-jdk

# macOS
brew install openjdk@11

# Windows
# Download from Oracle website and install
```

#### 2. Verify Java Installation
```bash
java -version
javac -version
```

#### 3. Install Maven
```bash
# Download and extract Maven
# Set MAVEN_HOME environment variable
# Add Maven bin to PATH

# Verify installation
mvn -version
```

#### 4. Clone Repository
```bash
git clone https://github.com/dayacode12/java-backend-journey.git
cd java-backend-journey
```

#### 5. Setup IDE
- Open the project in your IDE
- Configure JDK path
- Install necessary plugins (Spring Boot, Lombok, etc.)

---

## Projects

### Project 1: Student Management System
**Difficulty:** Beginner  
**Duration:** 1-2 weeks  
**Topics:** OOP, Collections, File I/O

**Description:**
A console-based application to manage student records with CRUD operations.

**Features:**
- Add, update, delete, and retrieve student records
- Search students by ID or name
- Persistent storage using file serialization
- Input validation

**Technologies:** Core Java, Collections, File I/O

---

### Project 2: Bank Management System
**Difficulty:** Beginner to Intermediate  
**Duration:** 2-3 weeks  
**Topics:** OOP, Exception Handling, Collections

**Description:**
A desktop application for basic banking operations.

**Features:**
- Account creation and management
- Deposit and withdraw operations
- Transaction history
- User authentication
- Balance inquiry

**Technologies:** Core Java, Swing (GUI), Collections, Exception Handling

---

### Project 3: Todo REST API
**Difficulty:** Intermediate  
**Duration:** 2-3 weeks  
**Topics:** Spring Boot, REST APIs, JPA

**Description:**
A full-featured REST API for managing todo items.

**Features:**
- Create, read, update, delete todos
- User authentication & authorization
- Task categorization and filtering
- API documentation (Swagger)
- Unit and integration tests

**Technologies:** Spring Boot, Spring Data JPA, MySQL, JUnit, Mockito

**Endpoints:**
- `POST /api/todos` - Create a new todo
- `GET /api/todos` - Retrieve all todos
- `GET /api/todos/{id}` - Retrieve specific todo
- `PUT /api/todos/{id}` - Update todo
- `DELETE /api/todos/{id}` - Delete todo

---

### Project 4: E-commerce REST API
**Difficulty:** Advanced  
**Duration:** 4-5 weeks  
**Topics:** Spring Boot, Microservices, Caching, Security

**Description:**
A comprehensive e-commerce backend system with multiple microservices.

**Features:**
- Product catalog management
- Shopping cart functionality
- Order processing
- Payment integration (mock)
- User reviews and ratings
- Role-based access control
- API rate limiting
- Caching strategies
- Database optimization

**Technologies:** Spring Boot, Spring Security, MySQL, Redis, Docker, Kubernetes (optional)

---

### Project 5: Social Media API
**Difficulty:** Advanced  
**Duration:** 5-6 weeks  
**Topics:** Advanced Spring Boot, Microservices, Real-time Features

**Description:**
A social media platform backend with advanced features.

**Features:**
- User profiles and authentication
- Post creation and management
- Comment and like functionality
- Follow/Unfollow system
- User feed generation
- Search functionality
- Real-time notifications (WebSocket)
- Image upload
- Scalability & performance optimization

**Technologies:** Spring Boot, Spring Data JPA, MongoDB/PostgreSQL, Redis, WebSocket, Docker, Kafka (optional)

---

## LeetCode Resources

### Easy Level Problems
| # | Problem | Topics | Status |
|---|---------|--------|--------|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Array, Hash Map | ⬜ |
| 2 | [Reverse String](https://leetcode.com/problems/reverse-string/) | String, Array | ⬜ |
| 3 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Stack, String | ⬜ |
| 4 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | Linked List | ⬜ |
| 5 | [Palindrome Number](https://leetcode.com/problems/palindrome-number/) | Math | ⬜ |
| 6 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | Array, Hash Set | ⬜ |
| 7 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | Array, DP | ⬜ |
| 8 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | Array | ⬜ |
| 9 | [Majority Element](https://leetcode.com/problems/majority-element/) | Array, Divide & Conquer | ⬜ |
| 10 | [First Missing Positive](https://leetcode.com/problems/first-missing-positive/) | Array | ⬜ |

### Medium Level Problems
| # | Problem | Topics | Status |
|---|---------|--------|--------|
| 1 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | Linked List, Math | ⬜ |
| 2 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | String, Sliding Window | ⬜ |
| 3 | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) | String, DP | ⬜ |
| 4 | [Zigzag Conversion](https://leetcode.com/problems/zigzag-conversion/) | String | ⬜ |
| 5 | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) | Tree, BFS | ⬜ |
| 6 | [Course Schedule](https://leetcode.com/problems/course-schedule/) | Graph, Topological Sort | ⬜ |
| 7 | [Coin Change](https://leetcode.com/problems/coin-change/) | DP | ⬜ |
| 8 | [Word Break](https://leetcode.com/problems/word-break/) | DP, String | ⬜ |
| 9 | [House Robber](https://leetcode.com/problems/house-robber/) | DP, Array | ⬜ |
| 10 | [LRU Cache](https://leetcode.com/problems/lru-cache/) | Design, Hash Map, Linked List | ⬜ |

### Hard Level Problems
| # | Problem | Topics | Status |
|---|---------|--------|--------|
| 1 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | Array, Binary Search | ⬜ |
| 2 | [Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching/) | String, DP | ⬜ |
| 3 | [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | Linked List, Divide & Conquer | ⬜ |
| 4 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) | Array, Stack | ⬜ |
| 5 | [Skyline Problem](https://leetcode.com/problems/the-skyline-problem/) | Segment Tree, Heap | ⬜ |
| 6 | [Word Ladder II](https://leetcode.com/problems/word-ladder-ii/) | BFS, Graph | ⬜ |
| 7 | [Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/) | Stack, Array | ⬜ |
| 8 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | String, Sliding Window | ⬜ |

### Data Structures & Algorithms by Topic

#### Arrays & Strings
- [Two Sum](https://leetcode.com/problems/two-sum/)
- [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
- [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)
- [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)
- [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/)

#### Linked Lists
- [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)
- [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)
- [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)
- [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)

#### Trees & Graphs
- [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/)
- [Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)
- [Number of Islands](https://leetcode.com/problems/number-of-islands/)
- [Course Schedule](https://leetcode.com/problems/course-schedule/)

#### Stacks & Queues
- [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)
- [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/)
- [Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/)

#### Dynamic Programming
- [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)
- [House Robber](https://leetcode.com/problems/house-robber/)
- [Coin Change](https://leetcode.com/problems/coin-change/)
- [Edit Distance](https://leetcode.com/problems/edit-distance/)

---

## Learning Resources

### Books
- **Effective Java** by Joshua Bloch
- **Clean Code** by Robert C. Martin
- **Design Patterns: Elements of Reusable Object-Oriented Software** by Gang of Four
- **Introduction to Algorithms** by Cormen, Leiserson, Rivest, and Stein
- **Spring in Action** by Craig Walls

### Online Courses
- [Java Programming Masterclass](https://www.udemy.com/course/java-the-complete-java-developer-course/)
- [Spring Boot Microservices](https://www.udemy.com/course/microservices-with-spring-boot-and-spring-cloud/)
- [Data Structures & Algorithms](https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/)
- [System Design Interview](https://www.educative.io/courses/grokking-the-system-design-interview)

### YouTube Channels
- [Code With Harry](https://www.youtube.com/@CodeWithHarry)
- [Telusko](https://www.youtube.com/@Telusko)
- [Kunal Kushwaha](https://www.youtube.com/@KunalKushwaha)

### Documentation
- [Official Java Documentation](https://docs.oracle.com/javase/11/docs/api/)
- [Spring Framework Documentation](https://spring.io/projects/spring-framework)
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Maven Documentation](https://maven.apache.org/guides/)

### Coding Platforms
- [LeetCode](https://leetcode.com/) - Algorithm & Data Structure Problems
- [HackerRank](https://www.hackerrank.com/) - Coding Challenges
- [CodeSignal](https://codesignal.com/) - Interview Preparation
- [Codewars](https://www.codewars.com/) - Coding Katas
- [See Algorithms](https://see-algorithms.com/) - Visualizing Algorithms & Data Structures

---

## Getting Started

### Quick Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/dayacode12/java-backend-journey.git
   cd java-backend-journey
   ```

2. **Verify Java installation:**
   ```bash
   java -version
   javac -version
   ```

3. **Navigate to a project:**
   ```bash
   cd projects/project-name
   ```

4. **Compile and run:**
   ```bash
   javac src/*.java
   java -cp src MainClass
   ```

5. **For Spring Boot projects:**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

### Directory Structure

```
java-backend-journey/
├── README.md
├── pom.xml (parent)
├── projects/
│   ├── student-management-system/
│   ├── bank-management-system/
│   ├── todo-rest-api/
│   ├── ecommerce-rest-api/
│   └── social-media-api/
├── leetcode-solutions/
│   ├── easy/
│   ├── medium/
│   └── hard/
├── learning-resources/
│   ├── java-fundamentals/
│   ├── data-structures/
│   ├── oop-concepts/
│   └── spring-boot/
└── docs/
    ├── setup-guide.md
    ├── best-practices.md
    └── troubleshooting.md
```

---

## Contributing

Contributions are welcome! Feel free to:
- Add new solutions or projects
- Improve existing code
- Report bugs
- Suggest improvements

Please follow these guidelines:
1. Fork the repository
2. Create a feature branch (`git checkout -b feature/your-feature`)
3. Commit your changes (`git commit -m 'Add your feature'`)
4. Push to the branch (`git push origin feature/your-feature`)
5. Open a Pull Request

---

## Progress Tracking

- [x] Repository Setup
- [x] README Documentation
- [ ] Phase 1 - Java Fundamentals
- [ ] Phase 2 - Data Structures & Algorithms
- [ ] Phase 3 - Intermediate Java
- [ ] Phase 4 - Spring & Spring Boot
- [ ] Phase 5 - Database & Persistence
- [ ] Phase 6 - Advanced Topics

---

## Contact

- **GitHub:** [@dayacode12](https://github.com/dayacode12)
- **LinkedIn:** [Your LinkedIn Profile]

---

## License

This repository is open source and available under the [MIT License](LICENSE).

---

**Happy Learning! 🎉**
