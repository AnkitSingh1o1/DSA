class Solution{
    public static void main(String[] args) {
        
    }
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        // Write your code here
        int[] dist = new int[V];
        Arrays.fill(dist, (int)1e8);
        
        dist[S] = 0;
        
        for(int i = 0; i < V-1; i++){
            for(ArrayList<Integer> curr : edges){
                int u = curr.get(0);
                int v = curr.get(1);
                int wt = curr.get(2);
                
                if(dist[u] != (int)1e8 && dist[u]+wt < dist[v]){
                    dist[v] = dist[u]+wt;
                }
            }
        }
        
        //Nth relaxation to check for -ve cycle
        for(ArrayList<Integer> curr : edges){
            int u = curr.get(0);
            int v = curr.get(1);
            int wt = curr.get(2);
            if(dist[u] != (int)1e8 && dist[u]+wt < dist[v]){
                int[] temp = new int[1];
                temp[0] = -1;
                return temp;
            }
        }
        
        return dist;
    }
}