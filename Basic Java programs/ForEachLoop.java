import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args)
    {
        // String names[]={"C","C++","JAVA","Python","HTML","CSS","JAVASCRIPT"};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of names you want to store  : ");
        int n=sc.nextInt();
        String[] names=new String[n];
        for(int i=0;i<n;i++)
        {
            names[i]=sc.next();
        }
        System.out.println("Printing the Contents of the Array :");
        for(String name :names)
        {
            System.out.println(name);
        }
    }
}

/*
 Output:
 
Enter the number of names you want to store  : 5
Adarsh
Prajjwal
Sunil 
Abhay
Eshwara
Printing the Contents of the Array :
Adarsh
Prajjwal
Sunil
Abhay
Eshwara
 */