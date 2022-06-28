package com.contructor.org;

public class Classone {
	
	public Classone() {
		
	System.out.println("Parameterized Constructor..");
	}
	
	public Classone(int a) {
		
		System.out.println(" Non parameterized "+ a);
	}
	
	public static void main(String[] args) {
		
		Classone abc = new Classone();
		Classone bcd = new Classone(130);
		
		
	}
	

}
