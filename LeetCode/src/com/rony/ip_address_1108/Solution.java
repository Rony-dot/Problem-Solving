package com.rony.ip_address_1108;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.defangIPaddr(new String("12.13.14.10"));
        System.out.println(s);
    }

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }


}