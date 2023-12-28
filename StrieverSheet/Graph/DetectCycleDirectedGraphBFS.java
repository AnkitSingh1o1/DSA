package StrieverSheet.Graph;

//BFS
//Using Kahn's ALgorithm
//Step 1 : Use Kahn's Algo to Print Topological Sorted ArrayList;
//Step 2 : If the size of topological sort is less then 'n'(number of nodes) than a CYCLE is PRESENT
//Otherwise CYCLE is NOT PRESENT
//Intituation : Topological Sort only works on DAG(Directed Acyclic Graph)
public class DetectCycleDirectedGraphBFS {
    public static void main(String[] args) {
        isCyclic(int v, ArrayList<ArrayList<Integer>> adj);
    }

    private static boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj){
        int[] indegree = new int[v];
        for(List<Integer> ls : adj){
            for(int i : ls){
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
            int node = q.poll();
            ans[i++] = node;
            for(int it : adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0)
                q.add(it);
            }
        }
        return ans.length == v ? false : true;
        //false : NO CYCLE
        //true  : CYCLE
    }
}
