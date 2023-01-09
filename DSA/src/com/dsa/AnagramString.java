package com.dsa;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String s1 = "AbcdE";
		String s2 = "abcdf";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean r = Arrays.equals(a, b);
		if(r == true) 
			System.out.println("AnagramString");
		else 
			System.out.println("Not AnagramString");
	}
}
