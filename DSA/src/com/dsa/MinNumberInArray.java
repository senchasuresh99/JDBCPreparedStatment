package com.dsa;

public class MinNumberInArray {
	public static void main(String[] args) {
		int[] a = {3,5,6,7,8,9};
		int min = a[0];
		for(int i = 0; i<a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}
}
