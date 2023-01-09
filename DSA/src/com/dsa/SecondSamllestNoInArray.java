package com.dsa;

public class SecondSamllestNoInArray {
	public static void main(String[] args) {
		int[] a = {-1,1, 3, 4, 5, 6, 7, 8, 9 };
		int sma = Integer.MAX_VALUE;
		int secSma = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i] < sma) {
				secSma = sma;
				sma = a[i];
			} else if(a[i] < secSma && a[i] != sma) {
				secSma = a[i];
			}
		}
		System.out.println(secSma);
	}
}
