package corejava;

public class Myfirstprogram {

	public static void test() {
		int a = 30;
		int b = 50;
		System.out.println("Welcome To Test Method");
		int Result = a + b;
		System.out.println(Result);
	}

	String mystring = "New  String";

	public static void main(String[] args) {
		System.out.println("Welcome to CoreJava");

		int a = 10;
		int b = 20;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);

		System.out.println("*************");
		test();

		Myfirstprogram obj = new Myfirstprogram();
		Myfirstprogram obj1 = new Myfirstprogram();

		System.out.println(obj.mystring);
		System.out.println(obj1.mystring);
		obj.test();
		System.out.println("**********");
		obj1.mystring = "updated New String";
		System.out.println(obj.mystring);
		System.out.println(obj1.mystring.toUpperCase());

		String str = "String is assigned";
		System.out.println(str + " " + obj1.mystring);

	}

}
