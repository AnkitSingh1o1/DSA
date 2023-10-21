package Temp;

public class Neha {
    public static void main(String[] args) {
        int[] arr = {-1, 0, -2, -1};
        System.out.println(fun(arr));
    }

    private static int fun(int[] arr) {
        int maxSum = 0;
        int currentSum = 0;
        int start = -1;
        int end = -1;
        int tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                currentSum += arr[i];
                if (currentSum < maxSum) {
                    maxSum = currentSum;
                    start = tempStart;
                    end = i;
                }
            } else {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        int sum = 0;
        // If start and end are still -1, there are no negative elements in the array.
        if (start != -1 && end != -1) {
            for(int i = 0; i < arr.length; i++){
               if(i >= start && i <= end){
                    sum += (-arr[i]);
               }
               else{
                sum += arr[i];
               }
            }
        }

        return sum;
    }
}
