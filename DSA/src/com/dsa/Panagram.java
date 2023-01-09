package com.dsa;

public class Panagram {
	public static void main(String[] args) {
		String s = "qwertyuiopasdfghjklzxcvBaaaaaa";
		System.out.println(isPanagram(s.toLowerCase()));
	}
	public static boolean isPanagram(String s) {
		if(s.length()<26) {
			return false;
		} else {
			for(char c='a'; c<='z'; c++) {
				if(s.indexOf(c)<0) {
					return false;
				}
			}
		}
		return true;	
	}
}
