package TCSCodeVita;

import java.util.*;
public class GoodString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String goodString = sc.nextLine();
        String name = sc.nextLine();

        int ans = 0;
        char prevGoodLetter = goodString.charAt(0);

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            int minDistance = Integer.MAX_VALUE;
            char minLetter = ' ';

            for (int j = 0; j < goodString.length(); j++) {
                char c = goodString.charAt(j);
                int dist = Math.abs(ch - c);
                if (dist < minDistance || (dist == minDistance && c > prevGoodLetter)) {
                    minLetter = c;
                    minDistance = dist;
                }
            }

            ans += minDistance;
            prevGoodLetter = minLetter;
        }

        System.out.println("Total distance: " + ans);
    }
}