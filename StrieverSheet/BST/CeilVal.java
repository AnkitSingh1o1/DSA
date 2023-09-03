package StrieverSheet.BST;

import StrieverSheet.BT.Node;

public class CeilVal {
    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(5);
        root.right = new Node(7);
        System.out.println(fun(root, 5, -1));
    }

    private static int fun(Node root, int v, int ceil){

       while(root != null){
            if(root.val == v){
                ceil = root.val;
                return ceil;
            }

            if(v > root.val){
                root = root.right;
            }
            else{
                ceil = root.val;
                root = root.left;
            }
       }
       return ceil;
    }

    
}
