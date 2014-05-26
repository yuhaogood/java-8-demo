package pl.luwi.java8.demo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class JavaTimeDemo {

	public static void main(String[] args) {
		LocalDate dateOfBirth = LocalDate.of(1985, Month.MARCH, 28);
		LocalDate currentDate = LocalDate.now();	
		Period age = Period.between(dateOfBirth, currentDate);
		String ageStr = String.format("%d years %d months %d days",
				age.getYears(), age.getMonths(), age.getDays());
		System.out.println(ageStr);
		
	}
}
