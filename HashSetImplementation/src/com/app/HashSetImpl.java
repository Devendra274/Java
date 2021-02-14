package com.app;

import java.util.LinkedList;
import java.util.List;


public class HashSetImpl {
	private int bucketSize;
	private List<List<Integer>> bucketList;
	
	public HashSetImpl(int bucketSize) {
		this.bucketSize = bucketSize;
		bucketList = new LinkedList<List<Integer>>();
		
		for(int i=0; i<bucketSize; i++) {
			bucketList.add(new LinkedList<Integer>());
		}
		
	}
	
	//--------GETTER SETTER--------------------
	public int getBucketSize() {
		return bucketSize;
	}


	public void setBucketSize(int bucketSize) {
		this.bucketSize = bucketSize;
	}


	public List<List<Integer>> getBucketList() {
		return bucketList;
	}


	public void setBucketList(List<List<Integer>> bucketList) {
		this.bucketList = bucketList;
	}


	public void add(int element) {
		int index = element % bucketSize;
		List<Integer> listInBucket = bucketList.get(index);
		if(listInBucket.isEmpty()) {
			//List<Integer> lst = new LinkedList<Integer>();
			listInBucket.add(element);
			//bucketList.set(index, lst);
		}else {
			if(!listInBucket.contains(element)) {
				listInBucket.add(element);
			}
		}
	}
	
	public void remove(int element) {
		int index = element % bucketSize;
		List<Integer> listInBucket = bucketList.get(index);
		if((!listInBucket.isEmpty()) && listInBucket.contains(element)) {
			listInBucket.remove(Integer.valueOf(element));
			
		}
	}

	public boolean contains(int element) {
		int index = element % bucketSize;
		List<Integer> listInBucket = bucketList.get(index);
		return (!listInBucket.isEmpty()) && listInBucket.contains(element);
	}
}
