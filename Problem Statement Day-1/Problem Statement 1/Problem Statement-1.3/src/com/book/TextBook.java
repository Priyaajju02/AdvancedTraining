package com.book;

import java.util.Scanner;

public class TextBook {
	
	 public static void main (String[] args) {
	        Scanner sc=new Scanner(System.in);
	        
	        System.out.println("Enter the Book Title :");
	        String title=sc.nextLine();
	        
	        System.out.println("Enter the Book Price :");
	        float price=sc.nextFloat();
	        sc.nextLine();
	        System.out.println(" ");
	        
	        Book obj=new Book();
	        obj.setBookTitle(title);
	        obj.setBookPrice(price);
	        System.out.println("Book Details");
	        System.out.println(" ");
	        System.out.println("Book Name : "+obj.getBookTitle());
	        System.out.printf("Book Price : Rs.%.2f",+(obj.getBookPrice()));
	       
	    }

}
