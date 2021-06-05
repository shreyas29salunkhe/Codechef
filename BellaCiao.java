package com.practice;

import java.io.*;



public class BellaCiao {

	public static void main(String[] args) {
		
		try
		{
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			int t=Integer.parseInt(br.readLine());
			while(t-->0)
			{
				long count =0;
				String[] input = new String[4];
				input = br.readLine().split(" "); 								
				long D=Integer.parseInt(input[0]);
				long d=Integer.parseInt(input[1]);
				long p=Integer.parseInt(input[2]);
				long q=Integer.parseInt(input[3]);
				long x=D/d;
				if(x%2==0)
				{
					//count+=d*((x/2)*(2*p+(x-1)*q));
					count+= d*((x/2)*(2*p+(x-1)*q));
				}
				else
				{
					//count+=d*(x*p+((x-1)/2*q));
					count+=d*(x*(p+((x-1)/2)*q));
				}
				//count+=(D%d)*(p+(x)*q);
				count+=(D%d)*(p+(x)*q);
				System.out.println(count);
				
			}
			
		}
		catch(Exception e)
		{
			
		}

	}

}
