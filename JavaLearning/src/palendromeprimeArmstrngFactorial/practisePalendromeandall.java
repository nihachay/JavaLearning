package palendromeprimeArmstrngFactorial;

public class practisePalendromeandall {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//prime
//		int num = 9;
//		int temp = 0;
//		for(int i=2;i<=num;i++) 
//		{
//			if(num%i ==0) {
//				temp = temp+1;
//			}
//			
//		}	
//		if (temp>0) {
//			 
//		    System.out.println(num + " not a prime Number");
//		    }
//	else if(temp==0){
//		
//		System.out.println(" prime");
//}
//		//Palendrome - 151
//		
//		int n= 121;
//		int sum =0;
//		int r=0;
//		int t;
//		t=n;
//		while(n>0) {
//			r = n%10; // 1.. 2..1
//			sum = (sum*10)+r; // 1 .. 12
//			n = n/10; // 12 // 1 //
//					}
//		if(t==sum) {
//			System.out.println("palendrome");
//		}
//		else {
//			System.out.println(n + " is not a palendrome");
//		}
////Armstrong 123--1*1*1+2*2*2+3*3*3=1+8+27=26
//		// 153 = 1*1*1+5*5*5+3*3*3 = 1+125+27 = 153
//		
//		int no = 153;
//		int cube = 0;
//		int rem = 0;
//		int tmp =no;
//		
//		while(no>0) {
//			rem = no%10;
//			cube = cube +(rem*rem*rem);
//			no = no/10;
//					}
//		if(tmp==cube) {
//			System.out.println(cube + " is Armstrng");
//		}
//		else {
//			System.out.println("not an Armstrong");
//		}
//		
//	//factorial
//		int nn = 3;
//		int fact = 1;
//		for(int i=1;i<=nn;i++) {
//			fact = fact * i;
//			
//		}System.out.println(fact);

		//fibnocci - 1 2 3 5 7 -- 
		
		int a =0;
		int b =1;
		int  n =4;
		System.out.println(a + " " + b);
		int c;
		for(int i=1;i<=n;i++) {
			c= a+b; // 1
			System.out.println(c);
			a=b; //1, 1
			b=c;// 1, 2 
				}
		
}
}