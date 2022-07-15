/*
Java allows us to use enum in switch statement. 
Java enum is a class that represent the group of constants. 
(immutable such as final variables).
We use the keyword enum and put the constants in curly braces separated by comma.
*/

// A Java program to demonstrate working on enum
// in switch case (Filename Test. Java)
 
import java.util.Scanner;
 
// An Enum class
enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
 
// Driver class that contains an object of "day" and
// main().
public class Enum {
    Day day;
 
    // Constructor
    public Enum(Day day) { this.day = day; }
 
    // Prints a line about Day using switch
    public void dayIsLike()
    {
        switch (day) {
        case MONDAY:
            System.out.println("Mondays are bad.");
            break;
        case FRIDAY:
            System.out.println("Fridays are better.");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Weekends are best.");
            break;
        default:
            System.out.println("Midweek days are so-so.");
            break;
        }
    }
 
    // Driver method
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Day: ");
        String str;
        str=sc.next();
        Enum t1 = new Enum(Day.valueOf(str));
        t1.dayIsLike();
    }
}
/*
Enter The Day: 
MONDAY
Mondays are bad.
 */