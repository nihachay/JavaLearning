package Overloading;

public class Gulabjamoon extends Sweet {
	
	
	public void Laddu() {
		System.out.println("overridden child ladd method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sweet ob = new Sweet();
ob.Laddu();
String c = ob.Laddu("red");
System.out.println(c);
String colnumbers = ob.Laddu("red",5);
System.out.println(colnumbers);

// create obj of child class 
Gulabjamoon obj =new Gulabjamoon();
obj.Laddu();
String c1 = obj.Laddu("orange");
System.out.println(c1);
String colnumbers1 = obj.Laddu("orange",4);
System.out.println(colnumbers1);


	}

}
