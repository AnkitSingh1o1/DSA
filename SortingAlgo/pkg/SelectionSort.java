package SortingAlgo.pkg;

//Selection Sort : 2 parts, first part is sorted and
//find the smallest in second part and place it in first part serially
//TC: O(N^2)
//SC: O(1)

public class SelectionSort {
    public static void main(String[] args){
    int[] arr = new int[]{2,7,1,4,67,42};
    selectionSort(arr);
    for(int i : arr)
    System.out.print(i+" ");
    }
public static void selectionSort(int[] arr){
    int n = arr.length;
    for(int i = 0; i < n-1; i++){
        int min = i;
        for(int j = i+1; j < n; j++){
            if(arr[j] < arr[min])
            min = j;
        }

        if(min != i)
        swap(arr, min, i);
    }
}

public static void swap(int[] arr, int a, int b){
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}
}