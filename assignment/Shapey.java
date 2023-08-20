package assignment;

public class Shapey {

	interface Shape {
	    double calculateArea();
	    double calculatePerimeter();
	}

	class Circle implements Shape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }

	    @Override
	    public double calculatePerimeter() {
	        return 2 * Math.PI * radius;
	    }
	}

	class Rectangle implements Shape {
	    private double length;
	    private double width;

	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    @Override
	    public double calculateArea() {
	        return length * width;
	    }

	    @Override
	    public double calculatePerimeter() {
	        return 2 * (length + width);
	    }
	}

	class Triangle implements Shape {
	    private double side1;
	    private double side2;
	    private double side3;

	    public Triangle(double side1, double side2, double side3) {
	        this.side1 = side1;
	        this.side2 = side2;
	        this.side3 = side3;
	    }

	    @Override
	    public double calculateArea() {
	        double s = (side1 + side2 + side3) / 2;
	        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	    }

	    @Override
	    public double calculatePerimeter() {
	        return side1 + side2 + side3;
	    }
	}

	public class Main {
	    public void main(String[] args) {
	        Circle circle = new Circle(5);
	        System.out.println("Circle Area: " + circle.calculateArea());
	        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

	        Rectangle rectangle = new Rectangle(4, 6);
	        System.out.println("Rectangle Area: " + rectangle.calculateArea());
	        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

	        Triangle triangle = new Triangle(3, 4, 5);
	        System.out.println("Triangle Area: " + triangle.calculateArea());
	        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
	    }
	}
}
