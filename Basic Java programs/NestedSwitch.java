//Java Program to demonstrate the use of Java Nested Switch  
import java.io.*;
import java.util.Scanner;

public class NestedSwitch
{    
    public static void main(String args[])  
    {  
      //C - CSE, E - ECE, M - Mechanical 
        Scanner sc=new Scanner(System.in);
        char branch; 
        System.out.print("Enter branch: ");
        branch=sc.next().charAt(0);                
        int collegeYear;
        System.out.print("Enter Your collegeYear: ");
        collegeYear=sc.nextInt();  
        switch( collegeYear )  
        {  
            case 1:  
            System.out.println("English, Maths, Science");  
            break;  
            default:System.out.println("Enter the valid Year Or Branch");
            case 2:  
                switch( branch )   
                {  
                    case 'C':  
                        System.out.println("Operating System, Java, Data Structure");  
                        break;  
                    case 'E':  
                        System.out.println("Micro processors, Logic switching theory");  
                        break;  
                    case 'M':  
                        System.out.println("Drawing, Manufacturing Machines");  
                        break;  
                    default:System.out.println("Enter the valid Year Or Branch");
                }  
                break;  
            case 3:  
                switch( branch )   
                {  
                    case 'C':  
                        System.out.println("Computer Organization, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Fundamentals of Logic Design, Microelectronics");  
                        break;  
                    case 'M':  
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");  
                        break;  
                    default:System.out.println("Enter the valid Year Or Branch");
                }  
                break;  
            case 4:  
                switch( branch )   
                {  
                    case 'C':  
                        System.out.println("Data Communication and Networks, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Embedded System, Image Processing");  
                        break;  
                    case 'M':  
                        System.out.println("Production Technology, Thermal Engineering");  
                        break;  
                    default:System.out.println("Enter the valid Year Or Branch");
                }  
                break;  
        }  
    }  
}  