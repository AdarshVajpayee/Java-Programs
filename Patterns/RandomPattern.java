package Patterns;

import java.util.Scanner;

public class RandomPattern 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		    int i,j,k;
		    int n;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the number of rows : ");
	        n=sc.nextInt();
		    for(i=n-1;i>=0;i--)
		    {
		        for(j=0;j<=i;j++)
		        {
		            System.out.printf(" %c",(65+j));
		        }
		        for(k=1;k<(n-i);k++){
		            System.out.printf("    ");
		        }
		        for(j=i;j>=0;j--)
		        {
		            System.out.printf(" %c",(65+j));
		        }
		        System.out.println();
		    }
	}
}

/*
OUTPUT : 

Enter the number of rows : 
5
 A B C D E E D C B A
 A B C D     D C B A
 A B C         C B A
 A B             B A
 A                 A

 */
