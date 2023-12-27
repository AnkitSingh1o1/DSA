package TCSCodeVita;

import java.util.Scanner;

public class Fortress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println(shortestPath(0, 0, m, n, matrix));
    }

    private static char[] shortestPath(int i, int j, int m, int n, int[][] matrix) {
        if(i < 0 || i >= m || j < 0 || j >= n)
        return 0;

        if(i == m-1 && j == n-1)
        return 1;
    }

}
