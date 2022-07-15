package Patterns;

import java.util.Scanner;

public class DiamondPattern 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("..............Printing 'DIAMOND' Pattern.....................\n\n");
		
		int i,j,k,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value greater than 2");
	    n=sc.nextInt();

	    for(i=n;i>=1;i--)
	    {
	        for(k=1;k<i;k++)
	        {
	            System.out.print("  ");
	        }
	        for(j=i;j<=n;j++)
	        {
	            System.out.print(" *");
	        }
	        for(j=n-i;j>=1;j--)
	        {
	            System.out.print(" *");
	        }
	        System.out.println();
	    }
	    for(i=1;i<=n-1;i++)
		{
	        for(k=1;k<=i;k++)
		    {
	            System.out.print("  ");
	        }
	        for(j=n-1;j>=i;j--)
		    {
	            System.out.print(" *");
	        }
	        for(j=n-1-i;j>=1;j--)
		    {
	            System.out.print(" *");
	        }
	        System.out.println();
	    }
	}
}

/*
OUTPUT :

..............Printing 'DIAMOND' Pattern.....................


Enter the value greater than 2
10
                   *
                 * * *
               * * * * *
             * * * * * * *
           * * * * * * * * *
         * * * * * * * * * * *
       * * * * * * * * * * * * *
     * * * * * * * * * * * * * * *
   * * * * * * * * * * * * * * * * *
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