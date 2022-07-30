package city__coupon_discount;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int c1=0, c2=0, c3=0, d1=0, d2=0, d3=0;
            for(int i=0; i<n; i++){
                int city = sc.nextInt();
                int level = sc.nextInt();
                int discount = sc.nextInt();
                if(level == 1 ){
                    if(discount >= d1){
                        if(discount > d1){
                            c1 = city;
                            d1 = discount;
                        }else{
                            c1 = Math.min(city, c1);
                        }
                    }
                }else if(level == 2 ){
                    if(discount >= d2){
                        if(discount > d2){
                            c2 = city;
                            d2 = discount;
                        }else{
                            c2 = Math.min(city, c2);
                        }
                    }
                }else {
                    if(discount >= d3){
                        if(discount > d3){
                            c3 = city;
                            d3 = discount;
                        }else{
                            c3 = Math.min(city, c3);
                        }
                    }
                }
            }

            System.out.println(d1 + " "+ c1);
            System.out.println(d2 + " "+ c2);
            System.out.println(d3 + " "+ c3);
        }
    }

}

/*
1
7
2 1 10
1 1 20
3 2 100
2 3 50
2 2 100
5 3 75
100 3 75
 */