package org.fasttrackit.recursivity;

import java.util.HashMap;
import java.util.Map;

public class RecursionExercises {
    public static Map<Long, Long> fibonacciResult = new HashMap<>();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(fibonacci(1000));
        System.out.println(System.currentTimeMillis() - start);
    }

    public static long sumFromOneToParam(long param) {
        if (param == 1) {
            return 1;
        }
        return param + sumFromOneToParam(param - 1);
    }

    public static long fibonacci(long n) {
//        System.out.println("entered fibonacci with " + n);
        if (n == 0 || n == 1) {
            return 1;
        }
        if (fibonacciResult.containsKey(n)) {
            return fibonacciResult.get(n);
        }
        long result = fibonacci(n - 1) + fibonacci(n - 2);
        fibonacciResult.put(n, result);
        return result;
    }
}
