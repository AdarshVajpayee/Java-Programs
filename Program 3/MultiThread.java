/*
 Program 3b: Write a java program to implement a multithread Application that has tree Threads. 1st thread
 Generate random number for everyone.Second thread compute the square of the number and print.Third thread
 Computes Cube of the number and prints. 
 */
import java.io.*;
import java.util.Scanner;
import java.util.Random;

class Num extends Thread
{
    public void run()
    {
        int n=0;
        Random r=new Random();
        try
        {
            for(int i=0;i<5;i++)
            {
                n=r.nextInt(100);
                System.out.println("First thread generated number : "+n);
                Thread t2= new Thread(new SNum(n));
                t2.start();
                Thread t3= new Thread(new TNum(n));
                t3.start();
            }
        }
        catch(Exception e)
        {
           System.out.println(e.getMessage()); 
        }
    }
}

class SNum implements Runnable
{
    public int x;
    public SNum(int x)
    {
        this.x = x;
    }
    public void run()
    {
        System.out.println("Second thread squared number : "+(x*x));
    }
}

class TNum implements Runnable
{
    public int x;
    public TNum(int x)
    {
        this.x = x;
    }
    public void run()
    {
        System.out.println("Third thread Cubed number : "+(x*x*x));
    }
}

public class MultiThread 
{
    public static void main(String[] args)
    {
        Num n=new Num();
        n.start();
    }
}
/*
Output : 

 First thread generated number : 66
 Second thread squared number : 4356
 First thread generated number : 7  
 First thread generated number : 34 
 Third thread Cubed number : 287496 
 Second thread squared number : 49  
 First thread generated number : 40 
 Third thread Cubed number : 343    
 First thread generated number : 3  
 Third thread Cubed number : 39304  
 Second thread squared number : 1156
 Third thread Cubed number : 64000  
 Second thread squared number : 9   
 Second thread squared number : 1600
 Third thread Cubed number : 27
 */