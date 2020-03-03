

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "niha";
		String s2 = "chay";
		String s3 = "sony";
		String s4= "hello";
		String s5 = " flag";
		String s6="niha";
		String s7="CHAY";
		String s8 = "";
		String s9 = "test";
		
		System.out.println(s1.length());
		System.out.println(s2.charAt(1));
		/*System.out.println(s1.codePointAt(2));*/
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s4.compareTo(s5));
		System.out.println(s5.trim() + s4);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s6));
		System.out.println(s2.equalsIgnoreCase(s7));
		System.out.println(s3.concat(s5));
		System.out.println(s3.toUpperCase());
		System.out.println(s7.toLowerCase());
		System.out.println(s1.contains(s2));
		System.out.println(s1.contains(s6));
		System.out.println(s1.contentEquals(s6));
		System.out.println(s1.endsWith(s6));
		System.out.println(s2.endsWith(s3));
		System.out.println(s5.endsWith("ag"));
		System.out.println(s2.isEmpty());
		System.out.println(s8.isEmpty());
		System.out.println(s7.valueOf(true));
		System.out.println(s9.valueOf(s7));/* this will convert any value to string,boolean,char,float etc..*/
		
		
		
		

	}

}
