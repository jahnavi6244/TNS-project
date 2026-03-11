package constructors;

public class ParameterizedConstructor {
	 int id;
	    String name;

	    ParameterizedConstructor(int i, String n) {
	        id = i;
	        name = n;
	    }

	    public static void main(String[] args) {

	        ParameterizedConstructor obj = new ParameterizedConstructor(2, "Mahi");

	        System.out.println(obj.id + " " + obj.name);

	    }
	

}
