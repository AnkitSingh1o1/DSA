package TCSCodeVita;
import java.util.*;
public class SubStringQuest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        StringBuilder ans = new StringBuilder();
        int i = 0;
        boolean b = true;
        while(i < s1.length()){
            int j = i+1;
            if(s2.contains(s1.substring(i, j))){
            while(j <= s1.length() && (s2.contains(s1.substring(i, j)) || s2.contains(new StringBuilder(s1.substring(i, j)).reverse().toString()))){
                j++;
            }
            ans.append(s1.substring(i, j-1));
            ans.append("|");
            i = j-1;
            }
            else{
                b = false;
                break;
            }
        }

        if(b){
            System.out.println(ans.toString().substring(0, ans.length()-1));
        }
        else
        System.out.println("Impossible");

    }
}
