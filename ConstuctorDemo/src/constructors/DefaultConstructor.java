package constructors;

public class DefaultConstructor {
	 int id;
	    String name;

	    DefaultConstructor() {
	        id = 1;
	        name = "Janu";
	    }

	    public static void main(String[] args) {

	        DefaultConstructor obj = new DefaultConstructor();
	        System.out.println(obj.id + " " + obj.name);

	    }

}
