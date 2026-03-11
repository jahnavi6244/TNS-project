package constructors;

public class ConstructorOverloading {
	 int id;
	    String name;

	    ConstructorOverloading() {
	        id = 0;
	        name = "Unknown";
	    }

	    ConstructorOverloading(int i, String n) {
	        id = i;
	        name = n;
	    }

	    public static void main(String[] args) {

	        ConstructorOverloading s1 = new ConstructorOverloading();
	        ConstructorOverloading s2 = new ConstructorOverloading(3, "Janu");

	        System.out.println(s1.id + " " + s1.name);
	        System.out.println(s2.id + " " + s2.name);

	    }

}
