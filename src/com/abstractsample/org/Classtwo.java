package com.abstractsample.org;

public class Classtwo extends Classone {

	@Override
	public void teams() {
		System.out.println("Virat Kohli");	
	}
	
	public static void main(String[] args) {
		Classtwo ipl = new Classtwo();
		ipl.teams();
		ipl.csk();
		
	}
	

}
