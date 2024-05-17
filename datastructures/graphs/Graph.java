package graphs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph {
    private Map<Integer, Set<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addEdge(int src, int dst) {
        if (!adjList.containsKey(src)) {
            adjList.put(src, new HashSet<>());
        }
        if (!adjList.containsKey(dst)) {
            adjList.put(dst, new HashSet<>());
        }
        adjList.get(src).add(dst);
    }

    public boolean removeEdge(int src, int dst) {
        if (!adjList.containsKey(src)) {
            return false;
        }
        return adjList.get(src).remove(dst);
    }

    public boolean hasPath(int src, int dst) {
        Deque<Integer> queue = new ArrayDeque<>();
        Set<Integer> visit = new HashSet<>();
        queue.add(src);
        visit.add(src);
        while (!queue.isEmpty()) {
            int levelLength = queue.size();
            for (int i = 0; i < levelLength; i++) {
                Integer curr = queue.removeFirst();
                if (curr.equals(dst)) {
                    return true;
                }
                for (Integer neighbor: adjList.get(curr)) {
                    if (!visit.contains(neighbor)) {
                        queue.add(neighbor);
                        visit.add(neighbor);
                    }
                }
            }
        }
        return false;
    }
}
