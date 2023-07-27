package Temp;

import java.util.*;
import java.io.*;

public class Gupta {
    public static void main(String[] args){
        String s = "Egg Ant Pen";
        System.out.println(findOrderedWords(s));
    }

    public static int findOrderedWords(String s){
        if(s.length() == 0 || s == ""){
            return 0;
        }
        
        int ans = 0;
        String[] arr = s.trim().split(" ");

        for(int i = 0; i < arr.length; i++){
            String temp = arr[i];
            int prev = Integer.MIN_VALUE;
            boolean b = true;
            for(int j = 0; j < temp.length(); j++){
                if((int)temp.charAt(j) >= prev){
                    prev = (int)temp.charAt(j);
                }
                else{
                    b = false;
                    break;
                }
            }

            ans += b == true ? 1 : 0;
        }

        return ans;
    }
}
