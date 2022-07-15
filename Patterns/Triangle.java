package Patterns;

import java.util.Scanner;

public class Triangle 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("..............Printing 'TRIANGLE' Pattern.....................\n\n");
		
		int i,j,k,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value greater than 1: ");
	    n=sc.nextInt();
	    if(n>1)
	    {
	    	for(i=n;i>=1;i--)
	    	{
	    		for(k=1;k<i;k++)
	    		{
	    			System.out.print("  ");
	    		}
	    		for(j=n-i;j>=1;j--)
	    		{
	    			System.out.print(" *");
	    		}
	    		for(j=i;j<=n;j++)
	    		{
	    			System.out.print(" *");
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

..............Printing 'TRIANGLE' Pattern.....................


Enter the value greater than 1: 
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

 */
