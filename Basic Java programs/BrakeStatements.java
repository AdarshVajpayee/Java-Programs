import java.util.Scanner;

public class BrakeStatements {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.print(i+" ");
            if(i==8)
            {
                break;
            }
        }  
    }
}

// output:

// Enter Number : 15
// 0 1 2 3 4 5 6 7 8 

// Break :

// the name suggests, the break statement is used to break the current flow of the program and transfer the control to the next statement outside a loop or switch statement. However, it breaks only the inner loop in the case of the nested loop.


