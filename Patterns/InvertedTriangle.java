package Patterns;

import java.util.Scanner;

public class InvertedTriangle 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number of Rows: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
	        for(int k=1;k<i;k++)
	        {
	            System.out.print("  ");
	        }
	        for(int j=n;j>=i;j--)
	        {
	            System.out.print(" *");
	        }
	        for(int j=n-i;j>=1;j--)
	        {
	            System.out.print(" *");
	        }
	        System.out.println();
		}
	}
}

/*
OUTPUT :

Enter The Number of Rows: 
10
 * * * * * * * * * * * * * * * * * * *
   * * * * * * * * * * * * * * * * *
     * * * * * * * * * * * * * * *
       * * * * * * * * * * * * *
         * * * * * * * * * * *
           * * * * * * * * *
             * * * * * * *
               * * * * *
                 * * *
                   *

*/
