package Encapsulation;


public class Encapsulation {
	// private data variables: cannot be accessed directly outside the class.In order to access 
	//they need to be defined by using public getter and setter methods.
	private int id;
	private String empname;
	private int sal;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Encapsulation obj = new Encapsulation();
obj.Setid(2);
System.out.println(obj.getid());

obj.setEmpname("niharika");
System.out.println("name is "  + obj.getEmpname());
	}
	
	
	public int getid() {
		return id;
	}
	public void Setid(int id) {
		this.id =id;
	}
	
	

	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		 this.empname= empname;
	}
	

}
