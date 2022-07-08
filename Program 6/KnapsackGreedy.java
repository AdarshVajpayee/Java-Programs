import java.io.*;
import java.util.*;

public class KnapsackGreedy 
{
    public static void main(String[] args) 
    {
        float w[]=new float[10],p[]=new float[10],ratio[]=new float[10];
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of item : ");
        int n = sc.nextInt();
        System.out.println("Enter the weight of each item : ");
        for (i = 1; i <= n; i++)
            w[i] = sc.nextInt();
        System.out.println("Enter the profit");
        for (i = 1; i <= n; i++)
            p[i] = sc.nextInt();
        System.out.println("Enter the capacity: ");
        int m = sc.nextInt();
        for(i=1;i<=n;i++)
            ratio[i]=p[i]/w[i];
        System.out.println("Information about Knapsack ");
        displayinfo(n,w,p,ratio);
        System.out.println("Capacity = "+m);
        sortArray(n,ratio,w,p);
        System.out.println("After Sort");
        displayinfo(n,w,p,ratio);
        Knapsack(m,n,w,p);
    }
    static void displayinfo(int n,float w[],float p[],float ratio[]) 
    {
        System.out.println("ITEM\tWEIGHT\tPROFIT\tRATIO");
        for (int i = 1; i <= n; i++)
            System.out.println(i + "\t" + w[i] + "\t" + p[i]+"\t"+ratio[i]);
    }
    static void sortArray(int n,float ratio[],float w[],float p[])
    {
        int i,j;
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=n; j++)
            {
                if(ratio[j] < ratio[j+1])
                {
                    float temp=ratio[j];
                    ratio[j]=ratio[j+1];
                    ratio[j+1]=temp;
                    temp=w[j];
                    w[j]=w[j+1];
                    w[j+1]=temp;
                    temp=p[j];
                    p[j]=p[j+1];
                    p[j+1]=temp;
                }
            }
        }
    }
    static void Knapsack(int u,int n,float w[],float p[])
    {
        float x[]=new float[10],tp=0;
        int i;
        for(i=0;i<=n;i++)
            x[i]=0;
        for(i=1; i <= n; i++)
        {
            if(w[i]>u)
                break;
            else
            {
                x[i]=1;
                tp=tp+p[i];
                u=(int)(u-w[i]);
            }
        }
        if(i<=n)
            x[i]=u/w[i];
        tp=tp+(x[i]*p[i]);
        System.out.println("Result is ");
        for(i=1; i <= n; i++)
            System.out.println("\t"+x[i]);
        System.out.println("Max Profit = "+tp);
    }
}

/*

Output:

Enter the total number of item : 
3
Enter the weight of each item : 
10 25 20
Enter the profit
35 40 30
Enter the capacity: 
40
Information about Knapsack 
ITEM    WEIGHT  PROFIT  RATIO
1       10.0    35.0    3.5
2       25.0    40.0    1.6
3       20.0    30.0    1.5
Capacity = 40
After Sort
ITEM    WEIGHT  PROFIT  RATIO
1       10.0    35.0    3.5
2       25.0    40.0    1.6
3       20.0    30.0    1.5
Result is
        1.0
        1.0
        0.25
Max Profit = 82.5
 */
