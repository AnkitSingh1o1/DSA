package Temp;

public class GroceryStore {
    public static void main(String[] args){
        int N = 0, M = 0, K = 0;
        int[] arr = new int[N][M];
        System.out.println(fun(N, M, K, arr));
    }

    public static void fun(int n, int m, int k, int[] arr){
        int sum = 0;
        for(int i =0 ; i < n; i++){
            int temp = arr[i][0];
            for(int j = 0; j < m; j++){
                if(arr[i][j] <= k && arr[i][j] > temp){
                    temp = arr[i][j];
                }
            }
            sum += temp;
        }

        return Math.abs(k- sum);
    }
}
