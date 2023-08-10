package StrieverSheet.BT;

import java.util.ArrayList;
import java.util.List;

import Node;

public class RootToNode {
    public static void main(String[] args) {
        Node root = new Node(0);
        root.left = new Node(2);
        root.right = new Node(3);
        int n = 3;
        List<Integer> path = new ArrayList<>();

        rootToNode(root, n, path);

        System.out.println(path);
    }

    private static boolean rootToNode(Node root, int n, List<Integer> path) {
        if(root == null)
        return false;

        path.add(root.data);
        if(root.data == n){
            return true;
        }

       if(rootToNode(root.left, n, path) || rootToNode(root.right, n, path)){
        return true;
       }

       path.remove(path.size()-1);
       return false;
    }
}
