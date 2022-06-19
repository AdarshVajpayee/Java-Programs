/*
Program 5: MergeSort

Sort a given set of n integers elements using Merge sort method and  compute its time Complexity.Run the program for varied 
values of n>5000  and Record the time taken to sort.
Plot a graph of the time taken Versus non graph sheet. The elements can be read from a file or can be generated using 
the random number generator. Demonstrate using Java how the divide and conquer method works its time complexity analysis
;Worst case,Average case,Best case.
*/
import java.io.*;
import java.util.*;

public class MergeSort 
{
    static int max=5000;
    void mergesort(int a[],int low,int high)
    {
        int mid;
        if(low<high)
        {
            mid=(low+high)/2;
            mergesort(a,low,mid);
            mergesort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
    void merge(int a[],int low,int mid,int high)
    {
        int i,j,k,t[]=new int[max];
        i=low; j=mid+1; k=low;
        while((i<=mid) && (j<=high))
        {
            if(a[i]<=a[j])
                t[k++]= a[i++];
            else
                t[k++]= a[j++];
        }
        while(i<=mid)
            t[k++]=a[i++];
        while(j<=high)
            t[k++]=a[j++];
        for(i=low;i<=high; i++)
            a[i]=t[i];
    }
    public static void main(String[] args)
    {
        int i,n,a[];
        System.out.print("Enter the number of elements: ");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        a=new int[max]; 
        Random r=new Random();
        for(i=0; i<n; i++)
            a[i]=r.nextInt(200);
        System.out.println("Array Before Sorting : ");
        for(i=0;i<n;i++)
            System.out.print(a[i]+"\t");
        long startTime=System.nanoTime();
        MergeSort m=new MergeSort();
        m.mergesort(a,0,n-1);
        long stopTime=System.nanoTime();
        System.out.println("\nSorted Array : ");
        for(i=0;i<n;i++)
            System.out.print(a[i]+"\t");
        System.out.println("\nTime Taken : "+(stopTime-startTime)+" Nanoseconds");
    }
}

/*
Output :

Enter the number of elements: 10
Array Before Sorting : 
132     76      116     105     156     69      44      144     157     117
Sorted Array : 
44      69      76      105     116     117     132     144     156     157
Time Taken : 154000 Nanoseconds
*/
