package Scripts1;

public class LarSmallNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 11, 23, 5, 2143, 1 };
		int lar = a[0];
		int smal = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>lar)
				
			{
				lar= a[i];
			}
			else if(a[i]<smal)
			{
				smal = a[i];
			}	
		}System.out.println(lar);
		System.out.println(smal);
	}

}
