package org.fasttrackit.generics;

public class Pair<F extends Number, S extends Number> {
    private final F first;
//    private final F secondFirst;
//    private final List<F> firsts;
    private final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
