package Temp;

import java.util.*;
class Pair{
    String name;
    String rName;
    Pair(String name, String rName){
        this.name = name;
        this.rName = rName;
    }
}

public class Romans {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("David IX");
        names.add("Steven XL");
        names.add("Steven XVI");
        names.add("David IX");
        names.add("Marry XV");
        names.add("Marry XIII");
        names.add("Marry XX");
      
        List<Pair> arr = new ArrayList<>();
        for(String s : names){
            arr.add(new Pair(s.substring(0, s.indexOf(" ")), 
            s.substring(s.indexOf(" ")+1, s.length())));
        }
        
        fun(arr);

        List<String> ans = new ArrayList<>();
        for(Pair p : arr){
            String s = ""+p.name+" "+p.rName;
            ans.add(s);
        }

        System.out.println(ans);
    }

    private static void fun(List<Pair> arr) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);


        Collections.sort(arr, new Comparator<Pair>() {

            @Override
            public int compare(Pair o1, Pair o2) {
               if(o1.name.equals(o2.name)){
                return findVal(o1.rName) - findVal(o2.rName);
               }
               else{
                return o1.name.compareTo(o2.name);
               }
            }

            private int findVal(String roman) {
                int prev = 0;
                int ans = 0;
                for(int i = roman.length()-1; i >= 0; i--){
                    int val = map.get(roman.charAt(i));
                    if(val >= prev){
                        ans += val;
                    }else{
                        ans -= val;
                    }
                    prev = val;
                }
                
                return ans;
            }
            
        });
    }
}
