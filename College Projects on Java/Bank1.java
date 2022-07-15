import java.io.*;
/** 
 * <h2> Bank Program </h2> 
 * This program implements an application 
 * to perform operation which are done in bank   
 * like withdraw display balance after withdraw or deposit. 
 * <p> 
 * <b>Note:</b> Comments make the code readable and  
 * easy to understand. 
 *  
 * @author Adarsh Vajpayee 
 * @version 16.0
 * @since 2022-07-13 
 * javadoc file_name.java
 */  
   
//Java Program to demonstrate the working of a Accounting-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods.
import java.util.*;
class Account 
{
    String acc_no;
    String name;
    float amount;

    Account(String acc_no, String name, float amount) 
    {
        this.acc_no = acc_no;
        this.name = name;
        this.amount = amount;
    }

    public boolean search(String acc_no) 
    {  
        if (acc_no.equals(acc_no)) 
        {  
            displayDetails();
            return (true);  
        }  
        return (false);  
    }  
    
    void insert(String a,String n,float amt)
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
        System.out.println(amt + "Deposited");
    }

    void displayDetails() 
    {
        System.out.println(acc_no + "\t" + name + "\t" + amount);
    }
}

public class Bank1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Accounts: ");
        int n = sc.nextInt();
        int i;
        Account person[]=new Account[n];
        String acc_no;
        String name;
        float amount;
        for(i=0; i<person.length; i++)
        {
            person[i]= new Account();

        }
        for (i = 0; i < n; i++) 
        {
            System.out.println("Enter the details of the Account holder: " + (i + 1));
            System.out.print("Enter the Account Number : ");
            acc_no = sc.next();
            System.out.print("Enter the Name : ");
            name = sc.next();
            System.out.print("Enter the Amount : ");
            amount = sc.nextFloat();
            System.out.println();
            System.out.print("Press\n1.Deposit\n2.Withdraw\n3.Search by Account number\n4.Exit\n");
             System.out.print("Enter your choice:");
            int op = sc.nextInt();
            if (op == 1) 
            {
                        System.out.println("Enter the amount you want to Deposit:  ");
                        float depamt = sc.nextFloat();
                        person[i].deposit(depamt);
                        System.out.println("Details of Customer: "+(i+1));
                        person[i].displayDetails();
                        System.out.println("1.Withdraw\n2.exit\nEnter Your choice : ");
                        int choice=sc.nextInt();
                        switch(choice)
                        {
                            case 1: System.out.println("Enter the amount you want to withdraw:  ");
                                    depamt = sc.nextFloat();
                                    person[i].withdraw(depamt);
                                    System.out.println("Details of Customer: "+(i+1));
                                    person[i].displayDetails();
                                    break;
                            case 2:System.out.println("Thanks for Visiting...");
                                    break;
                        }
                    } 
                    else if (op == 2) 
                    {
                        System.out.println("Enter the amount you want to withdraw:  ");
                        float amt = sc.nextFloat();
                        person[i].withdraw(amt);
                        System.out.println("Details of Customer: "+(i+1));
                        person[i].displayDetails();
                        System.out.println("1.Deposit\n2.exit\nEnter Your choice : ");
                        int choice=sc.nextInt();
                        switch(choice)
                        {
                            case 1: System.out.println("Enter the amount you want to deposit:  ");
                                    amt = sc.nextFloat();
                                    person[i].deposit(amt);
                                    System.out.println("Details of Customer: "+(i+1));
                                    person[i].displayDetails();
                                    break;
                            case 2:System.out.println("Thanks for Visiting...");
                                    break;
                        }
                    } 
                    else if(op==3)
                    {
                        System.out.print("Enter Account no. : ");  
                        acc_no = sc.next();  
                        boolean found = false;  
                        for (i = 0; i < n; i++) {  
                            found = person[i].search(acc_no);  
                            if (found) {  
                                person[i].displayDetails();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    }
                    else 
                    {
                        System.out.println("Thanks for Visiting...");
                    }
        }
    }
}