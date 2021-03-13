package com.practice;

import java.util.Scanner;

public class MahaSena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int even=0,odd=0;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		
		    if(a[i]%2==0){
		    	even++;
		    }
		    else{
		    	odd++;
		    }
		}
		if(even>odd){
		    System.out.println("READY FOR BATTLE");
		}
		else{
		    System.out.println("NOT READY");
		}
		sc.close();
		}
		catch(Exception e)
		{
			
		}

	}

}
