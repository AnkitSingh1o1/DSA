package StrieverSheet.Graph;
import java.util.*;
public class BipartiteDFS {
    public static void main(String[] args) {
        int v = 0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        isBi(v, adj);
    }

    private static boolean isBi(int v, ArrayList<ArrayList<Integer>> adj){
        int[] color = new int[v];
        Arrays.fill(color, -1);

        for(int i = 0; i < v; i++){
            if(color[i] == -1){
                if(dfs(i, 0, color, adj) == false)
                return false;
            }
        }
        return true;
    }

    private static boolean dfs(int node, int col, int[] color, ArrayList<ArrayList<Integer>> adj){
        color[node] = col;

        for(int it : adj.get(node)){
            if(color[it] == -1){
                if(dfs(it, 1-col, color, adj) == false)
                return false;
            }
            else if(color[it] == col){
                return false;
            }
        }
        return true;
    }
}
