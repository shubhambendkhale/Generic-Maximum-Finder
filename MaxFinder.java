package com.generic;

public class MaxFinder {
    public static void main(String[] args) {
    	Double a = 2.5, b = 4.6, c = 5.9;
    	findMaximum(a,b,c);
    }
    private static void findMaximum(Double a, Double b, Double c) {
    	
    	Double max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println(max);
    
    }
}