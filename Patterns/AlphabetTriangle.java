package Patterns;

import java.util.Scanner;

public class AlphabetTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char input,alphabet='A';
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the uppercase  character you want to print in the last row: ");
	    input=sc.next().charAt(0);
	    for(int i=1;i<=(input-'A'+1);i++)
	    {
	        for(int j=1;j<=i;j++)
	        {
	            System.out.print(alphabet+" ");
	        }
	        alphabet++;
	        System.out.println();
	    }
	}
}
/*
OUTPUT :

Enter the uppercase  character you want to print in the last row: 
I
A 
B B 
C C C 
D D D D 
E E E E E 
F F F F F F 
G G G G G G G 
H H H H H H H H 
I I I I I I I I I 

*/
