package graphs;

import java.util.ArrayDeque;
import java.util.Deque;

public class MatrixBFS {
    
    public int bfs(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        Deque<int[]> queue = new ArrayDeque<>();
        int[][] visit = new int[ROWS][COLS];
        queue.add(new int[2]);
        visit[0][0] = 1;
        int length = 0;
        while (!queue.isEmpty()) {
            int levelLength = queue.size();
            for (int i = 0; i < levelLength; i++) {
                int[] pair = queue.removeFirst();
                int r = pair[0], c = pair[1];
                if (r == ROWS - 1 && c == COLS - 1) {
                    return length;
                }
                int[][] neighbors = {{r, c + 1}, {r, c - 1}, {r + 1, c}, {r - 1, c}};
                for (int j = 0; j < 4; j++) {
                    int newR = neighbors[j][0], newC = neighbors[j][1];
                    if (Math.min(newR, newC) < 0 ||
                        newR == ROWS || newC == COLS ||
                        visit[newR][newC] == 1 ||
                        grid[newR][newC] == 1) {
                        continue;
                    }
                    queue.add(neighbors[j]);
                    visit[newR][newC] = 1;
                }
            }
            length++;
        }
        return length;
    }

}
