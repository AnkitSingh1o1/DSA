package StrieverSheet.BT;

import java.util.*;


class Pair{
    Node node;
    int num;
    Pair(Node n, int i){
        this.node = n;
        this.num = i;
    }
}
public class AllTrav {
    public static void main(String[] args) {
        Node root = new Node(0);
        root.left = new Node(1);
        root.right = new Node(2);
        
        List<Integer> preOrder = new ArrayList<>();
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> postOrder = new ArrayList<>();

        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 1));

        while(!stack.isEmpty()){
            Pair curr = stack.pop();

            if(curr.num == 1){
                preOrder.add(curr.node.data);
                curr.num++;
                stack.push(curr);
                if(curr.node.left != null)
                stack.push(new Pair(curr.node.left, 1));
            }
            else if(curr.num == 2){
                inOrder.add(curr.node.data);
                curr.num++;
                stack.push(curr);

                if(curr.node.right != null)
                stack.push(new Pair(curr.node.right, 1));
            }
            else{
                postOrder.add(curr.node.data);
            }
        }

        System.out.println(preOrder);
        System.out.println(inOrder);
        System.out.println(postOrder);

    }
}
