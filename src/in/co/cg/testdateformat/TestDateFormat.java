package in.co.cg.testdateformat;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import in.co.cg.dateformat.DateFormat;

//This class format date into "dd/mm/yyyy" and "dd month name, yyyy " format
public class TestDateFormat {
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		System.out.println("Enter any date in 8 digits(ddMMyyyy) format: ");
		String inputDate = get.next();// input date

		DateFormat dateformat = new DateFormat();
		try {
			Date date = dateformat.validDate(inputDate);// instantiating date
			System.out.println("Date in dd/mm/yyyy format = " + dateformat.dateFormatByBackSlash(date));
			System.out.println("Date in dd month name, yyyy format = " + dateformat.dateFormatByWeek(date));
		} catch (ParseException e) {

			e.printStackTrace();
		}

	}
}
