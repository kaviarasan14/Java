package com.list.org;

import java.util.Iterator;
import java.util.LinkedList;

public class Listexample {
	
	public void listone() {
		
		LinkedList<String> teams = new LinkedList<String>();
		
		teams.add("Chennai");
		teams.add("mumbai");
		teams.add("banglore");
		teams.add("kolkata");
		teams.add("Delhi");
		teams.add("punjab");
		
		System.out.println(teams);
		
//		teams.clear();
//		System.out.println("after clearing");
		
		teams.remove(2);
		System.out.println("after removing 2"+teams);
		
		teams.set(2, "Gujarat");
		System.out.println("After adding 2"+ teams);
		
		System.out.println("finding particular element index"+ " "+teams.indexOf("Chennai"));
		
		System.out.println(" finding last index "+ " "+ teams.lastIndexOf("Delhi"));
		
	    LinkedList<String> newteam = new LinkedList<String>();
	    newteam.addAll(teams);
	    System.out.println("Copied from teams"+ " "+newteam);
	    
	    //Iterator<wrapperclass> refname = variablename.iterator();
	    Iterator<String> iterator = teams.iterator();
	    
	    while(iterator.hasNext())
	    {
	    	System.out.println(iterator.next());
	    }
	    
	   System.out.println("---------------------");
	   
	   Iterator<String> ipl = teams.iterator();
	   while(ipl.hasNext()) {
		   System.out.println(ipl.next());
	   }
	   
	    
	}
	public static void main(String[] args) {
		
		Listexample object= new Listexample();
		object.listone();
	}

}
	

