import java.io.*;
import java.util.*;

class Account 
{
    long acc_no;
    String name; //instance variables
    float amount;
    // static float balance;

    Account(long acc_no, String name, float amount) 
    {
        this.acc_no = acc_no;
        this.name = name;
        this.amount = amount;
    }
    
    void insert(Long a,String n,float amt)
    {  
        acc_no=a;  
        name=n;  
        amount=amt;  
    }  

    void withdraw(float amt) 
    {
        if (amount < amt) 
        {
            System.out.println("Insufficient Balance");
        } 
        else 
        {
            amount = amount - amt;
            System.out.println(amt + "Withdrawn");
        }
    }

    void deposit(float amt) 
    {
        amount = amount + amt;
        System.out.println(amt + " Deposited");
    }

    void displayDetails() 
    {
        System.out.println(acc_no + "\t" + name + "\tBalance : " + amount);
    }
}

public class Bank 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Accounts you want to print details of: ");
        int n = sc.nextInt();
        int i;
        long acc_no;
        String name;
        float amount;
        for (i = 0; i < n; i++) 
        {
            System.out.println("Enter the details of the Account holder: " + (i + 1));
            System.out.print("Enter the Account Number : ");
            acc_no = sc.nextLong();
            System.out.print("Enter the Name : ");
            name = sc.next();
            System.out.print("Enter the Amount : ");
            amount = sc.nextFloat();
            Account person= new Account(acc_no,name,amount);
            System.out.println();
            System.out.print("Press\n1.to withdraw\n2.Deposit\n3.Exit : ");
            int op = sc.nextInt();
            if (op == 1) 
            {
                System.out.print("Do You want To Withdraw Some cash? Yes or No : ");
                String ch = sc.next();
                switch (ch) 
                {
                    case "Yes":
                        System.out.println("Enter the amount you want to withdraw:  ");
                        float amt = sc.nextFloat();
                        person.withdraw(amt);
                        System.out.println("Details of Customer: "+(i+1));
                        person.displayDetails();
                        break;
                    case "No":
                        System.out.println("Thanks for Visiting...");
                        break;
                    default:
                        System.out.println("Enter Yes or No not Something else.....");
                        break;
                }
            } 
            else if (op == 2) 
            {
                System.out.print("Do You want To Deposit Some cash? Yes or No : ");
                String depch = sc.next();
                switch (depch) 
                {
                    case "Yes":
                        System.out.println("Enter the amount you want to Deposit:  ");
                        float depamt = sc.nextFloat();
                        person.deposit(depamt);
                        System.out.println("Details of Customer: "+(i+1));
                        person.displayDetails();
                        break;
                    case "No":
                        System.out.println("Thanks for Visiting...");
                        break;
                    default:
                        System.out.println("Enter Yes or No");
                        break;
                }
            } 
            else 
            {
                System.out.println("Thanks for Visiting...");
            }
        }
    }
}
