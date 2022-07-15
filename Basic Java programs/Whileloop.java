import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args)  
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the MaxRange : ");
        int n=sc.nextInt();
        int i=0;
        System.out.println("Printing the list of First "+n+" Even Numbers : ");
        while(i<=n)
        {
            System.out.print(i+" ");
            i=i+2;
        }
    }
}
/*
Output:

Enter the MaxRange : 
50
Printing the list of First 50 Even Numbers : 
0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 

*/
