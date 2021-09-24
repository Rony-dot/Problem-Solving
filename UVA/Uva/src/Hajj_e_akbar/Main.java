package Hajj_e_akbar;

import java.util.Scanner;

//12577

class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int t = 0;
        while (sc.hasNext()){
            String s = sc.nextLine();
            if(s.equals("Hajj")){
                System.out.println("Case "+ ++t +": Hajj-e-Akbar");
            }else if(s.equals("Umrah")){
                System.out.println("Case "+ ++t +": Hajj-e-Asghar");
            }else if(s.equals("*")){
                break;
            }
        }
    }
}
