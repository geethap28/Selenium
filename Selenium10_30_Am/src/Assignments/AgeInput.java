package Assignments;

import java.util.Scanner;

public class AgeInput {

	public static void main(String[] args) {

	
		System.out.println("Enter the Age :");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
	

		if (age >0 && age <=2) {
			System.out.println("Iam Infant");
		} else if (age >2 && age <=12) {
			System.out.println("Iam Child");
		} else if (age >12 && age <=25) {
			System.out.println("Iam Teenage");
		} else if (age >25 && age <=59) {
			System.out.println("Iam Adult");
		} else if (age >59 && age <=100) {
			System.out.println("Iam Sr.Citizen");
		} else {
			System.out.println("Invalid Age Input");
		}

	}

}
