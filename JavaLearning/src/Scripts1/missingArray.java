package Scripts1;

import java.lang.reflect.Array;

public class missingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[] = {1,2,4,5,6};
   int sum = 0;
   for (int i=0;i<a.length;i++)
   {
	   sum =sum + a[i];
	   //System.out.println(sum);
   }System.out.println(sum);
   
   int sum1 = 0;
   for(int j=1;j<6;j++)
   {
	   sum1 = sum1+j;
	   
   }System.out.println(sum1);
   System.out.println(sum-sum1);
	}

}
