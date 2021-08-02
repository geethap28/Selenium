package corejava;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Geetha";
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println("Given String : "+str);
		System.out.println("Reverse String :"+ sb);
	}
}
