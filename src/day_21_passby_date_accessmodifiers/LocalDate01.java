package day_21_passby_date_accessmodifiers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDate01 {

	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDate.now().plusDays(1));//1 day after current date
		System.out.println(LocalDate.now().plusMonths(2));//2 months after current date
		System.out.println(LocalDate.now().plusYears(7));//7 year after current date
		
		System.out.println(LocalDate.now().minusDays(31));
		System.out.println(LocalDate.now().minusMonths(2));		
		System.out.println(LocalDate.now().minusYears(32));
	}

}
