package bd.edu.seu;

import java.util.*;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        long t=0;
        long n=0;
        List<Long> b = new ArrayList<>();
        List<Long> a = new ArrayList<>();
        Set<Long> c = new HashSet<>();
        t = sc.nextLong();
        while(t-- != 0){
            n = sc.nextLong();
            for(int i=0; i<n; i++){
                b.add(sc.nextLong());
            }
        }
        for(int i=0; i<n; i++){
            Collections.rotate(a,1);
            for(int j=0; j<n; j++){
//                c.add(a[j] % b[j]);
            }

        }

    }
}
