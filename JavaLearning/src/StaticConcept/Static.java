package StaticConcept;

public class Static {
	//static varaibales or methods are not part of objects

	static int age = 25;// Static global variable
	String name = "niharika"; // non static global variablke


	public void sendmail() {
		System.out.println("sendmail");
	}

	public static void sum() {
		System.out.println("sum");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calling static methods in two ways
		sum(); // Directly calling method
		Static.sum(); // calling with classname

		//Calling static variables in two ways
		System.out.println(age);// Directly calling variable
		System.out.println(Static.age);// calling with classname

		//Also we can ascess static methods or variables using objects
		Static ob = new Static();
		System.out.println(ob.name);
		System.out.println(ob.age);
		ob.sum();// can ascess but it is giving warning that it should be acessed in static way(its not a good practise)
		ob.sendmail();
	}

}
