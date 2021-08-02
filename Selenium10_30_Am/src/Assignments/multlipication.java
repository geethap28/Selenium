package Assignments;

import java.util.Scanner;

public class multlipication {

	public static void main(String[] args) {

// Manually enter the input
		int i=17;
		for (int j = 1; j < 11; j++) {
			int result = (j * i);
			System.out.println(i+"*" + j + "=" + result);

		}
//Based on user Input number

		System.out.println("Enter the number **** : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		for (int mul = 1; mul <= 10; mul++) {
			int result = (mul * a);
			System.out.println(a + "*" + mul + "=" + result);
		}

	}

}
