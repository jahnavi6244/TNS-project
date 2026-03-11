package ooppackage;

public class Student { //encapsulation
	private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.setId(100);
        System.out.println("Student ID: " + s.getId());
    }

}
