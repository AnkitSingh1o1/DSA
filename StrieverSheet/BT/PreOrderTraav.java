package StrieverSheet.BT;

import java.util.*;

//TC : O(N);
//SC : O(N);
public class PreOrderTraav {
    public static void main(String[] args) {
        Node root = new Node(0);
        preOrder(root);
        preOrderIterative(root);
    }

    public static void preOrder(Node root){
        if(root == null)
        return;

        System.out.println(root.data);

        preOrder(root.left);

        preOrder(root.right);

    }

    private static void preOrderIterative(Node root){
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            Node curr = stack.pop();
            System.out.println(curr.data);

            if(curr.right != null)
            stack.push(curr.right);

            if(curr.left != null)
            stack.push(curr.left);
        }
    }
}
