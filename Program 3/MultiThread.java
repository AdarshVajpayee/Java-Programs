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
                Thread.sleep(1000);
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
First thread generated number : 61
Second thread squared number : 3721
Third thread Cubed number : 226981
First thread generated number : 84
Second thread squared number : 7056
Third thread Cubed number : 592704
First thread generated number : 14
Second thread squared number : 196
Third thread Cubed number : 2744
First thread generated number : 42
Second thread squared number : 1764
Third thread Cubed number : 74088
First thread generated number : 81
Second thread squared number : 6561
Third thread Cubed number : 531441
 */