package com.rony;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddTwo_2 {
    public static void main(String[] args) {
//        AddTwo_2 obj = new AddTwo_2();
//        AddTwo_2.Solution s = obj.new Solution();
//        List<Integer> list1 = new LinkedList<>();
//        list1.addAll(Arrays.asList(2,4,3));
//        System.out.println(list1);
//        List<Integer> list2 = new LinkedList<>();
//        list2.addAll(Arrays.asList(5,6,4));
//        System.out.println(list2);
//        s.addTwoNumbers(list1,list2);


    }



    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            return null;
        }
    }

}
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
/**
 * ------Example 1:----------
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807
 *
 * -------Example 2:----------
 *
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 *
 * --------Example 3:----------
 *
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */