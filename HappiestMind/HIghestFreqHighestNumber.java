
import java.io.*;
import java.util.*;

public class HIghestFreqHighestNumber {
    public static void main(String[] args) throws IOException{

        //Input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArray = br.readLine().split(" ");
        int[] arr = new int[strArray.length];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(strArray[i]);
        }

        //Logic
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        int maxFreq = Integer.MIN_VALUE, maxKey = Integer.MIN_VALUE;
        for(var v : map.entrySet()){
            int key = v.getKey();
            int val = v.getValue();

            if(val >= maxFreq && key > maxKey){
                maxFreq = val;
                maxKey = key;
            }
        }

        System.out.println(maxKey);

    }
}
