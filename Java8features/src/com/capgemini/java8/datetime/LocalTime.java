package com.capgemini.java8.datetime;

import java.time.LocalDateTime;

public class LocalTime {

	public static void main(String[] args) {
		LocalDateTime localDateTime= LocalDateTime.now();
		System.out.println(localDateTime.toString());
		System.out.println(localDateTime.getDayOfMonth());
		System.out.println(localDateTime.getHour());
		System.out.println(localDateTime.getMonthValue());
		System.out.println(localDateTime.getDayOfWeek());
	}

}
