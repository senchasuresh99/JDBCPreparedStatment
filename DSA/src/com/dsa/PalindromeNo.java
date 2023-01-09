package com.dsa;

public class PalindromeNo {
	public static void main(String[] args) {
		int no = 123;
		int temp = no;
		int rem = 0, rev;
		while (temp != 0) {
			rev = temp % 10;
			rem = rem * 10 + rev;
			temp = temp / 10;
		}
		if(no == rem) {
			System.out.println("PalindromeNo");
		} else {
			System.out.println("Not PalindromeNo");
		}
	}
}
