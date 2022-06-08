/*
Program 2b: Write a java class called Customer to store there name and date of birth. the date of birth
format should be DD/MM/YYYY. Write method to read Customer data as <name,dd/mm/yyyy>
& display as <name,dd,mm,yyyy> using StringTokenizer Class.Considering the delimiter character as "/".
 */
import java.util.Scanner;
import java.util.StringTokenizer;

class Customer {
    String dd, mm, yyyy;
    String name;
    void rd(String name, String dob) {
        this.name = name;
        StringTokenizer token = new StringTokenizer(dob, "/");
        dd = token.nextToken();
        mm = token.nextToken();
        yyyy = token.nextToken();
        System.out.println("Name: " + name+"\nDOB: "+dd+","+mm+","+yyyy);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter DOB: ");
        String dob = sc.next();
        Customer c = new Customer();
        c.rd(name, dob);
    }
}
/*
 output:
Enter name: Adarsh
Enter DOB: 19/08/2001
Name: Adarsh   
DOB: 19,08,2001
 */