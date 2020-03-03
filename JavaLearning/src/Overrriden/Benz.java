package Overrriden;

public class Benz extends BMW{

	
	public void superfast() {
		System.out.println("this is child2 normal method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// creating an obj ref of child class and calling overridn method
		BMW obj = new BMW();
		obj.start();
		obj.fast();
		obj.stop();
		obj.staticmethod();
		
		// creating an obj ref of parent class and instantiating the parent class
		Car obj1 = new Car();
		obj1.start();
		obj1.stop();
		//creating an child class obj and referring to the parent reference variable,
		//this is called as Dynamic polymormism/runtime polymorphism
	 Car obj2 = new BMW(); // this is Top Casting
	obj2.start();
	obj2.stop();
/* parent class obj is created and referenced to child class variable
	//BMW obj4Bmw = new Car(); // this is Down casting and is not possible
	BMW obj4Bmw = (BMW)new Car(); // by casting it will allow you to run but gives you a ClasscastException  
	*/
	}

}
