package codility;
/*


fun solution(A: IntArray, K: Int, L: Int): Int {
        if (A.size < K + L) { //invalid
            return -1
        }

        if (A.size == K + L) { //only one solution
            return A.sum()
        }

        var sum = 0
        var alice = 0
        var bob = 0

        for (i in 0..A.size - K - L) {
            if (alice == 0) {
                for (k in i until i + K) {
                    alice += A[k]
                }
            } else {
                alice += A[i + K - 1]
                alice -= A[i - 1]
            }
            bob = 0
            for (j in i + K..A.size - L) {
                if (bob == 0) {
                    for (k in j until j + L) {
                        bob += A[k]
                    }
                } else {
                    bob += A[j + L - 1]
                    bob -= A[j - 1]
                }
                sum = max(sum, alice + bob)
            }

        }

        bob = 0
        for (i in 0..A.size - K - L) {
            if (bob == 0) {
                for (k in i until i + L) {
                    bob += A[k]
                }
            } else {
                bob += A[i + L - 1]
                bob -= A[i - 1]
            }
            alice = 0
            for (j in i + L..A.size - K) {
                if (alice == 0) {
                    for (k in j until j + K) {
                        alice += A[k]
                    }
                } else {
                    alice += A[j + K - 1]
                    alice -= A[j - 1]
                }
                sum = max(sum, alice + bob)
            }
        }

        return sum
    }


 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

//        solution();
        int a[] = {1, 2, 2, 2, 5, 5, 5, 8};
        int n = a.length;

        System.out.println(MinDeletion(new int[]{1, 1, 3, 4, 4, 4}));
        System.out.println(MinDeletion(new int[]{1, 2, 2, 2, 5, 5, 5, 8}));
        System.out.println(MinDeletion(new int[]{1, 1, 1, 1, 3, 3, 4, 4, 4, 4, 4}));
        System.out.println(MinDeletion(new int[]{10, 10, 10}));

    }

    // Function to return the minimum
    // deletions required
    static int MinDeletion(int a[]) {

        // To store the frequency of
        // the array elements
        int n = a.length;
        Map<Integer, Integer> mp = new HashMap<>();

        // Store frequency of each element
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(a[i])) {
                mp.put(a[i], mp.get(a[i]) + 1);
            } else {
                mp.put(a[i], 1);
            }
        }
        // To store the minimum deletions required
        int count = 0;
        for (Map.Entry<Integer, Integer> i : mp.entrySet()) {

            // Value
            int x = i.getKey();

            // It's frequency
            int frequency = i.getValue();


            if (frequency <= x / 2) {
                count += frequency;
            } else if (frequency > x / 2) {
                count += Math.abs(x - frequency);
            }

        }
        return count;
    }


    // third code
    public static int solution(int A[], int K, int L) {
        if (A.length < K + L) {
            return -1;
        }
        if (A.length == K + L) { //only one solution
            return Arrays.stream(A).sum();
        }

        var sum = 0;
        var alice = 0;
        var bob = 0;

        for (int i = 0; i <= A.length - K - L; i++) {
            if (alice == 0) {
                for (int k = i; k < i + k; k++) {
                    alice += A[k];
                }
            } else {
                alice += A[i + K - 1];
                alice -= A[i - 1];
            }
            bob = 0;
            for (int j = i + K; j <= A.length - L; j++) {
                if (bob == 0) {
                    for (int k = j; k < j + L; k++) {
                        bob += A[k];
                    }
                } else {
                    bob += A[j + L - 1];
                    bob -= A[j - 1];
                }
                sum = Math.max(sum, alice + bob);
            }

        }
        bob = 0;
        for (int i = 0; i <= A.length - K - L; i++) {
            if (bob == 0) {
                for (int k = i; k < i + L; k++) {
                    bob += A[K];
                }
            } else {
                bob += A[i + L - 1];
                bob -= A[i - 1];
            }
            alice = 0;
            for (int j = i + L; j <= A.length - K; j++) {
                if (alice == 0) {
                    for (int k = j; k < j + K; k++) {
                        alice += A[k];
                    }
                } else {
                    alice += A[j + K - 1];
                    alice -= A[j - 1];
                }
                sum = Math.max(sum, alice + bob);
            }
        }
        return sum;

    }
}
