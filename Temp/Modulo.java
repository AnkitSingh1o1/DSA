package Temp;
public int ans = 0;
public class Modulo {
    public static void main(String[] args) {
        int[] arr = new int[4];
        int[] ans = new int[1];
        fun(0, root, k, ans);
        
    }

    private static int fun(int sum, Node root, int k, int[] ans) {
        if(root == null)
        return 0;
        
        // if((root.val+fun(root.left, k, ans))%k == 0)
        // ans[0]++;

        // if((root.val+fun(root.right, k, ans))%k == 0)
        // ans[0]++;

        sum += root.val;
        if(sum % k == 0)
        ans[0]++;
        fun(root.left, k, ans);

        sum -= root.val;
        if(sum % k == 0)
        ans[0]++;
        fun(root.right, k, ans);

        return ans[0];
    }

   
}
