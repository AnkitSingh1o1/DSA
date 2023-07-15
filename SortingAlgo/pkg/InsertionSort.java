package SortingAlgo.pkg;

//Insertion Sort : Divide array in two parts, first part is sorted
//and for each element of second part find the position of it in first part.
//TC: O(N^2)
//SC: O(1)
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
