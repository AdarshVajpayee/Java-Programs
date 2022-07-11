//Implement in java ,the 0/1 Knapsack Problem using 
// (i.) Dynamic Programming Method.
// (ii.)Greedy Method.

import java.io.*;
import java.util.*;

public class KnapsackDP 
{
    public static void main(String[] args) 
    {
        int v[][] = new int[10][10], w[] = new int[10], p[] = new int[10], i, j;
        Scanner sc = new Scanner(System.in);
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
        displayinfo(m, n, w, p);
        Knapsack(m, n, w, p, v);
        System.out.println("Contents of the knapsack : ");
        for (i = 0; i <= n; i++) 
        {
            for (j = 0; j <= m; j++) 
            {
                System.out.print(v[i][j] + "\t");
            }
            System.out.println();
        }
        optimal(m, n, w, v);
    }

    static void displayinfo(int m, int n, int[] w, int[] p) 
    {
        System.out.println("Entered information: ");
        System.out.println("ITEM\tWEIGHT\tPROFIT");
        for (int i = 1; i <= n; i++)
            System.out.println(i + "\t" + w[i] + "\t" + p[i]);
        System.out.println("Capacity = " + m);
    }

    static void Knapsack(int m, int n, int[] w, int[] p, int[][] v) 
    {
        for (int i = 0; i <= n; i++) 
        {
            for (int j = 0; j <= m; j++) 
            {
                if (i == 0 || j == 0)
                    v[i][j] = 0;
                else if (j < w[i])
                    v[i][j] = v[i - 1][j];
                else
                    v[i][j] = max(v[i - 1][j], v[i - 1][j - w[i]] + p[i]);
            }
        }
    }

    private static int max(int i, int j) 
    {
        if (i < j)
            return j;
        else
            return i;
    }

    static void optimal(int m, int n, int w[], int v[][]) 
    {
        int i = n, j = m, item = 0, x[] = new int[10];
        while ((i != 0) && (j != 0)) 
        {
            if (v[i][j] != v[i - 1][j]) 
            {
                x[i] = 1;
                j = j - w[i];
            }
            i = i - 1;
        }
        System.out.println("Optimal Solution is : " + v[n][m]);
        System.out.println("Selected items ");
        for (i = 1; i <= n; i++) 
        {
            if (x[i] == 1) 
            {
                System.out.println(i + " ");
                item = 1;
            }
            if (item == 0)
                System.out.println("Sorry item cannot be placed");
        }
    }
}

/*
output:

Enter the total number of item : 
3
Enter the weight of each item : 
3 7 3
Enter the profit
10 8 15
Enter the capacity: 
6
Entered information: 
ITEM    WEIGHT  PROFIT
1       3       10
2       7       8
3       3       15
Capacity = 6
Contents of the knapsack :
0 0 0 0 0 0 0
0 0 0 10 10 10 10
0 0 0 10 10 10 10
0 0 0 15 15 15 25
Optimal Solution is : 25
Selected items 
1
3
 */
