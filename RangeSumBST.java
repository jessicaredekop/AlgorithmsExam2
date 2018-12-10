/**
 * Course: Algorithms
 * Author: Jessica Redekop
 * Assignment: LeetCode15MProblemSet
 * Instructor: Diego Aguirre
 *
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
 */


public class RangeSumBST {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(1);
        bt.add(2);
        bt.add(3);
        bt.add(4);
        bt.add(5);
        bt.add(6);
        bt.traverseInOrder(bt.root);
        System.out.println();
        //bt.sumRange(bt.root,0,6,0);

    }
    /**void sumRange(TreeNode n, int lr, int rr, int sum) {
     *
     *
     *
     * .
     System.out.println(sumPreOrderRange(n, lr, rr, sum));
     sum = 0;
     }

     int sumPreOrderRange(TreeNode node, int lr, int rr, int sum) { //depth first search
     if (node != null) {
     if (lr <= node.val && rr >= node.val)
     sum += node.val;
     if (lr < node.val)
     sumPreOrderRange(node.left, lr, rr, sum);
     if (rr >= node.val)
     sumPreOrderRange(node.right,lr, rr, sum);
     }
     return sum;
     }
     */
}
