/*
Program 1a: Create a java class called Student.with the following details as variables with in it:
usn,name,branch,phone.
write a java program to create 'n' students objects and print the usn,name,branch and
phone of these objects with suitable headings.
 */
import java.util.Scanner;

class Student {
    String Usn, Name, branch;
    long phone;

    Student(String u, String n, String b, long p) {
        Usn = u;
        Name = n;
        branch = b;
        phone = p;
    }

    void display()
    {
        System.out.println("Usn= "+Usn+"\nName= "+Name+"\nBranch= "+branch+"\nPhone= "+phone);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of Students: ");
        int n=sc.nextInt();
        int i;long ph;String us,na,br;
        Student s[]=new Student[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the details of student: "+(i+1));
            System.out.println("Enter the Usn,Name,Branch,phone");
                    us=sc.next();
                    na=sc.next();
                    br=sc.next();
                    ph=sc.nextLong();
                    s[i]=new Student(us,na,br,ph);
        }
        System.out.println("Student Details:");
        for(i=0;i<n;i++)
        {
            s[i].display();
        }
    }
}
