# AlgorithmsExam2
* ----------------------------IDEAL PROCESS----------------------------
 * class: BSTInsert
 * IDENTIFY- Given the root node of a binary search tree (BST) and a value to be inserted into the tree,
 * insert the value into the BST. Return the root node of the BST after the insertion. It is guaranteed
 * that the new value does not exist in the original BST.
 * DEFINE- This is a basic implementation of an insert method which i decided to add into my BSTree class
 * actuator.
 * EXPLORE- Recursion is the best solution to iterate through the tree and concatenate the rest afterwards.
 * ANTICIPATE-I anticipate the time-complexity of this to mirror depth-first search of O(V+E)O(V+E)
 *
 * LOOKBACK-
 * Notes: BSTrees are easiest to traverse through recursion.
 
 * ----------------------------IDEAL PROCESS----------------------------
 * class: BTreeToLinkedList
 * IDENTIFY- Given a binary tree, flatten it to a linked list in-place.
 * DEFINE- I believe the problem is clearly defined in the IDENTIFY section.
 * EXPLORE- Recursively iterate through the left and right subtree and concatonate each sublist to the
 * right child of the root.
 * ANTICIPATE- This solution should recursively flatten both sides of the binary tree.
 *
 * LOOKBACK-
 * Notes: My while loop traverses the subtree to find the tail every time in order to concatenate the rest of the tree
 
 
 * ----------------------------IDEAL PROCESS----------------------------
 * class: countPalindromicSubstrings
 * IDENTIFY- Find all palindromes in a given string
 * DEFINE- The palindromes can be of length 1, they also don't have to be in the center of the word.
 * EXPLORE- I think if you start at the beginning and check if there is a palindrome from that index.
 * you can count how many palindromes there are until there is an instance where the work is not a
 * palindrome anymore.
 * ANTICIPATE-Anticipating time complexity to be O(n^2), and the solution must always be AT LEAST the
 * length of the string.
 *
 * LOOKBACK-
 * Notes: I was able to solve this problem by deconstructing the smallest problem and modifying it for
 * a larger string.
 
 * ----------------------------IDEAL PROCESS----------------------------
 * class: FindDuplicateInArray
 * IDENTIFY- Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
 * prove that at least one duplicate number must exist. Assume that there is only one duplicate number,
 * find the duplicate one.
 * DEFINE- Because each integer is between 1 and n, and there can only be a duplicate in an array of size n+1
 * there has to be at least 1 duplicate.
 * EXPLORE- The duplicate will be the sum of the array - (length of the array - 1 + "" - 2 + etc...).
 * I also wanted to use a method that calculates te sum of an array, so that was through streams.
 * ANTICIPATE-Anticipating time complexity to be that of the stream sum to be O(n) and the n+ n-1 + n-2+...
 * should result to O(n) time.
 *
 * LOOKBACK-
 * Notes: I like this solution, however I never created it if it would work on arrays of size 1, but it did (:
 
  * ----------------------------IDEAL PROCESS----------------------------
 * class: kthLargestinArray
 * IDENTIFY- Find kth largest element in an array.
 * DEFINE- kth largest does not mean index, it means the element itself including duplicates.
 * EXPLORE- I'd like to tamper with Java tools, so I's like to implement Arrays.sort(A) in my algorithm.
 * ANTICIPATE-Anticipating time complexity to be that of Arrays.sort(A) and a O(n) to find the kth element.
 * I know I have to go through the array at least once in order to find what the largest element is.
 *
 * LOOKBACK-
 * Notes: I's use merge sort if I had to sort the array by hand.
 
  * ----------------------------IDEAL PROCESS----------------------------
 * class: MinimumTime
 * IDENTIFY- Given a singly linked list, group all odd nodes together followed by the even nodes. Please note
 * here we are talking about the node number and not the value in the nodes.
 * You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 * DEFINE- Problem is clearly defined in "IDENTIFY"
 * EXPLORE- I'd convert every time into how many minutes into the day it is, and find the minimum of the minutes
 * subtracted to the given time, or added to the given time.
 * ANTICIPATE- I anticipate the time-complexity of this to be O(n).
 *
 * LOOKBACK-
 * Notes: N/A Didn't complete
 
  * ----------------------------IDEAL PROCESS----------------------------
 * class: OddEvenLinkedList
 * IDENTIFY-Given a list of 24-hour clock time points in "Hour:Minutes" format, find the minimum minutes
 * difference between any two time points in the list.
 * DEFINE- There are only two differences in a 24 hour clock time. Iterating thrugh time forwards and backwards,
 * We have to return the minimum time.
 * EXPLORE- Traverse list until you find an even number, keep that node in a 2nd head, keep traversing list whilst
 * adding the even nodes to the head of the first even, and the odds as the next to the first list, then once
 * the list is null, concatonate the even's list head to the tail of the odd's list.
 * ANTICIPATE- I anticipate the time-complexity of this to be O(n).
 *
 * LOOKBACK-
 * Notes: Nothing new in thi algorithm
 
  * ----------------------------IDEAL PROCESS----------------------------
 * class: RangeSumBST
 * IDENTIFY- Given the root node of a binary search tree, return the sum of values of all nodes with value
 * between L and R (inclusive).
 * The binary search tree is guaranteed to have unique values.
 * DEFINE- Because of the unique values, we do not have to worry about continuing the traversal throughout the
 * tree to sum duplicate values.
 * EXPLORE- We can begin with a pre-order traversal trough the tree, to find the smallest value between l and
 * sum the values of the nodes (as depth-first search) until the values exceed the value of r.
 * ANTICIPATE- I anticipate the time-complexity of this to mirror depth-first search of O(V+E)O(V+E)
 *
 * LOOKBACK-
 * Notes: I chose to implement this as an actuator in the implementation of a binary tree because it seemed
 * more appropriate.
 
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
