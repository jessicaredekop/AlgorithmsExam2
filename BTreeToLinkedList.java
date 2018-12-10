/**
 * Course: Algorithms
 * Author: Jessica Redekop
 * Assignment: LeetCode15MProblemSet
 * Instructor: Diego Aguirre
 *
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
 */

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(){}

    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
class BinaryTree {

    TreeNode root;

    BinaryTree(){}

    TreeNode addRecursive(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }

        if (value < current.val) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.val) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    void traverseInOrder(TreeNode node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.val);
            traverseInOrder(node.right);
        }
    }

    void traversePreOrder(TreeNode node) {
        if (node != null) {
            System.out.print(" " + node.val);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(TreeNode node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.val);
        }
    }

}

public class BTreeToLinkedList {



    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(1);
        bt.add(2);
        bt.add(3);
        bt.add(4);
        bt.add(5);
        bt.add(6);
        bt.traversePostOrder(bt.root);
        flattenBTree(bt.root);
        bt.traverseInOrder(bt.root);

    }
    public static void flattenBTree(TreeNode root) {
        if (root == null) return;

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;

        flattenBTree(left);
        flattenBTree(right);

        root.right = left;
        TreeNode cur = root;
        while (cur.right != null) cur = cur.right;
        cur.right = right;
    }

}
