package StrieverSheet.Graph;

    class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int[] indegree = new int[v];
        
        for(List<Integer> a : adj){
            for(int i : a){
                indegree[i]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < v; i++){
            if(indegree[i] == 0)
            q.add(i);
        }
        
        int[] ans = new int[v];
        int i = 0;
        
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            
            ans[i++] = node;
            
            for(int it : adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.add(it);
                }
            }
        }
        return ans;
    }
}

