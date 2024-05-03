import java.util.*;
class Triple implements Comparable<Triple>{
    int val;
    int i;
    int j;

    public Triple(int val, int i, int j){
        this.val = val;
        this.i =  i;
        this.j = j;
    }

    public int compareTo(Triple t){
        return Integer.compare(this.val, t.val);
    }
}
class TrafficFlow{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int i = sc.nextInt();
        int j = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        a--;
        b--;

        PriorityQueue<Triple> pq = new PriorityQueue<>();
        pq.add(new Triple(arr[i-1][j-1], i-1, j-1));

        boolean flag = false;
        while(!pq.isEmpty()){
            Triple temp = pq.poll();
            int val = temp.val, x = temp.i, y = temp.j;

            if(x == a && y == b){
                System.out.print(val);
                flag = true;
                break;
            }

            if(x+1 < n){
                pq.add(new Triple(val + arr[x+1][y], x+1, y));
            }
            if(y+1 < m){
                pq.add(new Triple(val+arr[x][y+1], x, y+1));
            }
        }

        if(!flag){
            System.out.print(-1);
        }
    }
}