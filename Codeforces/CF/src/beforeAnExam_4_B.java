import java.util.Scanner;

/**
 * contest:  4 B Before an Exam
 */
public class beforeAnExam_4_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int sumTime = sc.nextInt();
        int arr[] = new int[d];
        for(int i=0; i<d; i++){
            int min = sc.nextInt();
            int max = sc.nextInt();
            arr[i] = Math.max(min,max);
        }
    }
}
