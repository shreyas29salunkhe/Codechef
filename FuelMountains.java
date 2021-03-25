package com.practice;

import java.util.Scanner;

class FuelMountains
{
    static Scanner sc = new Scanner(System.in);
    static void output(){
        int n = sc.nextInt();
        int[] a = new int[n];
        
        int sum = Integer.MIN_VALUE+100000;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            sum = Integer.max(sum+a[i],a[i]);
            max = Integer.max(sum,max);
        }
        System.out.println(max);
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int t = sc.nextInt();
		for(int i=1;i<=t;i++){
		    output();
		}
	}
}