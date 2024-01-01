import java.util.*;
public class DisjointSet {
    
    //Constructor of Disjoint Data Structure
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    public DisjointSet(int n){
        for(int i = 0; i <= n; i++){
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }

    //Find Ultimate Parent
    public int findUPair(int node){
        if(node == parent.get(node)){
            return node;
        }
        int ulp = findUPair(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }

    //Find Union By Rank Method to union(join) nodes
    //TC = O(4alpha) == constant
    public void unionByRank(int u, int v){
        int ulp_u = findUPair(u);
        int ulp_v = findUPair(v);
        if(ulp_u == ulp_v)
        return;
        if(rank.get(ulp_u) < rank.get(ulp_v)){
            parent.set(ulp_u, ulp_v);
        }
        else if(rank.get(ulp_v) < rank.get(ulp_u)){
            parent.set(ulp_v, ulp_u);
        }
        else{
            parent.set(ulp_v, ulp_u);
            int rankU = rank.get(ulp_u);
            rank.set(ulp_u, rankU+1);
        }
    }

    //Find Union By Size Method to union(join) nodes
    //TC = O(4alpha) == constant
    public void unionBySize(int u, int v){
        int ulp_u = findUPair(u);
        int ulp_v = findUPair(v);
        if(ulp_u == ulp_v)
        return;
        if(size.get(ulp_u) < size.get(ulp_v)){
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_v)+size.get(ulp_u));
        }else{
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_u)+size.get(ulp_v));
        }
    }
}
