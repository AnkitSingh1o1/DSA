package StrieverSheet.Graph;

import java.util.ArrayList;

//DFS

public class DetectCycleDirectedGraph {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int[] vis = new int[v];
        int[] pathVis = new int[v];
        
        for(int i = 0; i < v; i++){
            if(vis[i] == 0){
                if(dfsCheck(i, adj, vis, pathVis))
                return true;
            }
        }
        return false;
    }
    
    private boolean dfsCheck(int node, ArrayList<ArrayList<Integer>> adj,
    int[] vis, int[] pathVis){
        
        vis[node] = 1;
        pathVis[node] = 1;
        
        for(int it : adj.get(node)){
            if(vis[it] == 0){
                if(dfsCheck(it, adj, vis, pathVis))
                return true;
            }
            else if(pathVis[it] == 1)
            return true;
        }
        
        pathVis[node] = 0;
        return false;
    }
}
