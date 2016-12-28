package com.dojo.datastructures;
import java.util.Vector;

import javax.xml.soap.Node;

public class Enumeration {
	public static void main(String[] args) {
		java.util.Enumeration<String> days;
		Vector<String> dayNames = new Vector<String>();
		dayNames.add("sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednsday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		days = dayNames.elements();
		while(days.hasMoreElements()){
			System.out.println(days.nextElement());
		}
		
	}
	

}
