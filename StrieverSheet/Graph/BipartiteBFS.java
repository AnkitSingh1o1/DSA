package StrieverSheet.Graph;
import java.util.*;
public class BipartiteBFS {
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
                if(check(i, v, adj, color) == false)
                return false;
            }
        }

        return true;
    }

    private static boolean check(int i, int v, ArrayList<ArrayList<Integer>> adj, int[] color){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        color[i] = 0;

        while(!q.isEmpty()){
            int node = q.peek();

            for(int it : adj.get(node)){
                if(color[it] == -1){
                    color[it] = 1 - color[node];
                    q.add(it);
                }
                else if(color[it] == color[node]){
                    return false;
                }
            }

        }
        return true;
    }
}
