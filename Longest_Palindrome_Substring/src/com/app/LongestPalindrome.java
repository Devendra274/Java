package com.app;

import java.util.Scanner;


public class LongestPalindrome {

	private int resultLength;
	private int resultStart;
	private int count;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LongestPalindrome lp = new LongestPalindrome();
		System.out.println("Enter String:: ");
		String inputStr= sc.nextLine();
		String result = lp.longestPalindromicSubstring(inputStr);
		
		System.out.println("Longest Palindrome Substring is: " + result);
		System.out.println("Count including Single Letter Palindrome: " + ++lp.count);
		System.out.println("Count excluding Single Letter Palindrome: " + (lp.count - inputStr.length()));
	}

	private String longestPalindromicSubstring(String inputStr) {
		int length = inputStr.length();
		if(length < 2) {
			return inputStr;
		}
		
		for(int start=0; start<length-1; start++) {
			checkPalindrome(inputStr, start, start);
			checkPalindrome(inputStr, start, start+1);
		}
		return inputStr.substring(resultStart, resultStart+resultLength);
	}

	private void checkPalindrome(String inputStr, int begin, int end) {
		int cnt = 0;
		while(begin>=0 && end<inputStr.length() && inputStr.charAt(begin)==inputStr.charAt(end)) {
			begin--;
			end++;
			cnt++;
		}

		count+=cnt;

		if(resultLength<end-begin-1) {
			resultStart= begin + 1;
			resultLength=end-begin-1;	
		}
	}

}
