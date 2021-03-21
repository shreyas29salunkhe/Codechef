package com.practice;

import java.util.Scanner;

public class ChefAndCoupon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		while(testCases-->0)
		{
			int DeliveryCharges=sc.nextInt();
			int CouponCost=sc.nextInt();
			int A1=sc.nextInt();
			int A2=sc.nextInt();
			int A3=sc.nextInt();
			int B1=sc.nextInt();
			int B2=sc.nextInt();
			int B3=sc.nextInt();
			int total1=A1+A2+A3;
			int total2=B1+B2+B3;
			if(total1>=150 && total2>=150 )
			{
				if(total1+total2+CouponCost<total1+total2+DeliveryCharges+DeliveryCharges)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
			else if(total1>=150 || total2>=150 )
			{
				if(total1+total2+CouponCost+DeliveryCharges<total1+total2+DeliveryCharges+DeliveryCharges)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
			else {
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
