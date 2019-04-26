package rclaros.algoritmos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rclaros
 */
public class Fibonacci {

    private static Map<Long, Long> map = new HashMap<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Fibonacci(40)=" + fibonacci(40));
        for (Map.Entry<Long, Long> entry : map.entrySet()) {
            Long key = entry.getKey();
            Long value = entry.getValue();
            System.out.println("Nro:" + key + " ,Nro. veces calculado : " + value);
        }
    }

    static long fibonacci(long n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (map.containsKey(n)) {
            map.put(n, map.get(n) + new Long(1));
        } else {
            map.put(n, new Long(1));
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
