/**
 * Course: Algorithms
 * Author: Jessica Redekop
 * Assignment: LeetCode15MProblemSet
 * Instructor: Diego Aguirre
 *
 * ----------------------------IDEAL PROCESS----------------------------
 * class: Search2DArray
 * IDENTIFY- Write an efficient algorithm that searches for a value in an m x n matrix.
 * This matrix has the following properties:
 *  •Integers in each row are sorted in ascending from left to right.
 *  •Integers in each column are sorted in ascending from top to bottom.
 * DEFINE- As the values are positioned in the array, every y value located below each x value is greater than the
 * one above, also, rotating the algorithm to the columns of the array, every value to the right of the array is
 * greater than the value to the left.
 * EXPLORE- For the specified properties, if a value at the final index of our column is greater, we will increment
 * the row to the next row below. If the value is less than the value at the index in the array, the column will
 * decrement. If the value does not exist in the matrix, the algorithm will lead to a row or column that is invalid
 * for the matrix, breaking the while (search) loop, and return false.
 * ANTICIPATE-Anticipating time complexity to be O(n) because this algorithm will never iterate through all elements
 * in the array.
 *
 * LOOKBACK-
 * Notes: This is a perfect example of a simple problem that can be made very efficient if the problem is clearly defined.
 */
public class Search2DArray {

    public static void main(String[] args) {
        int[][] A = {{1,4,7,11,15},
                    {2,5,8,12,19},
                    {3,6,9,16,22},
                    {10,13,14,17,24},
                    {18,21,23,26,30}};
        int n = 20;
        System.out.println("The number " + n + " is in the array: " + search2DArray(A,n));
    }

    public static boolean search2DArray(int[][] a, int n) {
        if (a.length < 1 || a[0].length <1) return false;

        int x = 0;
        int y = a[0].length-1;
        while (y >= 0 && x <= a.length-1) {
            if (n == a[x][y])
                return true;
            else if (n < a[x][y]) y--;
            else if (n > a[x][y]) x++;
        }
        return false;
    }
}
