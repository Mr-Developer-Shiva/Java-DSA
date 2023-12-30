import java.util.*;
public class AdjacencyMatrixRepresentionOfGrapth {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();     //no. of node
        int m = scan.nextInt();     //no. of edge

        int[][] graph = new int[n][n];

        for(int i = 0 ; i < m ; i++){   
            int v = scan.nextInt();
            int u = scan.nextInt();

            graph[u][v] = 1 ;
            graph[v][u] = 1 ;
        }
    }
}
