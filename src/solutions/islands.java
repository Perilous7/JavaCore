package solutions;

public class islands {
    public int closedIsland(int[][] grid) {
        return 0;
    }

    public int findIsland(int[][] grid, int x, int y) {
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    findIsland(grid, i + 1, j);
                    findIsland(grid, i, j + 1);
                    findIsland(grid, i - 1, j);
                    findIsland(grid, i, j - 1);

                }
            }
        }
        return 0;
    }
}
