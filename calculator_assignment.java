import java.util.Scanner;

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

    // Division
    public double divide(int a, int b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed!");
            }
            return (double) a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return Double.NaN; // Not a Number (invalid result)
        }
    }
}

public class calculator_assignment {

    Scanner sc = new Scanner(System.in);
    Calculator calc = new Calculator();

    public void performAddition() {
        System.out.println("\nChoose addition type:");
        System.out.println("1. Add two integers");
        System.out.println("2. Add two doubles");
        System.out.println("3. Add three integers");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.print("Enter first integer: ");
                int a1 = sc.nextInt();
                System.out.print("Enter second integer: ");
                int b1 = sc.nextInt();
                System.out.println("Result: " + calc.add(a1, b1));
                break;
            case 2:
                System.out.print("Enter first double: ");
                double a2 = sc.nextDouble();
                System.out.print("Enter second double: ");
                double b2 = sc.nextDouble();
                System.out.println("Result: " + calc.add(a2, b2));
                break;
            case 3:
                System.out.print("Enter first integer: ");
                int a3 = sc.nextInt();
                System.out.print("Enter second integer: ");
                int b3 = sc.nextInt();
                System.out.print("Enter third integer: ");
                int c3 = sc.nextInt();
                System.out.println("Result: " + calc.add(a3, b3, c3));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public void performSubtraction() {
        System.out.print("\nEnter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.println("Result: " + calc.subtract(a, b));
    }

    public void performMultiplication() {
        System.out.print("\nEnter first double: ");
        double a = sc.nextDouble();
        System.out.print("Enter second double: ");
        double b = sc.nextDouble();
        System.out.println("Result: " + calc.multiply(a, b));
    }

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
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    System.out.println("Thank you for using the calculator!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);
    }

    public static void main(String[] args) {
        calculator_assignment ui = new calculator_assignment();
        ui.mainMenu();
    }
}
