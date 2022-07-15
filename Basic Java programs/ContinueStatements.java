import java.util.Scanner;

public class ContinueStatements 
{
    public static void main(String[] args)
    {   
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int n=sc.nextInt();
        for(int i=0;i<=2;i++)
        {
            for(int j=i;j<=5;j++)
            {
                if(j==4)
                {
                    continue;
                }
                System.out.print(j+" ");
            }
        }
    }
}

/*
Output:

0 1 2 3 5 1 2 3 5 2 3 5 
 */