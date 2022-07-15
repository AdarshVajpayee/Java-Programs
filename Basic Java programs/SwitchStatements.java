import java.util.Scanner;

public class SwitchStatements {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.print("Enter the number: ");
        number=sc.nextInt();
        switch(number)
        {
            case 1: System.out.println("Number is 1");
                     break;    
            case 2: System.out.println("Number is 2");
                     break;    
            case 3: System.out.println("Number is 3");
                     break;    
            default: System.out.println("Enter a valid number other than "+number+" and number should be less than 3");
        }
    }
}
