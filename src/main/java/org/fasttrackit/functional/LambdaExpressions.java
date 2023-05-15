package org.fasttrackit.functional;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpressions {
    public static void main(String[] args) {
        tryFunction(a -> a + 1);
        tryFunction(a -> a * 10);
        tryFunction(a -> {
            Random r = new Random();
            int randomNumber = r.nextInt(100);
            return a + randomNumber;
        });

        trySupplier(() -> "Hello");
//        trySupplier(() -> {
//            try {
//                Scanner scanner = new Scanner(new File(""));
//                return scanner.nextLine();
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//        });

        tryConsumer(System.out::println);
        tryConsumer(st -> System.out.println(st.toUpperCase()));
        tryConsumer(string -> string.toLowerCase());
        tryConsumer(String::toLowerCase);

        tryPredicate(i -> i < 10);
        tryPredicate(i -> i % 2 == 0);
    }

    public static void tryPredicate(Predicate<Integer> tester) {
        // 100 lines of code
        int a = 10;
        if (tester.test(a)) {
            System.out.println("WON");
        } else {
            System.out.println("LOST");
        }
        // 100 lines of code
    }

    public static void tryConsumer(Consumer<String> consumer) {
        // 100 lines of code
        String s = "test"; // obtained by that 100 lines of code
        consumer.accept(s);
        // 100 lines of code
    }

    public static void trySupplier(Supplier<String> stringSupplier) {
        String s = stringSupplier.get();
        System.out.println(s);
        // 100 lines of code that works with a string
    }

    public static void tryFunction(Function<Integer, Integer> incrementor) {
        // 100 lines of code
        int i = 4;
        System.out.println(incrementor.apply(i));
        // 100 lines of code
    }
}
