package com.company.misc;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeAlt {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        for(int cas=1; cas<=t; cas++){
//            BigInteger a = sc.nextBigInteger();
//            BigInteger b = sc.nextBigInteger();
            BigInteger count = BigInteger.ZERO;
            for (int i = 1; i <= 1000_0000; i++) {
                count = count.add(BigInteger.valueOf(9).multiply(BigInteger.TEN.pow((i - 1) / 2)));
            }
            System.out.println(count);
//        }
    }
}
