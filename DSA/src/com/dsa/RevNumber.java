package com.dsa;

public class RevNumber {
	public static void main(String[] args) {
		int no = 1234;
		int temp = no;
		int rem = 0, rev;
		while (temp != 0) {
			rev = temp % 10;
			rem = rem * 10 + rev;
			temp = temp / 10;
		}
		System.out.println(rem);
	}
}
