package com.dsa;

public class MaxNumberInArray {
	public static void main(String[] args) {
		int[] a = {3,5,6,7,8,9};
		int max = a[0];
		for(int i = 0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
