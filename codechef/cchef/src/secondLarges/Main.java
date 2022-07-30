package secondLarges;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[]{12,13,9,4,6, 19, 17,100, 99};
        int val = secondLargest(arr);
        System.out.println(val);
    }

    private static int secondLargest(int[] ints) {

        int n = ints.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++)
                if (ints[j] < ints[j+1])
                {
                    int temp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = temp;
                }
        }


//        return ints[n-2];
        return ints[1];
    }

}
