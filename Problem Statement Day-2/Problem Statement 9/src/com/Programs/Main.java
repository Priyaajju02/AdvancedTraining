package com.Programs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[20];
		int fre[]=new int[20];
		int size,i,j,count;
		System.out.println("Enter size of the array: ");
		size=sc.nextInt();
		System.out.println("Enter elements of the array: ");
		for(i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		      fre[i] = -1;			
		}		
		for(i=0;i<size;i++) {
			count=1;
			for(j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					count++;
					fre[j]=0;
				}				
			}
			if(fre[i]!=0) {
				fre[i]=count;
			}
		}
		System.out.println("Frequency of all elements of array: ");
		for(i=0;i<size;i++) {
			if(fre[i]!=0) {
				System.out.println(arr[i] +" occurs " +fre[i] +" times ");
			}
		}

	}

}
