package com.java8.compare;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateDiffJav8Period {

	public static void main(String[] args) {
		LocalDate oldDate = LocalDate.of(1990, Month.JUNE, 7);
		LocalDate newDate = LocalDate.now();

		Period period = Period.between(oldDate, newDate);
		System.out.println(period.getYears()+"years, ");
		System.out.println(period.getMonths()+"months, ");
		System.out.println(period.getDays()+"days.");
	}

}
