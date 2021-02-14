package com.app;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:: ");
		String word = sc.nextLine();
		boolean result = checkString(word);
		
		if(result) System.out.println(word + "is a valid word");
		else System.out.println(word + " is an invalid word");

	}
	
	public static boolean checkString(String word){
		
		if(word.length()<=1) return false;
		Predicate<Character> rightCase = Character::isLowerCase;
		
		if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
			rightCase = Character::isUpperCase;
		}
		
		for(int i=1; i<word.length()-1; i++) {
			if(!rightCase.test(word.charAt(i))) {
				return false;
			}
		}
		return true;
		
	}

}
