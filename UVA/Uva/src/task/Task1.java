package task;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        System.out.println (selectCount (new long[]{1, 1, 3, 4, 4, 4}));
        System.out.println (selectCount (new long[]{1, 2, 2, 2, 5, 5, 5, 8}));
        System.out.println (selectCount (new long[]{1, 1, 1, 1, 3, 3, 4, 4, 4, 4, 4}));
        System.out.println (selectCount (new long[]{10,10,10}));
    }
    public static long selectCount(long[] arr) {
        Map<Long, Integer> longMap = new HashMap<> ();
        for (long ele : arr) {
            if (!longMap.containsKey (ele)){
                longMap.put (ele, 1);
            } else {
                longMap.put (ele, longMap.get (ele) + 1);
            }
        }
        long count = 0;
        for (Map.Entry<Long, Integer> entry : longMap.entrySet ()) {
            if (entry.getValue () > 0) {
                if (entry.getKey () / 2 < entry.getValue ()) {
                    count = (count + (Math.abs (entry.getValue () - entry.getKey ())));
                } else if (entry.getKey () / 2 >= entry.getValue ()) {
                    count = (count + entry.getValue ());
                }
            }
        }
        return count;
    }
}
