package com.Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DecimalProblem {
	public static String calculateFraction(int num, int den)
	{
		if (num == 0)
			return "0"; 
		if (den == 0)
			return ""; 

		

		StringBuilder result = new StringBuilder();
		if ((num < 0) ^ (den < 0))
			result.append("-");

		num = Math.abs(num);
		den = Math.abs(den);

		long quo = num / den; 
		long rem = num % den * 10; 

		result.append(
			String.valueOf(quo));
		if (rem == 0)
			return result
				.toString(); 

		result.append(".");
		Map<Long, Integer> m
			= new HashMap<>(); 
		while (rem != 0) {

			if (m.containsKey(rem)) {

				

				int index = m.get(rem);
				String part1 = result.substring(0, index);
				String part2 = "("
							+ result.substring(
								index, result.length())
							+ ")";
				return part1 + part2;
			}

			

			m.put(rem, result.length());
			quo = rem / den;
			result.append(String.valueOf(quo));

			
			rem = (rem % den) * 10;
			
		}
		return result.toString();
	}

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int den = sc.nextInt();
		
		String resString = calculateFraction(num, den);

		System.out.println(resString);
	}
}
