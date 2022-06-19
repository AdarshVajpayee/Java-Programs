/*
Program 4: QUICKSORT

Sort a given set of n integers elements using Quick sort method and  compute its time Complexity.Run the program for varied 
values of n>5000  and Record the time taken to sort.
Plot a graph of the time taken Versus non graph sheet. The elements can be read from a file or can be generated using 
the random number generator. Demonstrate using Java how the divide and conquer method works its time complexity analysis
;Worst case,Average case,Best case. 
*/
import java.io.*;
import java.util.*;

class QuickSort
{
    static int max=5000;
    void quicksort(int a[],int low,int high)
    {
        int s;
        if(low < high)
        {
            s=partition(a,low,high);
            quicksort(a,low,s-1);
            quicksort(a, s+1,high);
        }
    }
    int partition(int a[],int low,int high)
    {
        int i,j,temp,p;
        p=a[low];
        i=low+1;
        j=high;
        while(low<high)
        {
            while(a[i]<=p && i<high)
                i++;
            while(a[j]>p)
                j--;
            if(i<j)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            else
            {
                temp=a[low];
                a[low]=a[j];
                a[j]=temp;
                return j;
            }
        }
        return 0;
    }
    public static void main(String[] args) 
    {
        int a[],i,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values : ");
        n=sc.nextInt();
        a=new int[max];
        Random r=new Random();
        for(i=0;i<n;i++)
            a[i]=r.nextInt(100);
        System.out.println("Generated Numbers: ");
        for(i=0;i<n;i++)
            System.out.print(a[i]+"\t");
        QuickSort qs=new QuickSort();
        long startTime=System.nanoTime();
        qs.quicksort(a,0,n-1);
        long stopTime=System.nanoTime();
        System.out.println("\nSorted Array");
        for(i=0;i<n;i++)
            System.out.print(a[i]+"\t");
        System.out.println("\nTime Taken to sort : "+(stopTime-startTime)+" Nanoseconds");
    }
}
/*
Output:

Enter the values : 8
Generated Numbers: 
23      55      88      99      96      37      8       9
Sorted Array
8       9       23      37      55      88      96      99
Time Taken to sort : 12600 Nanoseconds
 */