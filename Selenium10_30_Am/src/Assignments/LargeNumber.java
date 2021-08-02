package Assignments;

public class LargeNumber {

	public static void main(String[] args) {

		int[] abc = { 3, 435, 67, 677, 23432423, 4546, 767967 };

		int large = abc[0];
		int small = abc[0];

		for (int i = 0; i < abc.length; i++) {
			if (abc[i] > large) {
				large = abc[i];
			}
			else if (abc[i] < small) {
				small=abc[i];
			}
		}
		System.out.println(large);
		System.out.println(small);
	}

}
