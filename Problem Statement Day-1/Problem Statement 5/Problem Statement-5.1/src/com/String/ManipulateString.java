package com.String;

public class ManipulateString {
	public static void main(String[] args) {
		
		String str="JAVA is Simple";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		String[] words=str.split("\s");
		for(String w:words){  
			System.out.print(w.charAt(0)); 
			System.out.print(" ");
		}
		
		String[] words1=str.split("\s"); // Change order 
		for(String w:words1){
			System.out.print("\n"+w); 
		}
        StringBuilder str2= new StringBuilder("JAVA is Simple");
		StringBuilder rev =str2.reverse();
		System.out.println("\nReverse String = " + rev.toString());
		System.out.println(+str.length());
		
	}
	

}
