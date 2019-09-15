package com.java8.compare;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateDiffJav8 {

	public static void main(String[] args) {
		LocalDate dateOfBirth = LocalDate.of(1990, Month.JUNE, 07);
		LocalDate currentDate = LocalDate.now();
		
		long diffDays = ChronoUnit.DAYS.between(dateOfBirth, currentDate);
		long diffMonths = ChronoUnit.MONTHS.between(dateOfBirth, currentDate);
		long diffYears = ChronoUnit.YEARS.between(dateOfBirth, currentDate);
		
		System.out.println("diffDays: "+diffDays+" ,diffMonths: "+diffMonths+", diffYears: "+diffYears);

	}

}
