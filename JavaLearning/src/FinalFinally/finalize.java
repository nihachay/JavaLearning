package FinalFinally;

public class finalize {
// finalize method is called before the Garbage collector for cleanup  processing
	public void finalize() {
		System.out.println("finalize is calling before gc to cleanup the processing");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalize ob = new finalize();
		ob=null;
		System.gc();
		
	}
	
	
	

}
