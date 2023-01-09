package com.dsa;

public class PrimNo2 {
	public static void main(String[] args) {
		int no = 5;
		int temp = 0;
		for(int i = 2; i<=no-1; i++) {
			if(no % i == 0) {
				temp = temp + 1;
			}
		}
		if(temp>0)
			System.out.println("Not PrimNo");
		else 
			System.out.println("PrimNo");
	}
}
