package com.methodoverload.org;

public class Classthree extends Classtwo{
	
	private void apple(int a) {
		
		System.out.println(" Child class " + a);
		
	}
	
	private void orange() {
	
	}
	public static void main(String[] args) {
		
		Classthree abc = new Classthree();
		abc.apple(50);
		abc.orange();
		
	}

}
