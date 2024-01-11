package com.crnts.madhura.java8;

import java.util.Scanner;

public class DimondPattern {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int  number=scn.nextInt();
		int star=1;
		int space=number/2;
		for(int row =1;row<=number;row++)
		{
			for(int column=1;column<=space;column++)
			{
				System.out.print("  ");
			}
			for(int column=1;column<=star;column++)
			{
				System.out.print("* ");
			}
			if(row<=number/2)
				{
				star=star+2;
				space--;
				
				}
			else
			{
				star=star-2;
				space++;
				
			}
			System.out.println();
		}
	}

}
