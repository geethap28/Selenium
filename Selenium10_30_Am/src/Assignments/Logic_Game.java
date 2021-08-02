package Assignments;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Logic_Game {

	public static void main(String[] args) {

		System.out.println("Imagine any 1 Number between 10");
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		sc.close();

		int[] first = { 1, 6, 8, 10 };
		int[] second = { 5, 6, 2, 9, 10 };
		int[] third = { 9, 10, 3, 8, 5, 6, 7 };
		int[] fourth = { 7, 8, 9, 4, 10 };

		int i = first[0];
		int result=1;
		int j = second[0];
		int result1=2;
		int k = third[0];
		int result2=3;
		int l = fourth[0];
		int result3=4;
		int result4=(i+j+k+l);
		
		

		if (((i == Num) && (j != Num)) && ((i == Num) && (k != Num)) && ((i == Num) && (l != Num))) {
			System.out.println(result);
		}
		if (((j == Num) && (i != Num)) && ((j == Num) && (k != Num)) && ((j == Num) && (l != Num))) {
			System.out.println(result1);
		}
		if (((k== Num) && (i != Num)) && ((k == Num) && (j != Num)) && ((k == Num) && (l != Num))) {
			System.out.println(result2);
		}
		if (((l == Num) && (i != Num)) && ((l == Num) && (j != Num)) && ((l == Num) && (k != Num))) {
			System.out.println(result3);
		}
		else if (((i == Num) && (j== Num)) && ((i == Num) && (k== Num)) && ((i == Num) && (l== Num))) {
			System.out.println(result4);
		}
	}

}
