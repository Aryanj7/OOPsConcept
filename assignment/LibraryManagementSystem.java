package assignment;

class LibraryItem {
 private String title;
 private int itemID;

 public LibraryItem(String title, int itemID) {
     this.title = title;
     this.itemID = itemID;
 }

 public String getTitle() {
     return title;
 }

 public int getItemID() {
     return itemID;
 }

 public void displayInfo() {
     System.out.println("Title: " + title);
     System.out.println("Item ID: " + itemID);
 }
}

class Book extends LibraryItem {
 private String author;

 public Book(String title, int itemID, String author) {
     super(title, itemID);
     this.author = author;
 }

 public String getAuthor() {
     return author;
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Author: " + author);
 }
}

class DVD extends LibraryItem {
 private int duration;

 public DVD(String title, int itemID, int duration) {
     super(title, itemID);
     this.duration = duration;
 }

 public int getDuration() {
     return duration;
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Duration: " + duration + " minutes");
 }
}

abstract class LibraryMember {
 private int memberID;
 private String name;

 public LibraryMember(int memberID, String name) {
     this.memberID = memberID;
     this.name = name;
 }

 public int getMemberID() {
     return memberID;
 }

 public String getName() {
     return name;
 }

 public abstract void borrowItem(LibraryItem item);
}

interface Reservable {
 void reserveItem(LibraryItem item);
}

class StudentMember extends LibraryMember {
 public StudentMember(int memberID, String name) {
     super(memberID, name);
 }

 @Override
 public void borrowItem(LibraryItem item) {
     System.out.println(getName() + " (Student) is borrowing " + item.getTitle());
 }
}

class FacultyMember extends LibraryMember {
 public FacultyMember(int memberID, String name) {
     super(memberID, name);
 }

 @Override
 public void borrowItem(LibraryItem item) {
     System.out.println(getName() + " (Faculty) is borrowing " + item.getTitle());
 }
}

public class LibraryManagementSystem {
 public static void main(String[] args) {
     LibraryItem book = new Book("The Great Gatsby", 101, "F. Scott Fitzgerald");
     LibraryItem dvd = new DVD("Inception", 201, 148);

     book.displayInfo();
     System.out.println();
     dvd.displayInfo();
     System.out.println();

     
     LibraryMember student = new StudentMember(1001, "John Doe");
     LibraryMember faculty = new FacultyMember(2001, "Prof. Smith");

     
     student.borrowItem(book);
     faculty.borrowItem(dvd);
 }
}

