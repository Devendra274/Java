package com.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibnonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer::");
		int num=Integer.parseInt(sc.next());
		
		System.out.println("------------Recursive--------------------");
		int recursiveResult = getFibonacciRecursiveImpl(num);
		System.out.println("Recursive Result: " + recursiveResult);
		
		for(int i = 0; i < num; i++){
			System.out.print(getFibonacciRecursiveImpl(i) +" ");
		}
		
		System.out.println("\n------------Iterative--------------------");
		getFibonacciIterativeImpl(num);
		
	}

	private static void getFibonacciIterativeImpl(int num) {
		int n1=0, n2=1;
		int n3;
		System.out.print(n1 + " " + n2 + " ");
		for(int i = 2; i < num ; i++){
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(n3 + " ");
		}
		
	}

	private static int getFibonacciRecursiveImpl(int num) {
		if(num<=1) return num;
		
//		System.out.println("NUM: "+ num);
		return getFibonacciRecursiveImpl(num-1) + getFibonacciRecursiveImpl(num-2);
		
	}

}
