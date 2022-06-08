
/*
Program 2a: Design a super class staff with staffid,name,phone,salary extend this class by writing '3'
sub classes Teaching(domain,publication) Technical(Skills) & Contract (period).
Write a java program to read & display atleast '3' staff objects of all '3' Categories.
 */
import java.util.Scanner;

class Staff {
    int id, sal;
    String name, ph;
    Staff(int id, int sal, String name, String ph) {
        this.id = id;
        this.sal = sal;
        this.name = name;
        this.ph = ph;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + ph);
        System.out.println("Salary: " + sal);
    }
}

class Teaching extends Staff {
    String domain, publications;
    Teaching(int id, int sal, String name, String ph, String domain, String publications) {
        super(id, sal, name, ph);
        this.domain = domain;
        this.publications = publications;
    }
    void displayTeach() {
        //super.display();
        System.out.println("Domain: " + domain);
        System.out.println("Publications: " + publications);
    }
}

class Technical extends Staff {
    String skills;
    Technical(int id, int sal, String name, String ph, String skills) {
        super(id, sal, name, ph);
        this.skills = skills;
    }
    void displayTech() {
        //super.display();
        System.out.println("Skills: " + skills);
    }
}

class Contract extends Staff {
    int period;
    Contract(int id, int sal, String name, String ph, int period) {
        super(id, sal, name, ph);
        this.period = period;
    }
    void displayContract() {
        //super.display();
        System.out.println("Period: " + period);
    }
}

class StaffDetails {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        int id, sal, period;
        String name, ph, domain, publications, skills;
        while(ch!=4) {
            System.out.print("1. Teaching\n2. Technical\n3. Contract\n4. Exit\nEnter your choice:");
            ch = sc.nextInt();
            switch(ch) {
                case 1: Teaching te[] = new Teaching[3];
                        for(int i=0; i<3; i++) {
                            System.out.print("Enter ID:");
                            id = sc.nextInt();
                            System.out.print("Enter name:");
                            name = sc.next();
                            System.out.print("Enter phone:");
                            ph = sc.next();
                            System.out.print("Enter salary:");
                            sal = sc.nextInt();
                            System.out.print("Enter domain:");
                            domain = sc.next();
                            System.out.print("Enter publications:");
                            publications = sc.next();
                            te[i] = new Teaching(id, sal, name, ph, domain, publications);
                        }
                        for(int i=0; i<3; i++) {
                            te[i].display();
                            te[i].displayTeach();
                        }
                        break;
                case 2: Technical tech[] = new Technical[3];
                        for(int i=0; i<3; i++) {
                            System.out.print("Enter ID:");
                            id = sc.nextInt();
                            System.out.print("Enter name:");
                            name = sc.next();
                            System.out.print("Enter phone:");
                            ph = sc.next();
                            System.out.print("Enter salary:");
                            sal = sc.nextInt();
                            System.out.print("Enter skills:");
                            skills = sc.next();
                            tech[i] = new Technical(id, sal, name, ph, skills);
                        }
                        for(int i=0; i<3; i++) {
                            tech[i].display();
                            tech[i].displayTech();
                        }
                        break;
                case 3: Contract c[] = new Contract[3];
                        for(int i=0; i<3; i++) {
                            System.out.print("Enter ID:");
                            id = sc.nextInt();
                            System.out.print("Enter name:");
                            name = sc.next();
                            System.out.print("Enter phone:");
                            ph = sc.next();
                            System.out.print("Enter salary:");
                            sal = sc.nextInt();
                            System.out.print("Enter period:");
                            period = sc.nextInt();
                            c[i] = new Contract(id, sal, name, ph, period);
                        }
                        for(int i=0; i<3; i++) {
                            c[i].display();
                            c[i].displayContract();
                        }
                        break;
            }
        }
    }
}