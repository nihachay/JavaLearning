package Overloading;

public class Sweet {
	
	//creating a constructor
	public Sweet() {
		System.out.println("constructor is calling");
	}
	
	String color;
	int no;
	// no input and no output normal method
	public void Laddu() {
		System.out.println("first method");
	}
	//1 parametr overloaded method
 public String Laddu(String color) {
	 System.out.println("red in color");
	 return color;
 }
 //2 parm overloaded method
 public String Laddu(String color,int no) {
	 System.out.println("red in color and count is 2");
	 String colnumber = color + no ;
	  return colnumber;
 }
}
