class TopologicalSortDFS
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        boolean[] vis = new boolean[v];
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < v; i++){
            if(vis[i] == false){
                dfs(i, st, adj, vis);
            }
        }
        
        int[] ans = new int[v];
        for(int i = 0; i < v; i++){
            ans[i] = st.pop();
        }
        
        return ans;
    }
    
    private static void dfs(int node, Stack<Integer> st,
    ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        vis[node] = true;
        
        for(int it : adj.get(node)){
            if(vis[it] == false){
                dfs(it, st, adj, vis);
            }
        }
        
        st.push(node);
    }
}
