package SortingAlgo.pkg;

//Insertion Sort : Divide array in two parts, first part is sorted
//and for each element of second part find the position of it in first part.
//TC: O(NlogN)
//SC: O(1)

public class QuickSort {
    public static void main(String[] argd){
        int[] arr = {3, 32, 5, 32, 666, 1};
        int n = arr.length;
        quickSort(arr, 0, n-1);

        for(int i : arr){
            System.out.println(i+" ");
        }
    }

    static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int partition = fun(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }

    }

    static int fun(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low, j = high;
        while(i < j){
            while(arr[i] <= pivot && i <= high-1){
                i++;
            }
            while(arr[j] > pivot && j >= low+1){
                j--;
            }
            if(i < j) 
            swap(arr, i, j);
        }
        swap(arr, low, j);

        return j;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
