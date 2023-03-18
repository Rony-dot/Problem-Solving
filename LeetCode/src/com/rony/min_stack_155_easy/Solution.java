package com.rony.min_stack_155_easy;

public class Solution {
    public static void main(String[] args) {
//      Solution solution = new Solution();
//      Your MinStack object will be instantiated and called as such:
        MinStack obj = new MinStack();
        obj.push(12);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();
    }
}


class MinStack {
    int[] stak;
    int i;
    int mini = Integer.MAX_VALUE;
    public MinStack() {
        i = 0;
        stak = new int[Integer.MAX_VALUE];
    }

    public void push(int val) {
        stak[i++] = val;
        mini = Math.min(val,mini);
    }

    public void pop() {
        i--;
    }

    public int top() {
        return stak[i];
    }

    public int getMin() {
        return mini;
    }
}