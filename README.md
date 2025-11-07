## 🧑‍💻 Author

**Name:** Akash Sharma

**Roll No:** 2401201108

**Program:** BCA (Hons.) – AI & Data Science

**University:** K.R. Mangalam University

**Session:** 2025–26


---

````
# 🧮 Calculator Application Using Method Overloading (Java)

---

## 🎯 Project Title
**Calculator Application Using Method Overloading**

---

## 🧠 Problem Statement
Design and implement a **Calculator Application** that demonstrates the concept of **Method Overloading** in Java.  
The application should allow users to perform **basic arithmetic operations** (Addition, Subtraction, Multiplication, and Division) using **overloaded methods** that accept different types and numbers of parameters.

---

## 🎓 Project Objectives
- Understand and apply the concept of **method overloading** in Java.  
- Implement **overloaded methods** for arithmetic operations.  
- Use **Java control structures** and **I/O operations** effectively.  
- Handle **exceptions** such as divide-by-zero errors.  
- Create a **menu-driven** user interface for interaction.  

---

## 🧩 Conceptual Theory

### 🔹 Method Overloading
Method Overloading is a feature in Java that allows a class to have **multiple methods with the same name** but different **parameter lists** (different number, type, or order of parameters).  
It represents **compile-time polymorphism**, meaning the method to be executed is determined at **compile time** based on the method signature.

Example:
```java
int add(int a, int b);
double add(double a, double b);
int add(int a, int b, int c);
````

All the above methods share the same name `add` but differ in parameters.

---

### 🔹 Exception Handling

Exception Handling ensures that the program continues to run smoothly even when runtime errors occur.
In this project, we handle **divide-by-zero** exceptions using a `try-catch` block to prevent program crashes and display user-friendly messages.

---

### 🔹 Object-Oriented Concepts Used

* **Encapsulation:** Grouping data and methods inside classes.
* **Polymorphism:** Demonstrated through method overloading (compile-time).
* **Modularity:** Code is divided into separate classes (`Calculator` and `UserInterface`) for better structure and maintenance.

---

## ⚙️ Features

✅ Perform Addition (two integers, two doubles, or three integers)
✅ Perform Subtraction, Multiplication, and Division
✅ Handles **divide-by-zero** gracefully
✅ Clean and interactive **menu-driven interface**
✅ Demonstrates **compile-time polymorphism**

---

## 🧱 Class Design

### **1️⃣ Calculator Class**

This class contains all the overloaded arithmetic methods and demonstrates compile-time polymorphism.

```java
class Calculator {
    // Addition with two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Addition with two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Addition with three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division (with exception handling)
    public double divide(int a, int b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed!");
            }
            return (double) a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return Double.NaN;
        }
    }
}
```

---

### **2️⃣ UserInterface Class**

Handles user input/output, menu navigation, and connects user actions with the calculator logic.

```java
import java.util.Scanner;

public class UserInterface {

    Scanner sc = new Scanner(System.in);
    Calculator calc = new Calculator();

    // Method for performing addition
    public void performAddition() {
        System.out.println("\nChoose addition type:");
        System.out.println("1. Add two integers");
        System.out.println("2. Add two doubles");
        System.out.println("3. Add three integers");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1 -> {
                System.out.print("Enter first integer: ");
                int a1 = sc.nextInt();
                System.out.print("Enter second integer: ");
                int b1 = sc.nextInt();
                System.out.println("Result: " + calc.add(a1, b1));
            }
            case 2 -> {
                System.out.print("Enter first double: ");
                double a2 = sc.nextDouble();
                System.out.print("Enter second double: ");
                double b2 = sc.nextDouble();
                System.out.println("Result: " + calc.add(a2, b2));
            }
            case 3 -> {
                System.out.print("Enter first integer: ");
                int a3 = sc.nextInt();
                System.out.print("Enter second integer: ");
                int b3 = sc.nextInt();
                System.out.print("Enter third integer: ");
                int c3 = sc.nextInt();
                System.out.println("Result: " + calc.add(a3, b3, c3));
            }
            default -> System.out.println("Invalid choice!");
        }
    }

    // Method for performing subtraction
    public void performSubtraction() {
        System.out.print("\nEnter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.println("Result: " + calc.subtract(a, b));
    }

    // Method for performing multiplication
    public void performMultiplication() {
        System.out.print("\nEnter first double: ");
        double a = sc.nextDouble();
        System.out.print("Enter second double: ");
        double b = sc.nextDouble();
        System.out.println("Result: " + calc.multiply(a, b));
    }

    // Method for performing division
    public void performDivision() {
        System.out.print("\nEnter numerator (integer): ");
        int a = sc.nextInt();
        System.out.print("Enter denominator (integer): ");
        int b = sc.nextInt();
        double result = calc.divide(a, b);
        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }
    }

    // Main menu method
    public void mainMenu() {
        int choice;
        do {
            System.out.println("\n--- Calculator Application ---");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> performAddition();
                case 2 -> performSubtraction();
                case 3 -> performMultiplication();
                case 4 -> performDivision();
                case 5 -> System.out.println("Thank you for using the calculator!");
                default -> System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);
    }

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.mainMenu();
    }
}
```

---

## 🧪 Sample Output

```
--- Calculator Application ---
1. Add Numbers
2. Subtract Numbers
3. Multiply Numbers
4. Divide Numbers
5. Exit
Enter your choice: 1

Choose addition type:
1. Add two integers
2. Add two doubles
3. Add three integers
Enter your choice: 1
Enter first integer: 10
Enter second integer: 20
Result: 30
```

---

## 🧭 How to Run This Project

### **Step 1:** Clone the Repository

```bash
git clone https://github.com/<your-github-username>/Java-Calculator-Overloading.git
```

### **Step 2:** Navigate to the Project Directory

```bash
cd Java-Calculator-Overloading
```

### **Step 3:** Compile the Java Files

```bash
javac UserInterface.java
```

### **Step 4:** Run the Application

```bash
java UserInterface
```

---

## 📖 Learning Outcomes

* Implemented **compile-time polymorphism** using method overloading.
* Gained practical understanding of **exception handling**.
* Created a **menu-driven console application** using **control structures**.
* Strengthened understanding of **object-oriented principles** such as encapsulation and modularity.

---


## 🏁 Conclusion

This project successfully demonstrates **Method Overloading** in Java by building a functional **Calculator Application**.
It showcases **compile-time polymorphism**, **exception handling**, and **OOP modular design**.
The program is clean, user-friendly, and educational — a perfect example of applying theory to practice.

---

