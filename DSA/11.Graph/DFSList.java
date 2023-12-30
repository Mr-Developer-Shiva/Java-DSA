import java.util.*;
public class DFSList{
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
        List<List<Integer>> graph = new ArrayList<>();
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        for(int i = 0 ; i < n ; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0 ; i < m ; i++){
            int v = scan.nextInt();
            int u = scan.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);

            
        }
    }
    public static void DFS(ArrayList<ArrayList<Integer>> graph,int src , boolean[] vis){
        System.out.println(src);
        vis[src] = true ;

        ArrayList<Integer> nbrs = new ArrayList<>();

        for(int nbr : nbrs){
            if(vis[src] = false){
                DFS(graph,nbr,vis);
            }
        }     
    }
}