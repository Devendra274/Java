/*
 * Counting Chocolates:
 * 
 * If a person buys 15 chocolates for 15Rs he/she can get 1 free chocolate for 3 wrappers.
 * Count the total chocolate received by customer.
 * 
 * Input:
 * chocolates=15
 * 
 * Output:
 * Total Chocolates=22
 * 
 */

package com.app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Chocolates to Buy::");
		int chocolates=Integer.parseInt(sc.next());
		int result = getChocolateCount(chocolates);
		System.out.println("Customer bought "+ result + " for " + chocolates + " Rs");
	}

	private static int getChocolateCount(int chocolates) {
		if(chocolates == 0) return 0;
		int wrappers = chocolates;
		int carry=0;
		
		while(wrappers > 2) {
			carry = wrappers%3;
			wrappers = wrappers/3;
			chocolates += wrappers;
			wrappers += carry;
		}
		return chocolates;
	}
}
