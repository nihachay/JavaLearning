package Scripts1;

// creating two id and names using parametrized constructor
public class paraConst{
	
	int id1;
	String name1;
	
	 paraConst(int id,String name)
	{
		 this.id1 = id;
		 this.name1 = name;
	}
	 
	 void calling()
	 {
		
		System.out.println("id is"+id1+"name is"+name1); 
	 }

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	
	 paraConst obj1 = new paraConst(1," Chay");
	 paraConst obj2 = new paraConst(2,"Niha");
	 
	 obj1.calling();
	 obj2.calling();
	 
	 
}
}