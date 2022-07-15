import java.util.Scanner;

public class Addition
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number 1 :");
        // System.out.print("enter number 2 :");4
        
        int num1,num2,num3,sum;
        num1=sc.nextInt();
        num2=5;
        System.out.print("enter number 3 :");
        num3=sc.nextInt();
        sum=num1+num2+num3;
        System.out.println(sum);
    }
}