package corejava;

public class Stringexamples {

	public static void main(String[] args) {
		String str = "Hello";
		String str1 = "geetha";
		String str2 = "Hello";
		String str3 = "HELLO";
		String str4 = " ";

		// Char at the string
		System.out.println(str.charAt(0));
		System.out.println(str1.charAt(5));
		System.out.println(str4.charAt(0));

		
		// comparing the string
		System.out.println(str.compareTo(str1));
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str4));
		System.out.println(str.compareToIgnoreCase(str3));
		

		// equals to the string
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str));
		System.out.println(str3.equals(str4));
		System.out.println(str.equalsIgnoreCase(str3));

		// Boolean string Starts
		String sboo = "This is boolean start with function";

		System.out.println(sboo.startsWith("th"));
		System.out.println(sboo.startsWith("is", 5));

		// Boolean String Ends
		System.out.println(sboo.endsWith("on"));
		System.out.println(sboo.endsWith("boo"));

		// STRING CONTAINS
		String con = "selenium concepts";
		String con1 = "core java concept";

		System.out.println(con.contains(con1));
		System.out.println(con.contains("ep"));
		
		if (con1.contains("ja")) {
			System.out.println("Example of string contains()");
		}
		if (con.contains(con1)) {
			System.out.println("Example of string contains()");
		} else {
			System.out.println("Not an example of string contains()");
		}

		//
		int g=198;
		String k="123";
		float n=g;
		double h=g;
		String s="200";
		System.out.println(n);
		System.out.println(h);
		
		System.out.println(g+k);
	System.out.println(k.concat(s));
		System.out.println();
		
	}

}
