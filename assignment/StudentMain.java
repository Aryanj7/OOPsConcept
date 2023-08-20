package assignment;

public class StudentMain {

	import java.util.Scanner;

	public class StudentMain {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter student's name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter student's age: ");
	        int age = scanner.nextInt();

	        // Creating a Student object using parameterized constructor
	        Student student = new Student(name, age);

	        // Displaying student details
	        System.out.println("\nStudent Details:");
	        System.out.println("Name: " + student.getName());
	        System.out.println("Age: " + student.getAge());
	        System.out.println("Student ID: " + student.getStudentId());

	        scanner.close();
	    }
	}

