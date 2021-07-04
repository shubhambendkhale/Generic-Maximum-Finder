package com.generic;

public class MaxFinder {
	public static void main(String[] args) {
		String firstString = "Apple";
		String secondString = "Peach";
		String thirdString = "Banana";
		
		Integer firstIntNumber = 12;
		Integer secondIntNumber = 15;
		Integer thirdIntNumber = 20;
		
		Double firstDoubleNumber = 120.2;
		Double secondDoubleNumber = 150.2;
		Double thirdDoubleNumber = 200.3;
		
		getMax(firstString,secondString,thirdString);  // method for string
		getMax(firstIntNumber,secondIntNumber,thirdIntNumber); // method for integer
		getMax(firstDoubleNumber,secondDoubleNumber,thirdDoubleNumber);  // method for double
	}
	private static <T extends Comparable<T>> void getMax(T firstString, T secondString, T thirdString) {
		T max = firstString;
		
		// using java compareTo method to test maximum
		if (secondString.compareTo(max) > 0)
			max = secondString;
		if (thirdString.compareTo(max) > 0)
			max = thirdString;
		System.out.println("The Maximum is : " +max);
	}
}
