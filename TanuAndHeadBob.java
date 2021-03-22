package com.practice;

import java.util.Scanner;

public class TanuAndHeadBob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		while(testCases-->0)
		{
			int num1=sc.nextInt();
			sc.nextLine();
			String str=sc.next(); 
			if(str.contains("Y"))
			{
				System.out.println("NOT INDIAN");
			}
			else if(str.contains("I"))
			{
				System.out.println("INDIAN");
			}
			else if(str.contains("N"))
			{
				System.out.println("NOT SURE");
			}
		}
		sc.close();
		}
		catch(Exception e)
		{
			
		}
	}

}
