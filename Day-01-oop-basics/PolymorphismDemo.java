package Day01;

/**
 * PolymorphismDemo: Demonstrates polymorphism in Java
 * 
 * Polymorphism means "many forms"
 * Two types:
 * 1. Compile-time Polymorphism (Static): Method Overloading
 * 2. Runtime Polymorphism (Dynamic): Method Overriding
 */

public class PolymorphismDemo {

    // ========== METHOD OVERLOADING (Compile-time Polymorphism) ==========
    static class Calculator {
        // Same method name, different parameters
        
        // Method 1: Add two integers
        int add(int a, int b) {
            return a + b;
        }

        // Method 2: Add three integers (different number of parameters)
        int add(int a, int b, int c) {
            return a + b + c;
        }

        // Method 3: Add two doubles (different type of parameters)
        double add(double a, double b) {
            return a + b;
        }

        // Method 4: Add String (different parameter type)
        String add(String a, String b) {
            return a + b;
        }
    }

    // ========== METHOD OVERRIDING (Runtime Polymorphism) ==========
    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }

        void move() {
            System.out.println("Animal is moving");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks: Woof Woof!");
        }

        @Override
        void move() {
            System.out.println("Dog runs on four legs");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows: Meow Meow!");
        }

        @Override
        void move() {
            System.out.println("Cat walks silently");
        }
    }

    static class Bird extends Animal {
        @Override
        void sound() {
            System.out.println("Bird chirps: Tweet Tweet!");
        }

        @Override
        void move() {
            System.out.println("Bird flies in the sky");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== METHOD OVERLOADING (Compile-time Polymorphism) ===\n");
        
        Calculator calc = new Calculator();

        // Calling overloaded methods
        System.out.println("Add two integers: " + calc.add(5, 10));
        System.out.println("Add three integers: " + calc.add(5, 10, 15));
        System.out.println("Add two doubles: " + calc.add(5.5, 10.5));
        System.out.println("Concatenate strings: " + calc.add("Hello", "World"));

        System.out.println("\n=== METHOD OVERRIDING (Runtime Polymorphism) ===\n");
        
        // Create array of Animal references
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Bird();

        // Same method call, different behavior based on actual object
        System.out.println("=== Calling sound() ===");
        for (Animal animal : animals) {
            animal.sound(); // Polymorphic behavior
        }

        System.out.println("\n=== Calling move() ===");
        for (Animal animal : animals) {
            animal.move(); // Polymorphic behavior
        }

        System.out.println("\n=== Direct Object Calls ===");
        Dog dog = new Dog();
        dog.sound();
        dog.move();

        Cat cat = new Cat();
        cat.sound();
        cat.move();
    }
}

/*
 * Key Takeaways:
 * 
 * METHOD OVERLOADING (Compile-time Polymorphism):
 * 1. Same method name, different parameters
 * 2. Resolved at compile time
 * 3. Can differ in:
 *    - Number of parameters
 *    - Type of parameters
 *    - Order of parameters
 * 4. Return type alone cannot distinguish overloaded methods
 * 5. Improves code readability
 * 
 * METHOD OVERRIDING (Runtime Polymorphism):
 * 1. Parent and child have same method with same signature
 * 2. Resolved at runtime
 * 3. Child class provides specific implementation
 * 4. Uses 'super' keyword to call parent method
 * 5. Allows treating different objects uniformly
 * 6. Enables flexible and extensible code
 * 
 * BENEFITS:
 * - Code reusability
 * - Flexibility
 * - Loose coupling
 * - Easy to maintain and extend
 */
