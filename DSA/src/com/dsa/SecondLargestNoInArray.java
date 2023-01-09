package com.dsa;

public class SecondLargestNoInArray {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 5, 6, 7, 8, 9 };
		int largest = Integer.MIN_VALUE;
		int seclargest = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > largest) {
				seclargest = largest;
				largest = a[i];
			} else if(a[i] > seclargest && a[i] != largest) {
				seclargest = a[i];
			}
		}
		System.out.println(seclargest);
	}
}
