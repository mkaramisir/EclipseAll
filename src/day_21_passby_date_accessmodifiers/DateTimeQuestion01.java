package day_21_passby_date_accessmodifiers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeQuestion01 {

	public static void main(String[] args) {
		/*take current date in the format 11/3/2020
		 * add 1 year, 2 months and 11 days.
		 * print on the console
		 * output 2021-05-22
		 */
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate date=LocalDate.now().plusDays(11).plusMonths(2).plusYears(1);
	System.out.println(df.format(date));
	}

}
