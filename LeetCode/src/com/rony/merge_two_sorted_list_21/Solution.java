package com.rony.merge_two_sorted_list_21;


/**
 * Definition for singly-linked list.

 */
public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next =  new ListNode(9);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = null;

        Solution solution = new Solution();
        solution.mergeTwoLists();
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}