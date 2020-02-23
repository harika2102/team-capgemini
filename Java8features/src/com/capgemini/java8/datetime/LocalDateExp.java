package com.capgemini.java8.datetime;

import java.time.LocalDate;

public class LocalDateExp {

	public static void main(String[] args) {
		LocalDate localDate= LocalDate.now();
		System.out.println(localDate.toString());
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.getMonthValue());
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.isLeapYear());
		System.out.println(localDate.plusDays(17).toString());

	}

}
