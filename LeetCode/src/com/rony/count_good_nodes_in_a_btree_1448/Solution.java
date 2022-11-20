package com.rony.count_good_nodes_in_a_btree_1448;

import com.sun.source.tree.Tree;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode four = new TreeNode(4);
        TreeNode one1 = new TreeNode(1);
        TreeNode one2 = new TreeNode(1);
        TreeNode three1 = new TreeNode(3);
        TreeNode three2 = new TreeNode(3);
        TreeNode five = new TreeNode(5);
        three1.left = one1;
        one1.left = three2;
        one1.right = null;
        three1.right = four;
        four.left = one2;
        four.right = five;
        one2.left = null;
        one2.right = null;
        five.left = null;
        five.right = null;

        solution.goodNodes(three1);
    }

    public int goodNodes(TreeNode root) {
        int count = 0;
        TreeNode copy = root;

        return count;
    }
}

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