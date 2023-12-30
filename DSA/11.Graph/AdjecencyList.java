import java.util.*;
public class AdjecencyList {
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
    }
}
   