package StrieverSheet.Graph;

import java.util.*;

public class DetectCycleBFS {
   public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        //Detect Cycle
        System.out.println(isCycle(v, adj));
   }

   private static boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v];
        Arrays.fill(vis, false);

        for(int i = 0; i < v; i++){
            if(vis[i] == false){
                if(checkForCycle(i, v, adj, vis))
                return true;
            }
        }

        return false;
   }

   private static boolean checkForCycle(int src, int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        vis[src] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, -1));

        while(!q.isEmpty()){
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();

            for(int curr : adj.get(node)){
                if(vis[curr] == false){
                    vis[curr] = true;
                    q.add(new Pair(curr, node));
                }
                else if(parent != curr){
                    return true;
                }
            }
        }
        return false;
   }

}
