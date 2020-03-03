package Scripts1;

public class Remspaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using Regular expression we can remove spaces in astring
		String s = "this is a dog &%$&^%*";
		s= s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
	}

}
