package StrieverSheet.BT;

class CountNodes{
    public static void main(String[] args) {
        Node root = new Node(0);
        root.left = new Node(-1);
        System.out.println(countNode(root));
    }

    private static int countNode(Node root) {
        if(root == null)
        return 0;

        int left = getHeightLeft(root);
        int right = getHeightRight(root);

        if(left == right)
        return ((2<<(left)-1));

        else 
        return countNode(root.left)+countNode(root.right)+1;
    }

    private static int getHeightRight(Node root) {
        int count = 0;
        while(root.left != null){
            count++;
            root = root.left;
        }
        return count;
    }

    private static int getHeightLeft(Node root) {
        int count = 0;
        while(root.left != null){
            count++;
            root = root.left;
        }
        return count;
    }
}