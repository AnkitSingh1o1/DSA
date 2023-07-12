package SortingAlgo.pkg;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {3, 32, 5, 32, 666, 1};
        insertionSort(arr);

        for(int i : arr){
            System.out.println(i+" ");
        }
    }

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int temp = arr[i];
            int j = i-1;
            while( j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
