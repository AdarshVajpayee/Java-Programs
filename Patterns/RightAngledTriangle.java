package Patterns;

import java.util.Scanner;

public class RightAngledTriangle 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("..............Printing 'RIGHT ANGLED TRIANGLE' Pattern.....................\n\n");
		System.out.print("Enter The Number Greater than 1 : ");
		int i,j,n;
		n=sc.nextInt();
		if(n>1)
		{
			for(i=0;i<n;i++)
			{
				for(j=1;j<=i+1;j++)
				{
					System.out.print("* ");
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
OUTPUT :

..............Printing 'RIGHT ANGLED TRIANGLE' Pattern.....................


Enter The Number Greater than 1 : 10
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * * 
* * * * * * * * 
* * * * * * * * * 
* * * * * * * * * * 
 */