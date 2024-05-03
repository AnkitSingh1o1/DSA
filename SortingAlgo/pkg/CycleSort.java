package SortingAlgo.pkg;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {2, 10, 4, 1, 9, 7};

        cycleSort(arr);

        for(int i : arr){
            System.out.println(i);
        }
    }

    private static void cycleSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; ){
            int curr = arr[i];
            int lessThan = 0;
            for(int j = i+1; j < n; j++){
                if(arr[j] < curr)
                lessThan++;
            }
            if(lessThan == 0)
            i++;
            else
            swap(i, lessThan, arr);
        }
    }

    private static void swap(int i, int lessThan, int[] arr){
        int temp = arr[i];
        arr[i] = arr[lessThan];
        arr[lessThan] = temp;
    }
}
