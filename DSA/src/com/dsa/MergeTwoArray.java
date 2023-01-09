package com.dsa;

public class MergeTwoArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {5,6,7,8};
		int a_length = a.length;
		int b_length = b.length;
		int c_length = a_length + b_length;
		int[] c = new int [c_length];
		for(int i = 0; i<a.length; i++) {
			c[i] = a[i];
		}
		for(int i = 0; i<b.length; i++) {
			c[a_length + i] = b[i];
		}
		for(int i =0; i<c.length; i++) {
			System.out.print(c[i]+" ");
		}
	}
}
