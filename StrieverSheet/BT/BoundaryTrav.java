package StrieverSheet.BT;

import java.util.*;

import Node;

public class BoundaryTrav {
    public static boolean isLeaf(Node n) {

        if(n.left == null && n.right == null)
        return true;

        return false;
    }
     public static void addLeftBoundary(Node r, List<Integer> ans) {
        Node curr = r.left;
        while(curr != null){
            if(isLeaf(curr) == false)
            ans.add(curr.data);
            if(curr.left != null){
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }
    }
    
    public static void addLeafs(Node n, List<Integer> ans) {
        if(isLeaf(n)){ 
            ans.add(n.data);
            return;
        }

        if(n.left != null)
        addLeafs(n.left, ans);

        if(n.right != null)
        addLeafs(n.right, ans);
    }

    public static void addRightBoundary(Node n, List<Integer> ans) {
        Node curr = n.right;
        List<Integer> temp = new ArrayList<>();

        while(curr != null){
            if(isLeaf(curr) == false)
            temp.add(curr.data);
            if(curr.right != null){
                curr = curr.right;
            }
            else{
                curr = curr.left;
            }
        }

        for(int i = temp.size()-1; i >= 0; i--){
            ans.add(temp.get(i));
        }
    }
    public static void main(String[] args) {
        Node root = new Node(0);
        root.left = new Node(1);
        root.right = new Node(2);

        List<Integer> ans = new ArrayList<>();
        if(isLeaf(root) == false) ans.add(root.data);

        addLeftBoundary(root, ans);

        addLeafs(root, ans);

        addRightBoundary(root, ans);

        System.out.println(ans);
    }
}