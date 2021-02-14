package com.app;

import java.util.Scanner;

public class SubtractDate {
	private int date;
	private int month;
	private int year;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SubtractDate sd = new SubtractDate();
		sd.date=sc.nextInt();
		sd.month=sc.nextInt();
		sd.year=sc.nextInt();
		
		sd.subtractDateByOne();
		System.out.println("Date:: " + sd.date + "/" + sd.month + "/" + sd.year);
	}

	private void subtractDateByOne() {
		if(date==1) {
			if(month==3 && checkLeapYear()) {
				date=29;
				month--;
				return;
			}else if(month==3){
				date=28;
				month--;
				return;
			}
			
			if(month==1) {
				date=31;
				month=12;
				year--;
			}else if(month==2 || month==4 || month==6 || month==9 || month==11){
				date=31;
				month--;
				return;
			}else {
				date=30;
				month--;
				return;
			}
		}
		date--;
	}

	private boolean checkLeapYear() {
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0)
					return true;
				else
					return false;
			}else
				return true;
		}
		return false;		
	}
}
