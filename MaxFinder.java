package com.generic;

public class MaxFinder {
    public static void main(String[] args) {
    	String str1 = "Apple", str2 = "Banana", str3 = "Orange";
    	findMaximum(str1,str2,str3);
    }
    private static void findMaximum(String str1, String str2, String str3) {
    	
    	String maxString = str1;
        if (str2.compareTo(str1) > 0) {
        	maxString = str2;
        }
        if (str3.compareTo(str2) > 0) {
        	maxString = str3;
        }
        System.out.println(maxString);
    
    }
}
