package Assignments;

import java.text.*;
import java.time.LocalDate;
import java.util.Date;

public class dateformat {

	public static void main(String[] args) {

		// To display today date :
		LocalDate date = LocalDate.now();
		System.out.println("Today's Date : " + date);

		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat(" E DD-MM-YYYY");
		sdf.format(d);

	}
}