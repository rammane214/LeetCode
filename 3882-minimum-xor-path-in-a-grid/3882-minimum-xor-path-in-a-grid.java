class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // grid values are in range [0, 1023]
        int MAX_XOR = 1024;

        boolean[][][] dp = new boolean[m][n][MAX_XOR];

        // Start from top-left
        dp[0][0][grid[0][0]] = true;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // Move from top
                if (i > 0) {
                    for (int x = 0; x < MAX_XOR; x++) {
                        if (dp[i - 1][j][x]) {
                            int newXor = x ^ grid[i][j];
                            dp[i][j][newXor] = true;
                        }
                    }
                }

                // Move from left
                if (j > 0) {
                    for (int x = 0; x < MAX_XOR; x++) {
                        if (dp[i][j - 1][x]) {
                            int newXor = x ^ grid[i][j];
                            dp[i][j][newXor] = true;
                        }
                    }
                }
            }
        }

        // Find minimum XOR at destination
        for (int x = 0; x < MAX_XOR; x++) {
            if (dp[m - 1][n - 1][x]) {
                return x;
            }
        }

        return -1;
    }
}