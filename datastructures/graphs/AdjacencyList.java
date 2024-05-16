package graphs;

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

}
