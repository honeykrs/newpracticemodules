package com.practice.algorithms;

import com.resources.utility.Utility;

public class NewtonSqrRoot 
{

	public static void main(String[] args)
	{
		System.out.println("Enter a number whose SquareRoot you want to find: ");
		double c = Utility.getDouble();
		
		double t = Utility.calNewtonSqrt(c);
		    
		// print out the estimate of the square root of c
		System.out.println(t);
		
	}

}
