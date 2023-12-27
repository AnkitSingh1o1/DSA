package StrieverSheet.Graph;
import java.util.*;
public class DetectCycleDFS {
    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        System.out.println(dCycle(v, adj));
    }

    private static boolean dCycle(int v, ArrayList<ArrayList<Integer>> adj){
        int[] vis = new int[v];
        Arrays.fill(vis, 0);

        for(int i = 0; i < v; i++){
            if(vis[i] == 0){
                if(dfs(i, -1, vis, adj) == true)
                return true;
            }
        }
        return false;
    }

    private static boolean dfs(int node, int parent, int[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;

        for(int adjNode : adj.get(node)){
            if(vis[adjNode] == 0){
                if(dfs(adjNode, node, vis, adj) == true){
                    return true;
                }
            }
            else if(parent != adjNode){
                return true;
            }
        }
        return false;

    }
    
}
