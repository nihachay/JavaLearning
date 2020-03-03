package ThisInConstructor;

public class ThisConstructor {

	//Global variables/Class variables
	int age;
	String name;
	static int sal;
	
	public ThisConstructor() {
		System.out.println("constr calling");
	}
	
	public ThisConstructor(int age,String name,int sal) {
		System.out.println("following are the details");
		this.name= name;// this keyword is used to initialize the class variables
		// syntax for this : classname.class variable = local variable
		this.age = age;
		this.sal =sal;
	}
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConstructor ob = new ThisConstructor();
		ThisConstructor ob1 = new ThisConstructor(26,"niharika",80000);
		ThisConstructor ob2 = new ThisConstructor(27,"Chay",75000);
		
		System.out.println(ob1.name);
		
		System.out.println(ob1.age);
		
		
		System.out.println( ThisConstructor.sal);// newly updated objects variable value is considered for sal as it is stactic
		
	}

}
