package com.dsa;

public class ArmstrongNo {
	public static void main(String[] args) {
		int no = 151;
		int temp = no;
		int rem=0,rev;
		while(temp != 0) {
			rev = temp % 10;
			rem = rem + rev * rev * rev;
			temp = temp / 10;
		}
		if(no == rem) {
			System.out.println("ArmstrongNo");
		} else {
			System.out.println("Not ArmstrongNo");
		}
	}
}
