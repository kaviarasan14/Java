package com.methodoverload.org;

public class Classtwo {
	
	private void apple(int a) {
		
		System.out.println("parent class" + a);

	}
	 private void orange() {
		 
	 this.apple(25);
		 
	}
	 public static void main(String[] args) {
		 
		 Classtwo abc = new Classtwo();
		 abc.orange();
		
	}
	

}
