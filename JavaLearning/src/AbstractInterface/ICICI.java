// hiding the implementation details and no business logics in it and they can be asccesed in the overridden method
	//in the child clas
// a class can extend only one class but it can implement mulitple interfaces
package AbstractInterface;

public class ICICI implements RBI,USBank{

	@Override
	public void Check() {
		// TODO Auto-generated method stub
		System.out.println("check method calling");
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("credit method calling");
	}

	@Override
	public void Debit() {
		// TODO Auto-generated method stub
		System.out.println("Debit method calling");
	}

}
