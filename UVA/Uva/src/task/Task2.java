package task;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] A = new int[]{6, 1, 4, 6, 3, 2, 7, 4};
        int K = 3;
        int L = 2;
        System.out.println (solution (A, K, L));

    }

    public static int solution(int[] A, int K, int L) {
        if (A.length < K + L) {
            return -1;
        }
        if (A.length == K + L) {
//            return ArraysKt.sum (A);
            return Arrays.stream(A).sum();
        }
        int sum = 0;
        int alice = 0;
        int i = 0;
        int p = A.length - K - L;
        int j;
        int q;
        int k;
        int r;
        int bob;
        if (i <= p) {
            while (true) {
                if (alice == 0) {
                    j = i;

                    for (q = i + K; j < q; ++j) {
                        alice += A[j];
                    }
                } else {
                    alice += A[i + K - 1];
                    alice -= A[i - 1];
                }

                bob = 0;
                j = i + K;
                q = A.length - L;
                if (j <= q) {
                    while (true) {
                        if (bob == 0) {
                            k = j;

                            for (r = j + L; k < r; ++k) {
                                bob += A[k];
                            }
                        } else {
                            bob += A[j + L - 1];
                            bob -= A[j - 1];
                        }

                        k = alice + bob;
                        sum = Math.max (sum, k);
                        if (j == q) {
                            break;
                        }

                        ++j;
                    }
                }

                if (i == p) {
                    break;
                }

                ++i;
            }
        }

        bob = 0;
        i = 0;
        p = A.length - K - L;
        if (i <= p) {
            while (true) {
                if (bob == 0) {
                    j = i;

                    for (q = i + L; j < q; ++j) {
                        bob += A[j];
                    }
                } else {
                    bob += A[i + L - 1];
                    bob -= A[i - 1];
                }

                alice = 0;
                j = i + L;
                q = A.length - K;
                if (j <= q) {
                    while (true) {
                        if (alice == 0) {
                            k = j;

                            for (r = j + K; k < r; ++k) {
                                alice += A[k];
                            }
                        } else {
                            alice += A[j + K - 1];
                            alice -= A[j - 1];
                        }

                        k = alice + bob;
                        sum = Math.max (sum, k);
                        if (j == q) {
                            break;
                        }

                        ++j;
                    }
                }

                if (i == p) {
                    break;
                }

                ++i;
            }
        }

        return sum;
    }
}
//    public static int solution(int A[], int K, int L){
//        if(A.length < K+L){
//            return -1;
//        }
//        if (A.length == K + L) {
//            return Arrays.stream(A).sum();
//        }
//
//        var sum = 0;
//        var alice = 0;
//        var bob = 0;
//
//        for(int i=0; i<=A.length-K-L; i++){
//            if(alice==0){
//
//                /*
//                for (j in 0 until 10) {
//                    print(j)
//                }
//*/
//                for(int k=i; k< i+k; k++){
//                    if (k >= A.length) break;
//                    alice += A[k];
//                }
//            }else{
//                alice += A[i + K - 1];
//                alice -= A[i - 1];
//            }
//            bob = 0;
//            for(int j=i+K; j<=A.length-L; j++){
//                if(bob==0){
//                    for(int k=j; k<j+L; k++){
//                        if (k >= A.length) break;
//                        bob += A[k];
//                    }
//                } else {
//                    bob += A[j + L - 1];
//                    bob -= A[j - 1];
//                }
//                sum = Math.max(sum, alice + bob);
//            }
//
//        }
//        bob = 0;
//        for( int i=0; i<=A.length-K-L; i++){
//            if(bob==0){
//                for(int k=i; k<i+L; k++){
//                    if (k >= A.length) break;
//                    bob += A[K];
//                }
//            } else {
//                bob += A[i + L - 1];
//                bob -= A[i - 1];
//            }
//            alice = 0;
//            for(int j=i+L; j<=A.length-K; j++){
//                if(alice==0){
//                    for(int k=j; k<j+K; k++){
//                        if (k >= A.length) break;
//                        alice += A[k];
//                    }
//                }else {
//                    alice += A[j + K - 1];
//                    alice -= A[j - 1];
//                }
//                sum = Math.max(sum, alice + bob);
//            }
//        }
//        return sum;
//
//    }
