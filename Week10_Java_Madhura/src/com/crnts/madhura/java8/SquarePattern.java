package com.crnts.madhura.java8;

public class SquarePattern {
	public static void main(String[] args) {
	int	number=9;
		for(int row=1;row<=number;row++)
		{
			for(int column=1;column<=number;column++)
			{
				if(row==1||column==1||row==number||column==number)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				//System.out.println();
			}
			System.out.println();
		}
	}

}
