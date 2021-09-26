package introver_extrovert;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> aMap = new HashMap<>();
        for(int i=0; i<n; i++){
            aMap.put(sc.nextInt(),i);
        }
        Map<Integer,Integer> sortedMap = new TreeMap<>(aMap);
        for(Map.Entry k  : sortedMap.entrySet()){
            System.out.println(k.getKey() + " "+ k.getValue());
        }
        Stack<Integer> stack = new Stack<>();
        String str = sc.nextLine();
        char c [] = str.toCharArray();
        for(char cr : c){
            if(cr == '0'){
                System.out.print();
            }else{

            }
        }
    }
}
