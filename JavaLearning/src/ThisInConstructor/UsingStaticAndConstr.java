package ThisInConstructor;



public class UsingStaticAndConstr {

	//Global variables/Class variables
	int age;
	String name;
	static int sal;
// initializing the value in constr
	
	public UsingStaticAndConstr() {
		System.out.println("constr calling");
		
		age=25;
		name="niharika";
	}

	static{
		System.out.println("static method calling");
		sal = 80000;
	}

	public UsingStaticAndConstr(int age,String name,int sal) {
		System.out.println("following are the details");
		this.name= name;// this keyword is used to initialize the class variables
		// syntax for this : classname.class variable = local variable
		this.age = age;
		

	}

	//instaed of printing in main method I am just creating a method to print the values
	public void printval() {

		System.out.println(name + " " + age + " " +  sal);


	}


	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingStaticAndConstr ob = new UsingStaticAndConstr();
//		UsingStaticAndConstr ob1 = new UsingStaticAndConstr(26,"niharika",80000);
//		UsingStaticAndConstr ob2 = new UsingStaticAndConstr(27,"Chay",75000);

		ob.printval();


		//System.out.println( sameUsingStatic.sal);// newly updated objects variable value is considered for sal as it is stactic

	}

}
