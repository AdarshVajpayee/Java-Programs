package Patterns;

import java.util.Scanner;

public class NumTriangle2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		   int n,i,j,k;
		   Scanner sc=new Scanner(System.in);
		   System.out.printf("Enter the number of alphabets : ");
		   n=sc.nextInt();
		    //ASCII code of A is 65
		    for(i=n;i>=1;i--)
		    {//runs till the rows or given input
		        for(k=1;k<i;k++)
		        {//for prints spaces in rows till i
		            System.out.printf("  ");
		        }
		        for(j=i;j<=n;j++)
		        {//prints the right angled triangle with alphabets [64+n-i+1]=[64+5-5+1=65(A)] and so on.
		            System.out.printf(" %c",64+n-i+1);
		        }
		        //above two for loops is to print the right angled triangle with spaces in the beginning  
		        for(j=n-i;j>=1;j--)
		        {
		            System.out.printf(" %c",64+n-i+1);//here [64+n-i+1]=[64+5-5+1=65(A)] but it will not print(A)becoz of the condition and printing starts from B
		        }
		        System.out.printf("\n");
		    }
	}
}
