package com.rony.n_ary_tree_preorder_traversal_589_easy;

import com.rony.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root == null) return list;
        list.add(root.val);
        for(Node node: root.children){
            preorder(node);
        }

        return list;
    }

}
