package com.split;

public class SplitString {
	public static void main(String[] args) {
		
		String str=" 23  +  45  -  (  343  /  12  ) ";
		String[] w=str.split("\s");
		
		for(String w1:w){  
			System.out.println(w1);
		}
	}

}
