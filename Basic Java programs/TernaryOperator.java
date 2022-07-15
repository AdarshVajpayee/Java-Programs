import java.util.Scanner;

public class TernaryOperator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=sc.nextInt();
        String output=(number%2==0)?"Even Number":"Odd Number";
        System.out.println(output);
    }    
}

/*
output:

Enter the number: 68
Even Number

Enter the number: 79
Odd Number
*/
