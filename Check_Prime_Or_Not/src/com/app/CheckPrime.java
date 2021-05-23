package com.app;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 2;
		System.out.println("Enter Number Range: [2 - 1030]: ");
		int number = Integer.parseInt(sc.next());
		
		while(number<2 || number>1030) {
			System.out.println("Number Must be between 1-1030 ONLY \nEnter Number Range: [2 - 1030]:");
			number = Integer.parseInt(sc.next());
		}
		
		if(number % a == 0) {
			System.out.println(number + " is not a Prime Number");
		} else {
			System.out.println(checkPrime(a, number));
		}
		
	}
	
	//For Number less than 1031
	public static String checkPrime(int a, int number) {
		String result = number + " is not a Prime Number";
		
		if(((int)(Math.pow(a, number-1) % number)) == 1) {
			result = number + " is a Prime Number";
			return result;
		}
		
		return result;
	}

}
