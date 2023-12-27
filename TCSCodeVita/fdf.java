package TCSCodeVita;

import java.util.*;

class KlarasFortresses{
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

        System.out.println(dijkstra(matrix));
    }

public static int[][] dijkstra(int[][] graph) {
    int rows = graph.length;
    int cols = graph[0].length;
    int[][] dist = new int[rows][cols];
    int[][] prev = new int[rows][cols];
    PriorityQueue<Node> queue = new PriorityQueue<>();

    // Initialize distance array
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            dist[i][j] = Integer.MAX_VALUE;
        }
    }

    // Set starting node
    Node start = new Node(0, 0);
    queue.add(start);

    while (!queue.isEmpty()) {
        Node curr = queue.poll();
        if (curr.x == rows - 1 && curr.y == cols - 1) {
            break;
        }

        // Explore neighbors
        for (int dir = 0; dir < 4; dir++) {
            int nextX = curr.x + dir % 2 == 0 ? curr.x : curr.x + dir / 2;
            int nextY = curr.y + dir / 2 == 0 ? curr.y : curr.y + dir / 2;

            if (nextX >= 0 && nextX < rows && nextY >= 0 && nextY < cols && graph[nextX][nextY] == 0) {
                int alt = dist[curr.x][curr.y] + 1;
                if (alt < dist[nextX][nextY]) {
                    dist[nextX][nextY] = alt;
                    prev[nextX][nextY] = curr.x;
                    prev[curr.x][curr.y] = nextX;
                }
            }
        }
    }

    return dist;
}

class Node implements Comparable<Node> {
    public int x, y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Node o) {
        return dist[o.x][o.y] - dist[this.x][this.y];
    }
}
}