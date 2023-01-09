package com.dsa;

public class PrimNo {
	public static void main(String[] args) {
		// int no = 100;
		int temp = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					temp = temp + 1;
				}
			}
			if (temp == 1) {
				System.out.print(i + " ");
			} else {
				temp = 0;
			}
		}
	}
}
