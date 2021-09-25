package bs_divisible_by_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // print array element in one line
//        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[8];
        for(int i=0; i<n; i++){
            int val = sc.nextInt();
            arr[val] += 1;
        }
        int flag = 0;
        // n/2 tuples will be created
        for(int j=0; j != n/2; j++){
            for(int i=1; i<=3; i++){
                if(arr[1]>0 && arr[2]>0 && arr[4]>0){
                    System.out.println("1 2 4");
                    arr[1] -= 1;
                    arr[2] -= 1;
                    arr[4] -= 1;
                    flag = 1;
                }else if(arr[1]>0 && arr[2]>0 && arr[6]>0){
                    System.out.println("1 2 6");
                    arr[1] -= 1;
                    arr[2] -= 1;
                    arr[6] -= 1;
                    flag = 1;
                }else if(arr[1]>0 && arr[3]>0 && arr[6]>0){
                    System.out.println("1 3 6");
                    arr[1] -= 1;
                    arr[3] -= 1;
                    arr[6] -= 1;
                    flag = 1;
                }
            }
        }
        if(flag==0){
            System.out.println("-1");
        }


    }
}
