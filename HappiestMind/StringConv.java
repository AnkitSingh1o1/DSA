
public stataic int[] Solution(int n, int[] arr){

    int[] ans = new int[arr.length];
    int j = 0;
    for(int i : arr){
        ans[j++] = findSum(i);
    }

    return ans;
}

public static int findSum(int n){
    int sum = 0;
    whiile(n != 0){
        int temp = n%10;
        sum += temp;
        n /= 10;
    }
    return sum;
}