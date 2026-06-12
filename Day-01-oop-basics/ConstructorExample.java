package Day01;

/**
 * ConstructorExample: Demonstrates different types of constructors
 * 
 * Constructor Types:
 * 1. Default Constructor (no parameters)
 * 2. Parameterized Constructor (with parameters)
 * 3. Copy Constructor (copies another object)
 */

public class ConstructorExample {

    static class Student {
        String name;
        int rollNo;
        double gpa;

        // Default Constructor (no parameters)
        Student() {
            this.name = "Unknown";
            this.rollNo = 0;
            this.gpa = 0.0;
            System.out.println("Default Constructor Called");
        }

        // Parameterized Constructor
        Student(String name, int rollNo, double gpa) {
            this.name = name;
            this.rollNo = rollNo;
            this.gpa = gpa;
            System.out.println("Parameterized Constructor Called");
        }

        // Copy Constructor (copies another Student object)
        Student(Student other) {
            this.name = other.name;
            this.rollNo = other.rollNo;
            this.gpa = other.gpa;
            System.out.println("Copy Constructor Called");
        }

        void displayInfo() {
            System.out.println("Name: " + name + ", Roll No: " + rollNo + ", GPA: " + gpa);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Default Constructor ===");
        Student student1 = new Student();
        student1.displayInfo();

        System.out.println("\n=== Parameterized Constructor ===");
        Student student2 = new Student("Alice", 101, 3.8);
        student2.displayInfo();

        System.out.println("\n=== Another Parameterized Constructor ===");
        Student student3 = new Student("Bob", 102, 3.5);
        student3.displayInfo();

        System.out.println("\n=== Copy Constructor ===");
        Student student4 = new Student(student2); // Creates a copy of student2
        student4.displayInfo();

        System.out.println("\n=== Modifying copied object ===");
        student4.name = "Charlie"; // Modify the copy
        System.out.println("Original student2: ");
        student2.displayInfo();
        System.out.println("Modified student4: ");
        student4.displayInfo();
    }
}

/*
 * Key Takeaways:
 * 1. Constructor is called automatically when object is created
 * 2. Constructor has same name as class and no return type
 * 3. Default Constructor initializes with default values
 * 4. Parameterized Constructor accepts arguments
 * 5. Copy Constructor creates a new object with values from existing object
 * 6. Multiple constructors = Constructor Overloading
 * 7. Constructor helps ensure object is in valid state from the beginning
 */
