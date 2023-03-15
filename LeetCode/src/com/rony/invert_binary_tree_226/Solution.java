package com.rony.invert_binary_tree_226;

// TODO DFS
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
        TreeNode leftChild = new TreeNode(2);
        leftChild.left = new TreeNode(1);
        leftChild.right = new TreeNode(3);

        TreeNode rightChild = new TreeNode(7);
        rightChild.left = new TreeNode(6);
        rightChild.right = new TreeNode(9);

        TreeNode root = new TreeNode(4);
        root.left = leftChild;
        root.right = rightChild;

        TreeNode head = solution.invertTree(root);

    }
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        return root;
    }



}
