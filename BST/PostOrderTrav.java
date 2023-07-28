package BST;

import java.util.Stack;

//TC : O(N);
//SC : O(N);
public class PostOrderTrav {
    public static void main(String[] args) {
        Node root = new Node(0);
        postOrder(root);
    }

    private static void postOrder(Node root) {
        if(root == null)
        return;

        postOrder(root.left);

        postOrder(root.right);

        System.out.println(root.data);
    }
    
    //Using 2 stack
    private static void postOrderIterative(Node root){
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);

        while(!s1.isEmpty()){
            root = s1.pop();
            s2.push(root);
            if(root.left != null)
            s1.push(root.left);
            if(root.right != null)
            s1.push(root.right);
        }

        while(s2.isEmpty()){
            System.out.println(s2.pop().data);
        }
    }
    
}
