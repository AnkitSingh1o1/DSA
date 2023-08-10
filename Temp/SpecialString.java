package Temp;

import java.util.*;

public class SpecialString {
    public static void main(String[] args) {
        String[] arr = {"121", "3", "12345", "11234"};
        System.out.println(fun("111222333444", arr));
    }

    private static List<Integer> fun(String str, String[] arr) {
        List<Integer> ans = new ArrayList<>();
        Set<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()){
            set.add(ch);
        }

        
        for(int i = 0; i < arr.length; i++){
            String s = arr[i];
            HashMap<Character, Integer> map = new HashMap<>();
            boolean b = false;
            for(char ch : s.toCharArray()){
                if(set.contains(ch)){
                    map.put(ch, map.getOrDefault(ch, 0)+1);
                }
                else{
                    ans.add(-1);
                    b = true;
                    break;
                }
            }

           if(b == false){
                for(int z = 0; z < str.length(); z++){
                    if(map.size() == 0){
                        ans.add(z);
                        break;
                    }
                    char ch = str.charAt(z);
                    if(map.containsKey(ch)){
                        map.put(ch, map.get(ch)-1);
                        if(map.get(ch) == 0)
                        map.remove(ch);
                    }
                }
            }
     }

        return ans;
    }

    
}
