package StrieverSheet.Graph;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args){
      dfsOfGraph(5, new ArrayList<ArrayList<Integer>> adj);
    }

    private static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[V+1];
        vis[0] = true;

        ArrayList<Integer> ans = new ArrayList<>();

        dfs(0, vis, adj, ans);

        return ans;
    }

    private static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, 
    ArrayList<Integer> ans){

        vis[node] = true;
        ans.add(node);

        for(Integer it : adj.get(node)){
            if(vis[it] == false){
                dfs(it, vis, adj, ans);
            }
        }

    }


}
