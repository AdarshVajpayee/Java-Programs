import java.util.Scanner;

public interface dowhileloop {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Range: ");
        int i=1,n=sc.nextInt();
        System.out.println("Printing the list of "+n+" odd Integers");
        do
        {
            System.out.print(i+" ");
            i=i+2;
        }
        while(i<=n);
    }
}

/*
Output:

Enter the Range: 50
Printing the list of 50 odd Integers
1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49
*/
