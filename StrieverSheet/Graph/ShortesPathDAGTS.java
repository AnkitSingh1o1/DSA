package StrieverSheet.Graph;
import java.util.*;
public class ShortesPathDAGTS {
    
    public static void main(String[] args) {
        shortestPath(int n, int m, int[][] edges);
    }


    public static int[] shortestPath(int N, int M, int[][] edges){

        //Step 1 : Prepare ADj list
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i = 0; i < N; i++){
            ArrayList<Pair> temp = new ArrayList<>();
            adj.add(temp);
        }
        for(int i = 0; i < M; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new Pair(v, wt));
        }

        //Step 2 : TopoSort list using DFS
        int[] vis = new int[N];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < N; i++){
            if(vis[i] == 0)
            topoSort(i, adj, vis, st);
        }
        

        //Step 3 : Shortest Dist
        int[] dist = new int[N];
        for(int i = 0; i < N; i++){
            dist[i] = (int)(1e9);
        }
        dist[0] = 0;
        while(!st.isEmpty()){
            int node = st.pop();
            for(int i =0 ; i < adj.get(node).size(); i++){
                int v = adj.get(node).get(i).first;
                int wt = adj.get(node).get(i).second;
                if(dist[node] + wt < dist[v]){
                    dist[v] = wt + dist[node];
                }
            }
        }
        return dist;
    }

    public static int[] topoSort(int node, ArrayList<ArrayList<Pair>> adj,
    int[] vis, Stack<Integer> st) 
    {
        //TopoSort DFS
        vis[node] = 1
        for(int i = 0; i < adj.get(node).size(); i++){
            int v =  adj.get(node).get(i).first;
            if(vis[v] == 0){
                topoSort(v, adj, vis, st);
            }
        }  
        st.push(node);
    }
}
