package Patterns;

import java.util.Scanner;

public class OutlineTriangle 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter the Number of Rows : ");
		n=sc.nextInt();
		 for(i=0;i<=n;i++)
		 {
		    if(i<n)
		    {
		         for(j=1;j<=i;j++)
		         {
		            System.out.print(" "+j);
		         }
		    System.out.print(" 1\n");
		    }
		 }
		 for(i=0;i<n;i++)
		 {
			 System.out.print(" 1");
		 }
		 System.out.print(" 1");
	}
}
/*
OUTPUT :

Enter the Number of Rows : 
10
 1
 1 1
 1 2 1
 1 2 3 1
 1 2 3 4 1
 1 2 3 4 5 1
 1 2 3 4 5 6 1
 1 2 3 4 5 6 7 1
 1 2 3 4 5 6 7 8 1
 1 2 3 4 5 6 7 8 9 1
 1 1 1 1 1 1 1 1 1 1 1
*/
