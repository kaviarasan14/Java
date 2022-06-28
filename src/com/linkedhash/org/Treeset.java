package com.linkedhash.org;

import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		
		treeset.add(30);
		treeset.add(20);
		treeset.add(40);
		treeset.add(25);
		treeset.add(35);
		treeset.add(45);
		//first()returns first element 
		System.out.println("First element " + " "+treeset.first());
       //last() returns last element
		System.out.println("Last element"+" "+treeset.last());
      //tailset() returns element from that including that element 
		System.out.println("Tailset from 20"+" "+treeset.tailSet(20));
//		subset() returns all the elements between
		System.out.println("Subset from 20 to 40"+ " "+treeset.subSet(20, 45));
//		compare() if the program is sorted by default
		System.out.println(treeset.comparator());
//		higher() returns thehigher value after that
		System.out.println("Higher value"+ " "+treeset.higher(40));
//		lower() returns lower value after that 
		System.out.println("lower value"+ " "+treeset.lower(25));
//		descendingorder() returns the element in des
		System.out.println("Descending Order"+ " "+treeset.descendingSet());
//		pollfirst() returns first element and removes from the list
		System.out.println(treeset.pollFirst());
//		polllast() returns last elemt and removes form list 
		System.out.println(treeset.pollLast());
		System.out.println(treeset);
		
		
	}

}
