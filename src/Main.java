import java.util.Scanner;

// Define a class to represent an employee
class Employee {
    String name; // Name of the employee
    double salary; // Salary of the employee

    // Constructor to initialize name and salary
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Define a class to calculate salary operations
class SalaryCalculator {
    // Method to calculate bonus
    double calculateBonus(double salary) {
        double bonus = salary * 0.1; // Calculate 10% bonus
        return bonus; // Return the calculated bonus
    }
}

// Main class to run the application
public class MyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt user to enter their salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Create Employee and SalaryCalculator objects
        Employee employee = new Employee(name, salary);
        SalaryCalculator calculator = new SalaryCalculator();

        // Display employee details and calculate bonus
        employee.display();
        double bonus = calculator.calculateBonus(salary);
        System.out.println("Bonus: " + bonus);
    }
}