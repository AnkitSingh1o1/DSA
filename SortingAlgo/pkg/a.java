import java.util.*;

public class a {

    public static void main(String[] args) {
        
        System.out.println(fun(5,5,5));

    }

    private static int helper(StringBuilder str, int r, int g, int y, int total){
        if(str.length()== total) return 1;
        int cnt=0;
        if(str.isEmpty() || (str.charAt(str.length()-1)!='R' && r>0)){
            str.append('R');
            cnt+=helper(str, r-1, g, y, total);
            str.deleteCharAt(str.length()-1);
        }
        if(str.isEmpty()|| (str.charAt(str.length()-1)!='G' && g>0)){
            str.append('G');
            cnt+=helper(str, r, g-1, y, total);
            str.deleteCharAt(str.length()-1);
        }
        if(str.isEmpty() || (str.charAt(str.length()-1)!='Y' && y>0)){
            str.append('Y');
            cnt+=helper(str, r, g, y-1, total);
            str.deleteCharAt(str.length()-1);
        }
        return cnt;
    }
    private static int fun(int r, int g, int y){
        StringBuilder str = new StringBuilder();

        return helper(str, r, g, y, r+g+y);
    }
}
