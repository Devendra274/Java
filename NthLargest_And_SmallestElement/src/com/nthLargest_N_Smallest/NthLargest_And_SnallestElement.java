package com.nthLargest_N_Smallest;

import java.util.Scanner;

public class NthLargest_And_SnallestElement {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array1 = {60, 5, 7, 3, 20, 3, 44};
		int arraylength = array1.length;

		int[] tmp = new int[arraylength];
		
		System.out.print("Array1: [ ");
		for(int num: array1) {
			System.out.print(num + " ");
		}
		System.out.println("]"); 
		
		System.out.println("Enter number to find Nth Largest Range: [1 - " + arraylength + "] : ");
		int nthLargest = Integer.parseInt(sc.next());
		
		while(nthLargest > arraylength || nthLargest < 1) {
			System.out.println("Invalid Entry OR Number exceed the given Range");
			System.out.println("Enter number to find Nth Smallest Range: [1 - " + arraylength + "] : ");
			nthLargest = Integer.parseInt(sc.next());
		}
		
		int count = 0;
		System.out.println(nthLargest + " Largest Number is: " + findNthLargest(array1, count, tmp, nthLargest));
		
		int[] array2 = {60, 5, 7, 3, 20, 3, 44};
		arraylength = array2.length;		
		
		System.out.print("Array2: [ ");
		for(int num: array2) {
			System.out.print(num + " ");
		}
		System.out.println("]"); 
		
		System.out.println("Enter number to find Nth Smallest Range: [1 - " + arraylength + "] : ");
		int nthSmallest = Integer.parseInt(sc.next());
		
		while(nthSmallest > arraylength || nthSmallest < 1) {
			System.out.println("Invalid Entry OR Number exceed the given Range");
			System.out.println("Enter number to find Nth Smallest Range: [1 - " + arraylength + "] : ");
			nthSmallest = Integer.parseInt(sc.next());
		}
		
		System.out.println(nthSmallest + " Smallest Number is: " + findNthSmallest(array2, count, tmp, nthSmallest));
	}

	public static int findNthLargest(int[] operationArray, int cnt, int[] tmp, int nthLargest) {
		int max = 0;
		int currentPosition = 0;
		for (int i = 0; i < operationArray.length; i++) {
			if (i == 0)
				max = operationArray[i];
			else {
				if (operationArray[i] > max) {
					max = operationArray[i];
					currentPosition = i;
				}
			}
		}

		tmp[cnt] = max;
		operationArray[currentPosition] = Integer.MIN_VALUE;

		if(cnt != nthLargest-1) {
			++cnt;
			findNthLargest(operationArray, cnt, tmp, nthLargest);
		}
		
		return tmp[nthLargest-1];

	}
	
	public static int findNthSmallest(int[] operationArray, int cnt, int[] tmp, int nthSmallest) {
		int min = 0;
		int currentPosition = 0;
		for (int i = 0; i < operationArray.length; i++) {
			if (i == 0)
				min = operationArray[i];
			else {
				if (operationArray[i] < min) {
					min = operationArray[i];
					currentPosition = i;
				}
			}
		}

		tmp[cnt] = min;
		operationArray[currentPosition] = Integer.MAX_VALUE;

		if(cnt != nthSmallest-1) {
			++cnt;
			findNthSmallest(operationArray, cnt, tmp, nthSmallest);
		}
		
		return tmp[nthSmallest-1];
	}
	
}
