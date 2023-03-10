package com.rony. merge_two_sorted_list_21;


/**
 * Definition for singly-linked list.

 */
public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next =  new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = null;

        ListNode list1 = new ListNode(5);
        list1.next = new ListNode(6);
        list1.next.next =  new ListNode(7);
        list1.next.next.next = new ListNode(8);
        list1.next.next.next.next = null;

        Solution solution = new Solution();
        ListNode listNode = solution.mergeTwoLists(list1, head);
        solution.printNodes(listNode);
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode head = result;
        while(list1 != null && list2 !=null){
            if(list1.val <= list2.val){
                result.next = list1;
                list1 = list1.next;
            }
            else {
                result.next = list2;
                list2 = list2.next;
            }
            result = result.next;
        }
        while (list1 != null){
            result.next = list1;
            list1 = list1.next;
            result = result.next;
        }
        while (list2 != null){
            result.next = list2;
            list2 = list2.next;
            result = result.next;
        }

        return head.next;
    }

    public void printNodes(ListNode head) {
        while(head != null){
            System.out.printf(head.val+" -> ");
            head = head.next;
        }
        System.out.println();
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}