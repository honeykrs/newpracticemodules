package com.practice.algorithms;

import com.resources.utility.Utility;

/**
 * Method to find day for a given date
 * @author Honey
 *
 */
public class CalculateDay
{
	public static void main(String[] args)
	{
	  	
	  System.out.println("Enter day: ");
	  int day = Utility.getInt();
	  System.out.println("Enter month: ");
	  int month = Utility.getInt();
	  System.out.println("Enter year: ");
	  String year = Utility.getStringAsWord();
	  
	  int res = Utility.findDay(day,month,year);
	  
	   System.out.println("Day is " + Utility.decideDay(res));  
	  System.out.println("day : "+ res);
	}
}
