package Temp;
//Vowel is present or not
//Palindrome 
import java.util.*;
public class Tem {
    public static void main(String[] args) {
        String s = "abba";
        if(vowelFinder(s)){
            System.out.println("PRESENT");
        }
        else{
            System.out.println("NOT PRESENT");
        }

        if(palindrome(s)){
            System.out.println("IS PALINDROME");
        }else{
            System.out.println("NOT A PALINDROME");
        }
    }

    public static boolean palindrome(String s){

        StringBuilder sb = new StringBuilder();
        sb.append(s);

        return s.equals(sb.reverse().toString());
    }

    
    public static boolean vowelFinder(String s){
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i)))
            return true;
        }

        return false;
    }
}
