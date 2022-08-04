package com.rony;

public class BJET {
    public static void main(String[] args) {
        Practice p1 = new Practice();
        p1.ans1(2,1,2,5);
//        System.out.println(p1.function1(10));
//        p1.function2(10);
    }
}

class Practice {

    void function2(int x){
        for(int i=1; i<x; i++){
            for(int j=x; j>=i-1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    int function1(int x){
        int r =1 ;
        r += x;
        if(x>4 && x<10){
            r += 2*x;
        }
        else if(x<=4){
            r += 3*x;
        }
        else{
            r += 4*x;
        }
        return r;
    }
    void ans1(int a, int r, int p, int n){
        int sum = a;
        for(int i=1; i<=n; i++){
            sum += calculatePower((a + i*r),p);

        }
        System.out.println(sum);
    }
    int calculatePower(int base, int power){
        int result = 1;
        while (power != 0) {
            result = result * base;
            power--;
        }
        return result;
    }
    void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
    }
