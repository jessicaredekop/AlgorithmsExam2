/**
 * Course: Algorithms
 * Author: Jessica Redekop
 * Assignment: LeetCode15MProblemSet
 * Instructor: Diego Aguirre
 *
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
 */
public class BSTInsert {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(1);
        bt.add(2);
        bt.add(3);
        bt.add(4);
        bt.add(6);
        bt.add(7);
        bt.traversePostOrder(bt.root);
        System.out.println();
        //bt.insertIntoBST(bt.root,5)
    }
    /**
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }

     return root;
    }
     */
}
