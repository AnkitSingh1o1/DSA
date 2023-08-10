package Temp;
int ans = Integer.MIN_VALUE;
public class Taxi {
    public static void main(String[] args) {
        int[] pickUp = new int[6];
        int[] drop = new int[6];
        int[] tip = new int[6];

        System.out.print(fun(0, 0, pickUp, drop, tip));
    }

    public static int fun(int idx, int sum, int[] pickUp, int[] drop, int[] tip){
        
        if(idx >= pickUp.length){
            ans = Math.max(ans, sum);
            return;
        }

        fun(idx+1, sum+((drop[idx]-pickUp[idx])+tip[idx]), pickUp, drop, tip);

        fun(idx+1, sum, pickUp, drop, tip);
    }
}
