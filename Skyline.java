/**
 * Course: Algorithms
 * Author: Jessica Redekop
 * Assignment: LeetCode15MProblemSet
 * Instructor: Diego Aguirre
 *
 * ----------------------------IDEAL PROCESS----------------------------
 * class: Skyline
 * IDENTIFY- In a 2 dimensional array grid, each value grid[i][j] represents the height of a building
 * located there. We are allowed to increase the height of any number of buildings, by any amount
 * (the amounts can be different for different buildings). Height 0 is considered to be a building as well.
 * At the end, the "skyline" when viewed from all four directions of the grid, i.e. top, bottom, left, and
 * right, must be the same as the skyline of the original grid. A city's skyline is the outer contour of
 * the rectangles formed by all the buildings when viewed from a distance. See the following example.
 * What is the maximum total sum that the height of the buildings can be increased?
 * DEFINE-The maximum height to increase buildings in order to not change the skyline is the minimum height of
 * both max heights of the row and column of the 2D array in the according index.
 * EXPLORE-Dynamic programming works in this problem because we are creating 2 arrays with the maximum on the rows
 * and the maximum of the columns. Then we are using those arrays to find the minimums of the max arrays to find
 * the greatest sum by subtracting the current height of the buildings by the minimum of both max arrays.
 * ANTICIPATE-The time-complexity of this method is O(n^2) because we have to iterate through the 2D array twice.
 *
 * LOOKBACK-
 * Notes: Fairly simple algorithm and implementation.
 */
public class Skyline {

    public static void main(String[] args) {
        int[][] A = {{3,0,8,4},
                    {2,4,5,7},
                    {9,2,6,3},
                    {0,3,1,0}};
        System.out.println(maxIncreaseKeepingSkyline(A));
    }

    public static int maxIncreaseKeepingSkyline(int[][] a) {
        int[] colsMaxA = new int[a.length];
        int[] rowsMaxA = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                rowsMaxA[i] = Math.max(rowsMaxA[i], a[i][j]);
                colsMaxA[j] = Math.max(colsMaxA[j], a[i][j]);
            }
        }

        int maxSum = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length; j++)
                maxSum += Math.min(rowsMaxA[i], colsMaxA[j]) - a[i][j];
        return maxSum;
    }
}
