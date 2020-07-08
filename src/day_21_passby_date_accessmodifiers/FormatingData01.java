package day_21_passby_date_accessmodifiers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatingData01 {

	public static void main(String[] args) {
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd - MMM - yy");//we can chan format"dd/MM/yyyy","MM,dd,yy"
		LocalDate date=LocalDate.now();
		dtf.format(date);
		System.out.println(dtf.format(date));
		
	}

}
