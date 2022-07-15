package Patterns;

import java.util.Scanner;

public class NumberedRAT 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("..............Printing 'NUMBERED RIGHT ANGLED TRIANGLE' Pattern.....................\n\n");
		System.out.print("Enter The Number Greater than 1 : ");
		int i,j,n;
		n=sc.nextInt();
		if(n>1)
		{
			for(i=0;i<n;i++)
			{
				for(j=1;j<=i+1;j++)
				{
					System.out.print(" "+j);
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Please Enter Valid Number");
		}
	}
}

/*
OUTPUT:

..............Printing 'NUMBERED RIGHT ANGLED TRIANGLE' Pattern.....................


Enter The Number Greater than 1 : 10
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 1 2 3 4 5 6
 1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7 8 9
 1 2 3 4 5 6 7 8 9 10

 */
