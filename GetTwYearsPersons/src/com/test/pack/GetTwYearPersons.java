package com.test.pack;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GetTwYearPersons {

	public static void main(String[] args) {
		List<LocalDate> dates = new ArrayList<>();
		dates.add(LocalDate.of(1999, Month.APRIL, 23));
		dates.add(LocalDate.of(2001, Month.JULY, 6));
		dates.add(LocalDate.of(2002, Month.FEBRUARY, 8));
		dates.add(LocalDate.of(1990, Month.DECEMBER, 23));
		dates.add(LocalDate.of(1995, Month.MARCH, 6));
		dates.add(LocalDate.of(1994, Month.MAY, 2));
		dates.add(LocalDate.of(2015, Month.APRIL, 3));
		
		dates.stream().filter(x-> (21>(Period.between(x, LocalDate.now()).getYears()))).forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		/*for (LocalDate localDate : dates) {
			
			if(21>Period.between(localDate, LocalDate.now()).getYears()) System.out.println(localDate+" date of years: "+Period.between(localDate, LocalDate.now()).getYears());
			
		}*/
		
		
	}

}
