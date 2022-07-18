//From a given vertex in a weighed graph ,Find the shortest path to other vertices using Dijkstra's Algorithm.
//Write the program in java.

import java.io.*;
import java.util.*;

public class Dijkstra
{
    public static void main(String[] args) 
    {
        int i,j;
        int dist[]=new int[10],visited[]=new int[10],path[]=new int[10];
        int cost[][]=new int[10][10];
        Scanner in = new Scanner(System.in);
        System.out.println("***********************DIJKSTRA'S ALGORITHM********************************");
        System.out.println("Enter the number of nodes : ");
        int n=in.nextInt();
        System.out.println("Cost Adjacency : ");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                cost[i][j]=in.nextInt();
            }
        }
        System.out.println("The Entered Matrix : ");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(cost[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Enter the Source Vertex : ");
        int sv=in.nextInt();
        dij(cost,dist,sv,n,path,visited);
        printPath(sv,n,dist,path,visited);
    }

    static void dij(int cost[][],int dist[],int sv,int n,int path[],int visited[])
    {
        int count = 2,min,v=0,w;
        for(int i=1;i<=n;i++)
        {
            visited[i]=0;
            dist[i]=cost[sv][i];
            if(cost[v][i]==999)
                path[i]=0;
            else
                path[i]=sv;
        }
        visited[sv]=1;
        while(count<=n)
        {
            min=999;
            for(w=1;w<=n;w++)
            {
                if((dist[w] < min) && (visited[w]==0))
                {
                    min=dist[w];
                    v=w;
                }
            }
            visited[v]=1;
            count++;
            for(w=1;w<=n;w++)
            {
                if((dist[w])>(dist[v]+cost[v][w]))
                {
                    dist[w]=dist[v]+cost[v][w];
                    path[w]=v;
                }
            }
        }
    }

    static void printPath(int sv,int n,int dist[],int path[],int visited[])
    {
        for(int w=1;w<=n;w++)
        {
            if(visited[w]==1 && w!=sv)
            {
                System.out.print("The Shortest Distance Between ");
                System.out.println(sv+" --> "+w+" is : "+dist[w]);
                int t=path[w];
                System.out.print("Path is : ");
                System.out.print(" "+w);
                while(t!=sv)
                {
                    System.out.print(" <----> "+t);
                    t=path[t];
                }
                System.out.println(" <----> "+sv);
            }
        }
    }
}
/*
OUTPUT :

***********************DIJKSTRA'S ALGORITHM********************************
Enter the number of nodes : 
5
Cost Adjacency : 
0 4 999 8 999
4 0 3 999 999
999 3 0 4 999
8 999 4 0 7
999 999 999 7 0
The Entered Matrix : 
0       4       999     8       999
4       0       3       999     999
999     3       0       4       999
8       999     4       0       7
999     999     999     7       0
Enter the Source Vertex :
5
The Shortest Distance Between 5--> 1 is : 15
Path is :  1 <----> 4 <----> 5
The Shortest Distance Between 5--> 2 is : 14
Path is :  2 <----> 3 <----> 4 <----> 5
The Shortest Distance Between 5--> 3 is : 11
Path is :  3 <----> 4 <----> 5
The Shortest Distance Between 5--> 4 is : 7
Path is :  4 <----> 5

 */