package Overrriden;

public class BMW extends Car{
@Override
	public void start() {
	System.out.println("this is child overridden method");
	}
	
	public void fast() {
		System.out.println("this is child normal method");
	}
	// static methods can't be override
	//@Override
//	public static void staticmethod() {
//		System.out.println("testing static method overriden or not");
//	}
	
	}

