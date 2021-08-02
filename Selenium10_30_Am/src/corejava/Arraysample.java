package corejava;

public class Arraysample {

	public static void main(String[] args) {
		String[] a={"Hi All", "How Are You", "Welcome to array ","Hi All"};
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if (a[i].equals(a[j])){
				System.out.println(a[i]);
			}
		}
	}
	}

}
