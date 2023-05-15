package org.fasttrackit.homework;

public class RecursivityMain {
    public static void main(String[] args) {
        String str = "qwertyuioppoiuytrewq";
        String reversedStr = recursiveStringReverse(str);
        System.out.println(str.equals(reversedStr));

        System.out.println(sumOfDigits(12345));
    }

    public static long sumOfDigits(int number) {
        if (number <= 9) {
            return number;
        }
        return number % 10 + sumOfDigits(number / 10);
    }

    public static String recursiveStringReverse(String s) {
        if (s.length() == 1) {
            return s;
        }
        return recursiveStringReverse(s.substring(1)) + s.charAt(0);
    }

    public static boolean recursiveCheckForPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        return s.charAt(0) == s.charAt(s.length() - 1) && recursiveCheckForPalindrome(s.substring(1, s.length() - 1)); // ana -> a == a && pal(n)
        // asd -> a == d && pal(s)
    }

    public static long sumOfFirstNEvenNumbers(int n) {
        if (n <= 0) {
            return 0;
        }
        return (n * 2L) + sumOfFirstNEvenNumbers(n - 1);
    }

    public static long sumOfFirstNEvenNumbersWithIndex(int n) {
        return sumOfFirstNEvenNumbersWithIndex(n * 2, n);
    }

    public static long sumOfFirstNEvenNumbersWithIndex(int n, int index) {
        if (n <= 0) {
            return 0;
        }
        if (n % 2 != 0) {
            n = n - 1;
        }
        return n + sumOfFirstNEvenNumbersWithIndex(n - 1, index - 1);
    }

}
