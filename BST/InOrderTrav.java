package BST;

import java.util.Stack;

//TC : O(N);
//SC : O(N);
public class InOrderTrav {
    public static void main(String[] args) {
        Node root = new Node(0);
        inOrder(root);
    }
    public static void inOrder(Node root){
        if(root == null)
        return;
        
        inOrder(root.left);

        System.out.println(root.data);

        inOrder(root.right);

    }

    public static void inOrderIterative(Node node){
        Stack<Node> stack = new Stack<>();
        while(true){
            if(node != null){
                stack.push(node);
                node = node.left;
            }
            else{
                if(stack.isEmpty()){
                    break;
                }
                node = stack.pop();
                System.out.println(node.data);
                node = node.right;
            }
        }

    }
}
