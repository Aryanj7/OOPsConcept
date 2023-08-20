package assignment;

public class Student {
	
	 
	    private static int nextStudentId = 1;
	    private String name;
	    private int age;
	    private int studentId;

	    // Default constructor
	    public Student() {
	        this.name = "Unknown";
	        this.age = 0;
	        this.studentId = nextStudentId++;
	    }

	    // Parameterized constructor (name and age)
	    public Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	        this.studentId = nextStudentId++;
	    }

	    // Overloaded parameterized constructor (name, age, and studentId)
	    public Student(String name, int age, int studentId) {
	        this.name = name;
	        this.age = age;
	        this.studentId = studentId;
	    }

	    // Getter methods
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public int getStudentId() {
	        return studentId;
	    }
	}


