package com.web.java;

import java.util.Scanner;

public class HeightInCentimeters_9 {

	
	  public static void main(String[] args) {

	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the feet:");
	        double feet = sc.nextDouble();
	        System.out.println("enter the inches:");
	        double inches = sc.nextDouble();
	        
	        double inchesToCentimeters = 2.54;
	        double feetToInches = 12;
	        
	        double totalInches = (feet * feetToInches) + inches;
	        double heightInCentimeters = totalInches * inchesToCentimeters;
	        
	        System.out.println("Height in centimeters: " + heightInCentimeters);
	    }
}
