package org.fasttrackit.functional;

import java.util.function.Function;

public class NewJava {
    public static void main(String[] args) {
        System.out.println(transformString("mark", (word) -> {return word.toUpperCase();}));
        System.out.println(transformString("mark", word -> word.toLowerCase()));
    }

    public static String transformString(String word, Function<String, String> transformer) {
        // 1000 lines of code
        return transformer.apply(word);
    }
}
