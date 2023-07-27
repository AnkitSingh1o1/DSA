package SAP;

import java.util.HashSet;

public class DistinctNumbers {
    public static void main(String[] args){
        int n = 8;
        int[] arr = {1,1,3,2,1,4,5,4};

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            if(set.isEmpty() || !set.contains(arr[i])){
                set.add(arr[i]);
                System.out.print(arr[i]+" ");
            }
        }
    }
}
