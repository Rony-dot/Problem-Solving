package com.company.misc;

import java.math.BigInteger;
import java.util.Scanner;

public class NFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            BigInteger from = sc.nextBigInteger();
            BigInteger to = sc.nextBigInteger();
            BigInteger[] array = new BigInteger[to.intValue()+1];
            array[0] = BigInteger.ZERO;
            array[1] = BigInteger.ONE;
            int even = 0;
            int odd = 0;
            for(int j=2; j<= to.longValue(); j++){
                array[j] = array[j-1].add(array[j-2]);
            }
            for(int k=0; k< to.longValue(); k++){
                if(k+1 >= from.longValue() && k+1<=to.longValue()){
                    if((array[k].longValue() & 1)==0) even++;
                    else odd++;
                }
            }
            System.out.println("Case "+i +":");
            System.out.println("Odd = "+odd);
            System.out.println("Even = "+even);
        }
    }
}
/**
 * Ok in that case you need to fix your int.
 * You probably want to use 64 bit ints (int tends to be 32 bit int on most computers).
 * 32 bit int goes up to 2 billion, ~ 10^9.
 * 64 bit int will go to orders of 10^18
 */