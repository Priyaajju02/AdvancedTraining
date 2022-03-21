package com.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Hima");
		list.add("Priya");
		list.add("Dinesh");
		list.add("Nani");
		list.add("Pinky");
		System.out.println(list);
		Scanner sc=new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Enter the name :");
		String a=sc.nextLine();
		boolean str=list.contains(a);
		if(str) {
			System.out.println("Name exists in the Array List");
		}
		else {
			System.out.println("Name does not exists in the Array List");
		}
	}
	
}
