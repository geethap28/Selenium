package corejava;

public class NestedForLoopSample {

	public static void main(String[] args) {
		for (int i = 0; i <= 2; i++) {
			System.out.println(i);
			for (char j = 'a'; j < 'c'; j++) {
				System.out.println(j);
			}
		}
	}
}
