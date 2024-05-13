package graphs;

public class Main {
    
    public static void main(String[] args) {
        var matrix = new MatrixDFS();
        int[][] grid = {
            {0, 0, 0, 0},
            {1, 1, 0, 0},
            {0, 0, 0, 1},
            {0, 1, 0, 0}
        };
        int[][] visit = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        };
        System.out.println(matrix.dfs(grid, 0, 0, visit));
    }

}
