package graphs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class AdjacencyList {
    
    public static int dfs(String node, String target, HashMap<String, List<String>> adjList, HashSet<String> visit) {
        if (visit.contains(node)) {
            return 0;
        }
        if (node.equals(target)) {
            return 1;
        }
        visit.add(node);
        int count = 0;
        for (String neighbor: adjList.get(node)) {
            count += dfs(neighbor, target, adjList, visit);
        }
        visit.remove(node);
        return count;
    }

    public static int bfs(String node, String target, HashMap<String, List<String>> adjList) {
        Deque<String> queue = new ArrayDeque<>();
        HashSet<String> visit = new HashSet<>();
        queue.add(node);
        visit.add(node);
        int length = 0;
        while (!queue.isEmpty()) {
            int levelLength = queue.size();
            for (int i = 0; i < levelLength; i++) {
                String curr = queue.removeFirst();
                if (curr.equals(target)) {
                    return length;
                }
                for (String neighbor: adjList.get(curr)) {
                    if (!visit.contains(neighbor)) {
                        queue.add(neighbor);
                        visit.add(neighbor);
                    }
                }
            }
            length++;
        }
        return length;
    }

}
