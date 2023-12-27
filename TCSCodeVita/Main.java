package TCSCodeVita;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getStringFromRank(29, 2));
    }

    public static String getStringFromRank(int rank, int length) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        int factorial = 1;
        for (int i = 2; i <= length; i++) {
            factorial *= i;
        }

        rank -= 1;
        List<Character> result = new ArrayList<>();

        for (int i = length - 1; i >= 0; i--) {
            factorial /= (i + 1);
            int index = (int)rank / factorial;
            char character = alphabet.charAt(index);
            result.add(character);
            rank %= factorial;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (char character : result) {
            stringBuilder.append(character);
        }

        return stringBuilder.toString();
    }
}

