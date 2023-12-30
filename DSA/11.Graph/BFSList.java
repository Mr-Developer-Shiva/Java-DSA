import java.util.*;
public class BFSList {
    public static void main(String[] args) {
        //adjecency list representation of graph 
        Scanner scan = new Scanner(System.in);
        
        List<List<Integer>> listGraph = new ArrayList<>();
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        for(int i = 0 ; i < n ; i++){
            listGraph.add(new ArrayList<>());
        }

        for(int i = 0 ; i < m ; i++){
            int v = scan.nextInt();
            int u = scan.nextInt();

            listGraph.get(u).add(v);
            listGraph.get(v).add(u);
        }
        BFS(listGraph, m);
    }
    public static void BFS(List<List<Integer>> listGraph , int src){
        Queue<Integer> q = new LinkedList<Integer>();
        boolean[] vis = new boolean[listGraph.size()];

        q.add(src);
        vis[src] = true ;
         
        while(q.size() > 0 ){
        int rem = q.remove();
        //Processing the removed element
        System.out.println(rem);

        //all the nbrs 
        List<Integer> nbrs = listGraph.get(rem);
        for(int nbr : nbrs){
            if(vis[src] == false){
                q.add(nbr);
            }
            }
        }
    }
}
