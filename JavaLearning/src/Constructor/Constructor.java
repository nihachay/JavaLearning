package Constructor;
//constructor is a memeber method
// name of the constr and class name shold be same
//When an object si created,by default a default constructor will be invoked
//With constr we can initialize variables by using this keyword
//We have more than one constructor with different paramets i.e constructor overloading
//Constructor can't be static
// constructor doen't return anything
// memory to the object can be assignd with the help of constructor

public class Constructor {

	
	public Constructor() { // default const with no param
		System.out.println( "Default const");
	}
	
	public Constructor(int i) { // 1 parm constr
		System.out.println( "Default const");
		System.out.println(i);
	}
	
	public Constructor(int i,int j) { // 2 param const
		System.out.println( "Default const");
		System.out.println(i + " " + j);
	}
	
	
	
	@SuppressWarnings({ "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor ovb = new Constructor();
		Constructor ob = new Constructor(10);
		Constructor ob1 = new Constructor(10,20);
		
		
		
	}

}
