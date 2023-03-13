package com.rony.symmetric_tree_101;



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
        leftChild.left = new TreeNode(3);
        leftChild.right = new TreeNode(4);

        TreeNode rightChild = new TreeNode(2);
        rightChild.left = new TreeNode(4);
        rightChild.right = new TreeNode(3);

        TreeNode root = new TreeNode(1);
        root.left = leftChild;
        root.right = rightChild;

        System.out.println(solution.isSymmetric(root));
    }
    public boolean isSymmetric(TreeNode root) {
        return isSame(root.left,root.right);
    }
    public  boolean isSame(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null) return true;
        else if(t1 == null || t2 == null) return false;
        else if(t1.val != t2.val) return false;
        else {
            return isSame(t1.left, t2.right) && isSame(t1.right, t2.left);
        }
    }
}

