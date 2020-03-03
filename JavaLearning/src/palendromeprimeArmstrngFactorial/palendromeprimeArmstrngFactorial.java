package palendromeprimeArmstrngFactorial;


public class palendromeprimeArmstrngFactorial {

	//Factorial : 3!= 3*2*1

	public static int factorial(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact = fact*i;
			//System.out.println(fact);
		}
		return fact;
	}

	//Prime number: 2,3,5 : divisible by 1 and itself

	public static boolean prime(int num) {
		//int num = 3;
		for(int i=1;i<=num;i++) {
			if(num/i == 0) {
				return false;
			}
		}
		return true;
	}
	//Palendrome : 151

	public static void palendrome(int n1) {

		int sum=0;
		int r=0;
		int t =n1 ;
		//int n;

		//int t=n1;
		while(n1>0) {
			r = n1%10;
			sum = (sum*10)+r;
			n1 = n1/10;
		}

		if(t==sum) {
			System.out.println("palendrome");
		}
		else {
			System.out.println("not palendrome");
		}

	}
	//Armstrong : 123 : 1*1*1 + 2*2*2 =3*3*3 = 1+8+27 =36
	public static void Armstrong(int n2) {

		int cube=0;
		int r=0;
		int t =n2 ;
		while(n2>0) {
			r = n2%10;
			cube = cube+(r*r*r);
			n2 = n2/10;
		}

		if(t==cube) {
			System.out.println("Armstrng");
		}
		else {
			System.out.println("not Armstrng");
		}

	}


	public static void main(String args[]) {
		// TODO Auto-generated method stub


		System.out.println(factorial(2));
		System.out.println(prime(5));
		palendrome(151);
		Armstrong(123);

	}

}
