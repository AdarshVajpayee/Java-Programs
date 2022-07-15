//                           For Loop

import java.util.Scanner;

public class forloop {
    public static void main(String  argv[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0,n;
        System.out.print("Enter the Summation of number you want : ");
        n=sc.nextInt();
        for(int i=1; i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of "+n+" natural numbers is : "+ sum);
    }
}



