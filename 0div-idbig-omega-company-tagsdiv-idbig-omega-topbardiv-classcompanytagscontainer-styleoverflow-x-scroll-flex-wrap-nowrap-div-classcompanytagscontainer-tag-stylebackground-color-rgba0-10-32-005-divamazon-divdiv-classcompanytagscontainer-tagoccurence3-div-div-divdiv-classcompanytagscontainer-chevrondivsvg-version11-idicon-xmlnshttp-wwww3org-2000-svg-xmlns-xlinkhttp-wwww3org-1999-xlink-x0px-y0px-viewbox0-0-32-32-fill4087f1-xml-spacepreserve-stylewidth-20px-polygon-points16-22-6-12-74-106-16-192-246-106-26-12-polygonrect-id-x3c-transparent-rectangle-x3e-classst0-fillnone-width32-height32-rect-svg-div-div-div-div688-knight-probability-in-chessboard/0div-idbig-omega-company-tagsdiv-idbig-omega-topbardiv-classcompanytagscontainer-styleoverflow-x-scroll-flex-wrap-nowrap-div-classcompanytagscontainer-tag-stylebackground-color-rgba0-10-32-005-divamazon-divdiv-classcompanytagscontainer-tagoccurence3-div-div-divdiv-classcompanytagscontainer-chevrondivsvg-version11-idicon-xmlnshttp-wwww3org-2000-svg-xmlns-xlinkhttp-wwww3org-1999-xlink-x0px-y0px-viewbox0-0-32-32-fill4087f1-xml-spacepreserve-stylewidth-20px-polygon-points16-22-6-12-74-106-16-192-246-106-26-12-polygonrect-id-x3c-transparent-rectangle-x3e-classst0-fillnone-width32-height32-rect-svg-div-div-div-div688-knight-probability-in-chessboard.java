class Solution {
     public double knightProbability(int n, int k, int row, int column) {
        double[][][] dp = new double[n][n][k + 1];

        for (double[][] temp : dp) {
            for (double[] temp2 : temp) {
                Arrays.fill(temp2, -1);
            }
        }

        return validMoves(n, k, row, column, dp);

    }

    public double validMoves(int n, int k, int row, int column, double[][][] dp) {
        if (k < 0 || row >= n || row < 0 || column >= n || column < 0) {
            return 0;
        }
        if (k == 0) {
            return  1;
        }

        if (dp[row][column][k] != -1) {
            return dp[row][column][k];
        }


        double result = (validMoves(n, k-1, row - 2, column - 1, dp) +
                validMoves(n, k-1, row - 2, column + 1, dp) +
                validMoves(n, k-1, row + 2, column + 1, dp) +
                validMoves(n, k-1, row + 2, column - 1, dp) +
                validMoves(n, k-1, row - 1, column - 2, dp) +
                validMoves(n, k-1, row + 1, column - 2, dp) +
                validMoves(n, k-1, row + 1, column + 2, dp) +
                validMoves(n, k-1, row - 1, column + 2, dp)) * 0.125;

        return dp[row][column][k] = result;


    }
}