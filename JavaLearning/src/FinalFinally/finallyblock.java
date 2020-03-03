package FinalFinally;

// finally block will be executed after catch block
// finally block will be executed even if catch block is not executed
// FinLLY block cannot be executed only when JVM exits i.w when system.exit is called
public class finallyblock {
	
	public static void sum() {
		// try to throw some exception
		try {
			System.out.println("this is method1");
			throw new RuntimeException("test");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Catch block is executed");
		}
		finally{
			System.out.println("finally block is executed");
		}
	}
	
	//
	public static void Division() {
		try {
			System.out.println("Division first method is called");
			int i = 4/0;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Catch block is executed");
		}
		finally{
			System.out.println("finally block is executed");
		}
	}
	//What if we handle wrong exception for the above division
		public static void Division1() {
			try {
				System.out.println("Division1 first method is called");
				int i = 4/0;
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Catch block is executed");
			}
			finally{
				System.out.println("finally block is executed");
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		finallyblock ob = new finallyblock();
//		ob.sum();
		sum();
		Division();
		Division1();
		
	}
	
	
	

}
