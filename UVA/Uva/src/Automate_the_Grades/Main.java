//package Automate_the_Grades;

import java.util.Scanner;

/**
 * Automate_the_Grades 11777
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int iteration = 0;
        while (t-- != 0){
            int result = 0;
            for(int i =0; i<4; i++){
                result += sc.nextInt();
            }
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum = a+b+c;
            int min = Math.min(Math.min(a,b),c);
            sum -= min;
            result = result + sum/2;
            if(result >= 90){
                System.out.println("Case "+ ++iteration +": A");
            }else if(result >= 80){
                System.out.println("Case "+ ++iteration +": B");
            }else if(result >= 70){
                System.out.println("Case "+ ++iteration +": C");
            }else if(result >= 60){
                System.out.println("Case "+ ++iteration +": D");
            }else{
                System.out.println("Case "+ ++iteration +": F");
            }
        }
    }


}
