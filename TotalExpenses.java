package com.practice;

import java.util.Scanner;

public class TotalExpenses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			while(t-->0){
			    
			    int num1=sc.nextInt();
			    int num2=sc.nextInt();
			    double ans=num1*num2;
			    if(num1>1000){
			        double d=num1*num2*0.1;
			        System.out.println(ans-d);
			    }
			    else{
			        System.out.println(ans);
			    }
			}
			sc.close();
		}
		catch(Exception e)
		{
		
		}
}

}
