package assignment;

public class Employee {

	  private int id;
	    private String name;

	    public Employee(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	        
	        class Manager extends Employee {
	            private String department;

	            public Manager(int id, String name, String department) {
	                super(id, name);
	                this.department = department;
	            }

	            public String getDepartment() {
	                return department;
	            }
	        }

	        class Developer extends Employee {
	            private String programmingLanguage;

	            public Developer(int id, String name, String programmingLanguage) {
	                super(id, name);
	                this.programmingLanguage = programmingLanguage;
	            }

	            public String getProgrammingLanguage() {
	                return programmingLanguage;
	            }
	        }
	    }
	}

