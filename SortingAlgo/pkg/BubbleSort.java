package SortingAlgo.pkg;

//Bubble Sort : Sorting by continuously sorting adjacent elements for n times
//TC: O(N^2)
//SC: O(1)
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,33, 4, 55, 32, 56};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);
        for(int i : arr)
        System.out.println(i+" ");
    }

public void bubbleSort(int[] arr){
    int n = arr.length;
    for(int i = 0; i < n; i++){
        boolean b = false;
        for(int j = 0; j < n-i-1; j++){
            if(arr[j] > arr[j+1]){
                b = true;
                swap(arr, j, j+1);
            }
        }
        if(!b) break;
    }
}

public void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
}
