package assignment;

import java.util.Scanner;

public class EmployeeSystem {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee's ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Creating a Manager object
        System.out.print("Enter manager's department: ");
        String department = scanner.nextLine();
        Manager manager = new Manager(id, name, department);

        // Creating a Developer object
        System.out.print("Enter developer's programming language: ");
        String programmingLanguage = scanner.nextLine();
        Developer developer = new Developer(id, name, programmingLanguage);

        // Displaying employee details
        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.getName());
        System.out.println("ID: " + manager.getId());
        System.out.println("Department: " + manager.getDepartment());

        System.out.println("\nDeveloper Details:");
        System.out.println("Name: " + developer.getName());
        System.out.println("ID: " + developer.getId());
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());

        scanner.close();
    }
}

