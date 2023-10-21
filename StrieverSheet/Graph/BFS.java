package StrieverSheet.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        Node node = new Node();
        bfs(5, new ArrayList<ArrayList<Integer>> adj);
    }

    private static ArrayList<Integer> bfs(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()){
            Integer node = q.poll();
            ans.add(node);

            for(Integer i : adj.get(node)){
                if(vis[i] == false){
                    vis[i] = true;
                    q.add(i);
                }
            }
        }

        return ans;
    }
}
