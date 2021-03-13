package com.practice;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		int testCases=sc.nextInt();
		while(testCases-->0)
		{
			int side1=sc.nextInt();
			int side2=sc.nextInt();
			int side3=sc.nextInt();
			int side4=sc.nextInt();
			
			if(side1==side2 && side3==side4)
			{
				System.out.println("YES");
			}
			
			else if(side1==side4 && side3==side2)
			{
				System.out.println("YES");
			}
			
			else if(side1==side3 && side2==side4)
			{
				System.out.println("YES");
			}
			
			else
			{
				System.out.println("NO");
			}
		}
		sc.close();
		}
		catch(Exception e)
		{
			
		}
	}

}
