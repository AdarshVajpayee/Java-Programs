/*
 Program 3a: Write a java program to read an integer a and b Compute a/b and print when b!=0 
 and  Rise an Exception when b=0. 
 */
import java.io.*;
import java.util.Scanner;

class Integer 
{
    public static void main(String[] args) 
    {
        int a,b,res;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 2 integer numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        try
        {
            res=a/b;
            System.out.println("Result = " +res);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception"+e);
        }
    }
}
/*
 Output : 
 case 1:when (b!=0)
 Enter 2 integer numbers : 100 10
 Result = 10
 
 case 2:when (b=0)
 Enter 2 integer numbers : 10 0
 Exceptionjava.lang.ArithmeticException: / by zero
 */