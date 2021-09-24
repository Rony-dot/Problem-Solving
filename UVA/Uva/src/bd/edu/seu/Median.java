package bd.edu.seu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==-1)
                break;
            List<Integer> numList = new ArrayList<>();
            for(int i =0; i<n; i++){
                int num = sc.nextInt();
                numList.add(num);
            }
            // sorted
            Collections.sort(numList);
            if((n&1)==0){
                // even
                int one = n/2-1;
                int two = one + 1;
                int result = numList.get(one)+numList.get(two);
                System.out.println("median is : "+result/2);
            }else {
                // odd
                int one = n/2-1;
                int result = numList.get(one);
                System.out.println("median is : "+result);
            }
        }
    }
}
