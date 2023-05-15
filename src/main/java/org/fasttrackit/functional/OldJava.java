package org.fasttrackit.functional;

public class OldJava {
    // public static void doSomething(String s, Method method){
    // 1000 lines of code
    // method.execute() 1. s1 = s.toUpperCase();    2. s1 = s.toLowerCase();
    // 1000 lines of code
    // }
    public static void main(String[] args) {
        String s = "mark";

        System.out.println(transformString(s, new ToUpperCaseTransformer()));

    }

    public static String transformString(String word, StringTransformer transformer) {
        // 1000 lines of code
        return transformer.transform(word);
    }
}

interface StringTransformer {
    String transform(String word);
}

class ToUpperCaseTransformer implements StringTransformer{

    @Override
    public String transform(String word) {
        return word.toUpperCase();
    }
}
