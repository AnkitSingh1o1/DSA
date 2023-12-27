import java.util.*;
public class SortAndReflect{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

        String[] str1 = sc.nextLine().split(" ");
        int[] arr = new int[str1.length];
        for (int i = 0; i < str1.length; i++) {
            arr[i] = Integer.parseInt(str1[i]);
        }

        String[] str2 = sc.nextLine().split(" ");
        int[] brr = new int[str2.length];
        for (int i = 0; i < str2.length; i++) {
            brr[i] = Integer.parseInt(str2[i]);
        }

        int N = sc.nextInt();

        selectionSort(arr, brr, N);

        for(int i : brr)
        System.out.print(i+" ");
    }

    public static void selectionSort(int[] arr, int[] brr, int N){
    int n = arr.length;

    for(int i = 0; i < n-1 && N != 0; i++){
        int curr = i;
        for(int j = i+1; j < n; j++){
            if(arr[j] < arr[curr])
            curr = j;
        }

        if(curr != i)
        swap(arr, brr, curr, i);
        N--;
    }
}

    public static void swap(int[] arr, int[] brr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        int t = brr[a];
        brr[a] = brr[b];
        brr[b] = t;
    }
}
