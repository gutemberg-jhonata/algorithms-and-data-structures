package graphs;

public class Main {
    
    public static void main(String[] args) {
        //var matrix = new MatrixDFS();
        var matrix = new MatrixBFS();
        int[][] grid = {
            {0, 0, 0, 0},
            {1, 1, 0, 0},
            {0, 0, 0, 1},
            {0, 1, 0, 0}
        };
        //int[][] visit = new int[4][4];
        //System.out.println(matrix.dfs(grid, 0, 0, visit));
        System.out.println(matrix.bfs(grid));
    }

}
