package TCSCodeVita;
import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str += " ";
        int n = sc.nextInt();

        ArrayList<String> v = new ArrayList<>();
        String temp = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                if(temp.length() > 0)
                v.add(temp);
                temp = "";
            }else{
                temp += str.charAt(i);
            }
        }



        for(int i = 0; i < v.size(); i++){
            int l = i-1, r = i + 1;
            
            if(l >= 0 && r < v.size() && (v.get(l).charAt(0) == v.get(r).charAt(0))){
                v.remove(r);
                i = 0;
            }
    
        }

        Queue<String> q = new LinkedList<>();
        for(String s : v){
            q.add(s);
        }

        int cnt=1;
        while(q.size()>1 || q.size() < n){
        if(cnt%n!=0){
            q.add(q.peek());
        }
        cnt++;
        q.poll();
        }
        System.out.println(q.peek());
    }
}
