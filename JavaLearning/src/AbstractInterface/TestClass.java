package AbstractInterface;

public class TestClass extends ICICI {

	public void subclass() {
		System.out.println("subtestclass method is calling");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestClass ob = new TestClass();
ob.credit();
ob.Debit();
ob.Check();
ob.subclass();
int id1 = USBank.id;
System.out.println(id1);
// trying to create interface object and oberve it will not allow to create
//RBI obj = new RBI();
// create obj of ICIC 

ICICI obj = new ICICI();
obj.credit();
obj.Debit();
obj.Check();


	}

}
