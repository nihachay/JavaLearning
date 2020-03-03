package palendromeprimeArmstrngFactorial;

public class Arrays_minandMaxvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {1,333,45,6,3};
		int max= a[0];
		for(int i=1;i<a.length;i++){
		
			if(a[i]>max) {
				max= a[i];
			}
			
		}System.out.println("maximium value is " + max);
		
		// minimum value in array
		
		int[] b = {23,5,346,5};
	 int min = b[0];
	 for(int j =1; j<b.length;j++) {
		 if(min>b[j]) {
			 min = b[j];
			 		 }
	 }System.out.println(min);
	}
	
	

}
