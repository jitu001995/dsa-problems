package org.dsa.dp.array.BU;

import java.util.Arrays;

public class Minimum_Path_Sum_Grid {
    public static void main(String[] args) {
      int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        int[][] grid2 = {
                {1, 2, 3},
                { 4, 5, 6}
        };

        int[][] grid3 = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
     int result = minPathSum(grid);
     System.out.println("Result :: "+result);


      int result2 =  miniPathSum2(grid2);
      System.out.println("Result 2 :: "+result2);

      int result3 = minPathSum3(grid3);
      System.out.println("Result 3 :: "+result3);
    }


    public static int minPathSum(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        // Fill the first row (left to right)
        for(int j = 1; j<n; j++){
            grid[0][j] +=grid[0][j-1];
        }
        // Fill the first column (top to bottom)
        for(int i=1; i<m; i++){
            grid[i][0] += grid[i-1][0];
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
    }


    public static int miniPathSum2(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        for(int i=1; i<n; i++){
            grid[0][i] +=grid[0][i-1];
        }
        for(int i=1; i<m; i++){
            grid[i][0] += grid[i-1][0];
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                grid[i][j] += Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
    }


    public static int minPathSum3(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        for(int i=1; i<m; i++){
            grid[0][i] += grid[0][i-1];
        }

        for(int j=1; j<n; j++){
            grid[j][0] +=grid[j-1][0];
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                grid[i][j] +=Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
    }

}
