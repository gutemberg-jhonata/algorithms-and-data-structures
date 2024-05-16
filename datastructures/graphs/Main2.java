package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main2 {
    
    public static void main(String[] args) {
        HashMap<String, List<String>> adjList = new HashMap<>();
        HashSet<String> visit = new HashSet<>();
        String[][] edges = {{"A", "B"}, {"B", "C"}, {"B", "E"}, {"C", "E"}, {"E", "D"}};
        for (String[] edge: edges) {
            String src = edge[0], dst = edge[1];
            if (!adjList.containsKey(src)) {
                adjList.put(src, new ArrayList<>());
            }
            if (!adjList.containsKey(dst)) {
                adjList.put(dst, new ArrayList<>());
            }
            adjList.get(src).add(dst);
        }
        System.out.println(AdjacencyList.dfs("A", "E", adjList, visit));
        System.out.println(AdjacencyList.bfs("A", "E", adjList));
    }

}
