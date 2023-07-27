package HappiestMind;
import java.util.*;

public class Coins{
    public static void main(String[] args) {
        int[] arr = { 2,3,4,5,6,7};
        int size = 6;

        int result = hasCycleInDependencies(size, arr);
        System.out.println("Output: " + result);
    }

    public static int hasCycleInDependencies(int size, int[] arr) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        // Build the graph
        for (int i = 0; i < size; i++) {
            int coin = i + 1;
            int dependency = arr[i];
            graph.putIfAbsent(coin, new ArrayList<>());
            graph.get(coin).add(dependency);
        }

        // Keep track of visited coins and recursion stack
        Set<Integer> visited = new HashSet<>();
        Set<Integer> recursionStack = new HashSet<>();

        for (int i = 1; i <= size; i++) {
            if (!visited.contains(i) && hasCycle(graph, i, visited, recursionStack)) {
                return 0; // Cycle found, return 0
            }
        }

        return 1; // No cycle found, return 1
    }

    private static boolean hasCycle(Map<Integer, List<Integer>> graph, 
    int coin, Set<Integer> visited, Set<Integer> recursionStack) {
        visited.add(coin);
        recursionStack.add(coin);

        List<Integer> dependencies = graph.getOrDefault(coin, new ArrayList<>());
        for (int dependency : dependencies) {
            if (!visited.contains(dependency)) {
                if (hasCycle(graph, dependency, visited, recursionStack)) {
                    return true;
                }
            } else if (recursionStack.contains(dependency)) {
                return true; // Cycle detected
            }
        }

        recursionStack.remove(coin);
        return false;
    }
}
