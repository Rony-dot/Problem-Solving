package com.rony.palindrome_linked_list_234;

public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next =  new ListNode(9);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = null;
        Solution sol = new Solution();
        sol.printNodes(head);
        ListNode revHead = sol.reverseAndCopy(head);
        sol.printNodes(revHead);
        sol.printNodes(head);
        System.out.println(sol.isPalindrome(head));
    }

    public void printNodes(ListNode head) {
        while(head != null){
            System.out.printf(head.val+" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public boolean isPalindrome(ListNode head) {

            // Initialise 2 variables
            ListNode fast = head;
            ListNode slow = head;

            // Iterate fast 2 times and slow 1 time to
            // take one pointer in mid and other at last
            while(fast!= null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }

            // reverse half of the linked list
            slow = reversed(slow);
            fast = head;

            // check if the first half = second half
            while(slow!= null ){
                if(slow.val != fast.val){
                    return false;
                }
                slow = slow.next;
                fast = fast.next;
            }
            return true;

        }

        // Code to reverse a linked list
        public ListNode reversed(ListNode head){
            ListNode prev = null;
            while(head!=null){
                ListNode next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            }
            return prev;
        }


    public ListNode reverseAndCopy(ListNode node){
        ListNode cur = node;
        ListNode prev = null;
        ListNode next = null;
        ListNode newNode = null;
        while(cur!=null){
            newNode = cur;
            newNode.next = prev;
            prev = newNode;
            cur = cur.next;
        }

        return newNode;
    }

    public ListNode reverse(ListNode node){
        ListNode cur = node;
        ListNode prev = null;
        ListNode next = null;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }



}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
