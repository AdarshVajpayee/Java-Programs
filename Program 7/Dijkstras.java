import java.util.Scanner;

public class Dijkstras 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of nodes: ");
        int n = sc.nextInt();
        boolean visited[] = new boolean[n];
        int path[] = new int[n], dist[] = new int[n], cost[][] = new int[n][n];
        int i, j;
        System.out.println("Enter cost adjacency matrix (999 if no edge): ");
        for (i = 0; i < n; i++) 
            for (j = 0; j < n; j++) 
                cost[i][j] = sc.nextInt();
        System.out.println("Adjacency matrix:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) 
                System.out.print(cost[i][j] + "\t");
            System.out.println();
        }
        System.out.print("Enter source vertex: ");
        int sv = sc.nextInt();
        if(--sv < 0 || sv >= n) {
            System.out.println("Invalid source vertex");
            return;
        }
        dijkstras(sv, cost, dist, path, visited, n);
        printPath(sv, dist, path, visited, n);
        sc.close();
    }
    public static void dijkstras(int sv,int cost[][], int dist[], int path[], boolean visited[], int n) {
        for(int i = 0; i < n; i++) {
            dist[i] = cost[sv][i];
            path[i] = sv;
            visited[i] = false;
        }
        dist[sv] = 0;
        visited[sv] = true;
        for(int count = 1; count < n; count++) {
            int min = 999, v = 0;
            for(int w = 0; w < n; w++) 
                if(!visited[w] && dist[w] < min) {
                    min = dist[w];
                    v = w;
                }
            visited[v] = true;
            for(int w = 0; w < n; w++) 
                if(!visited[w] && dist[v] + cost[v][w] < dist[w]) {
                    dist[w] = dist[v] + cost[v][w];
                    path[w] = v;
                }
        }
    }
    public static void printPath(int sv, int dist[], int path[], boolean visited[], int n) {
        for(int w = 0; w < n; w++) 
            if(visited[w] && w != sv){
                System.out.println("Distance from "+(sv + 1)+" -> "+(w + 1)+" is "+dist[w]);
                System.out.print("Path is: ");
                for(int v = w; v != sv; v = path[v])
                    System.out.print((v + 1)+" <- ");
                System.out.println((sv + 1));
            }
    }
} 

/*
OUTPUT :

Enter no of nodes: 5
Enter cost adjacency matrix (999 if no edge): 
0 4 999 8 999
4 0 3 999 999
999 3 0 4 999
8 999 4 0 7    
999 999 999 7 0
Adjacency matrix:
0       4       999     8       999
4       0       3       999     999
999     3       0       4       999
8       999     4       0       7
999     999     999     7       0
Enter source vertex: 5
Distance from 5 -> 1 is 15
Path is: 1 <- 4 <- 5
Distance from 5 -> 2 is 14
Path is: 2 <- 3 <- 4 <- 5
Distance from 5 -> 3 is 11
Path is: 3 <- 4 <- 5
Distance from 5 -> 4 is 7
Path is: 4 <- 5
 */