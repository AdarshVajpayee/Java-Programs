import java.util.Scanner;

public class ifelse { 
        public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your City Name : ");
        String city = sc.next();  
        if(city == "Meerut") {  
        System.out.println("city is meerut");  
        }else if (city == "Noida") {  
        System.out.println("city is noida");  
        }else if(city == "Agra") {  
        System.out.println("city is agra");  
        }else {  
        System.out.println("City is "+city);  
        }  
        }   
}
