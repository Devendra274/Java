package com.app;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("BucketSize can be between 1 and 1000. \nEnter BucketSize:: ");
		int bucketSize = Integer.parseInt(sc.nextLine());
		while(bucketSize<1 && bucketSize>1000) {
			System.out.println("BucketSize out of range. Pls enter a vaild size");
			bucketSize = Integer.parseInt(sc.nextLine());
		}
		
		HashSetImpl hs = new HashSetImpl(bucketSize);
		
		System.out.println("\n\n---------------Add--------------------");
		hs.add(10); hs.add(21); hs.add(32); hs.add(43); hs.add(50); hs.add(67);
		List<List<Integer>> lst = hs.getBucketList();
		lst.stream().forEach(System.out::print);
		
		hs.remove(50);
		System.out.println("\n\n---------------Remove--------------------");
		lst.stream().forEach(System.out::print);
		
		System.out.println("\n\n---------------Contains--------------------");
		System.out.println(hs.contains(67));
		System.out.println(hs.contains(50));
		
	}

}
