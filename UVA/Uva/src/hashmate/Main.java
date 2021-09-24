package hashmate;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // read until end of file
        while(sc.hasNextLong()){
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(Math.abs(a-b));
        }
    }
}
