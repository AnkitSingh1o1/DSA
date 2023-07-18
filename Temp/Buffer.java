package Temp;

import java.io.*;

public class Buffer {
    private static final int In = 0;

    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //String s = br.readLine();
    //int n = Integer.parseInt(s);
    //String[] str = br.readLine().split(" ");
    //int[] arr = new int[str.length];

        // for(int i = 0 ; i < str.length; i++){
        //     arr[i] = Integer.parseInt(str[i]);
        // }
        // for(int i : arr)
        // System.out.println(i);


        // int a[] = new int[n];
        // String line = br.readLine(); // to read multiple integers line
        // String[] strs = line.trim().split("\\s+");

        // for(String s : strs){
        //     System.out.println(s);
        // }
        
        int rows = Integer.parseInt(br.readLine());
        int cols = Integer.parseInt(br.readLine());
        int[][] arr = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            String temp = br.readLine();
            String[] temparr = temp.split(" ");
            for(int j = 0; j < cols; j++){
                arr[i][j] = Integer.parseInt(temparr[i]);
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }
}
