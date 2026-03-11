package constructors;

public class Student {
	

	    int id;
	    String name;

	    // Constructor
	    Student(int i, String n) {
	        id = i;
	        name = n;
	    }

	    void display() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	    }

	    public static void main(String[] args) {

	        Student s1 = new Student(101, "Janu");
	        Student s2 = new Student(102, "Mahi");

	        s1.display();
	        s2.display();

	    }
}


