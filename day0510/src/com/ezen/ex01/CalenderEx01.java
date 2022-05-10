package com.ezen.ex01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalenderEx01 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		System.out.println("이 해의 연도 : " + today.get(Calendar.YEAR));
		System.out.println("월(0~11, 0:1월) : " + today.get(Calendar.MONTH));
		System.out.println("이 해의 몇째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("=====================");
		
		System.out.println("이 달의 몇일 : " + today.get(Calendar.DATE));
		System.out.println("이 달의 몇일 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇일 : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1~7 1:일요일) : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("이 달의 몇 째 요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("=====================");
		
		System.out.println("오전, 오후(0:오전, 1:오후) : " + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
		System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : " + today.get(Calendar.MINUTE));
		System.out.println("초 : " + today.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999) : " + today.get(Calendar.MILLISECOND));
		System.out.println("timezone(-12+12) : " + today.get(Calendar.ZONE_OFFSET));
		System.out.println("이 달의 마지막 날 : " + today.getActualMaximum(Calendar.DATE));
		System.out.println("=====================");
		
		TimeZone tz;
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss (z Z)");
		
		tz = TimeZone.getTimeZone("Asia/Seoul");
		df.setTimeZone(tz);
		System.out.format("%s%n%s%n%n", tz.getDisplayName(), df.format(date));
	}
}


















