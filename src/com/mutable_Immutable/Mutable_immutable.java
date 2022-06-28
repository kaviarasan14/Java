package com.mutable_Immutable;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


public class Mutable_immutable {
	public static void main(String[] args) {
		//Immutable
		
		int a[]  = new int [5];
		
		Integer []b = {10,20,30,50};
		List<Integer> l = Arrays.asList(b);
		
		System.out.println(l);
		
		ListIterator<Integer> itr = l.listIterator();
		
		while(itr.hasNext()) {
			Integer value = itr.next();
			System.out.println(value);
		}
		
	}
}
