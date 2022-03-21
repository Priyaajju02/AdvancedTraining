package com.example;

import java.util.Scanner;

public class ReplacingString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		int length=str.length();
		System.out.println("Length of the String is "+length);
		 for (int i = 0; i<=length; i++)
	        {
	            StringBuffer sb = new StringBuffer();
	             
	            int j = i;  
	            int k = 0;  
	            for (int a = j; a < str.length(); a++) {
	                sb.insert(k, str.charAt(j));
	                k++;
	                j++;
	            }
	     
	            j = 0;
	            while (j < i)
	            {
	                sb.insert(k, str.charAt(j));
	                j++;
	                k++;
	            }
	      
	            System.out.println(sb);
	        }
	    }
	     
	}
	
