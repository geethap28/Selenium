package corejava;

public class DuplicatesNumber_InAnArray {

	public static void main(String[] args) {
		int[] abc = { 1, 2, 6, 7, 4, 1, 25, 7,5,3,47 };

		for (int i = 0; i < abc.length; i++) {

			for (int j = i; j < abc.length; j++) {
				if (abc[i] == abc[j]) {
					System.out.println(abc[j]);
				}
			}
		}

	}
}