package com.java8.compare;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Jav8DateCom {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sfd = new SimpleDateFormat("YYYY-MM-dd");
		Date date1 = sfd.parse("2019-03-04");
		Date date2 = sfd.parse("2019-03-04");
		
		System.out.println("date1 :"+sfd.format(date1));
		System.out.println("date2 :"+sfd.format(date2));
		
		if(date1.after(date2)) System.out.println("Date1 is After Date2");
		if(date1.before(date2)) System.out.println("Date1 is before Date2");
		if(date1.equals(date2)) System.out.println("Date1 is equal Date2");
	}

}
