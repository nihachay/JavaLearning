package ThisInConstructor;

// if you dont't need an object to call then we can give it as static
//to call a method directly or by using its class we declare it as static and for that we don't need to create an object

public class sameUsingStatic {

	//Global variables/Class variables
	int age;
	String name;
	static int sal;

	

//	static{
//		System.out.println("static method calling");
//		sal = 80000;
//	}

	public sameUsingStatic(int age,String name,int sal) {
		System.out.println("following are the details");
		this.name= name;// this keyword is used to initialize the class variables
		// syntax for this : classname.class variable = local variable
		this.age = age;
		this.sal = sal;

	}

	//instaed of printing in main method I am just creating a method to print the values
	public void printval() {

		System.out.println(name + " " + age + " " +  sal);


	}


	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sameUsingStatic ob1 = new sameUsingStatic(26,"niharika",80000);
		sameUsingStatic ob2 = new sameUsingStatic(27,"Chay",75000);

		ob1.printval();


	//	System.out.println( sameUsingStatic.sal);// newly updated objects variable value is considered for sal as it is stactic

	}

}
