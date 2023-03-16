package com.rony.merge_two_binary_tree_617;

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // ---------------------------------------
        TreeNode leftChild = new TreeNode(3);
        leftChild.left = new TreeNode(35);
        leftChild.right = new TreeNode();

        TreeNode rightChild = new TreeNode(2);
//        rightChild.left = new TreeNode(4);
//        rightChild.right = new TreeNode(3);

        TreeNode root = new TreeNode(1);
        root.left = leftChild;
        root.right = rightChild;

        // ---------------------------------------
        TreeNode leftChild2 = new TreeNode(1);
        leftChild2.left = new TreeNode();
        leftChild2.right = new TreeNode(4);

        TreeNode rightChild2 = new TreeNode(3);
        rightChild2.left = new TreeNode();
        rightChild2.right = new TreeNode(7);

        TreeNode root2 = new TreeNode(2);
        root2.left = leftChild2;
        root2.right = rightChild2;


    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode node = new TreeNode();
        if (root1 != null && root2 != null) return null;
        int v1 = root1.val > 0 ? root1.val : 0;
        int v2 = root2.val > 0 ? root2.val : 0;
        TreeNode newNode = new TreeNode(v1+v2);
        newNode.left = mergeTrees(root1.left,root2.left);
        newNode.right = mergeTrees(root1.right,root2.right);
        return newNode;
    }
}
