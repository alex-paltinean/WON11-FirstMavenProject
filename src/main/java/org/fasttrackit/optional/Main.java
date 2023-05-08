package org.fasttrackit.optional;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<Integer> max = getMax(new ArrayList<>());
        System.out.println(max.isPresent() ? max.get() : "not max was found");

        doSomething(null);
        reallyDoSomething(null);
    }

    public static Optional<Integer> getMax(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return Optional.empty();
        }
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = i;
            }
        }
        return Optional.of(max);
    }

    public static void doSomething(Optional<Integer> i) {
        if (i.isPresent()) {
            // so something important
        } else {
            return;
        }
    }

    public static void reallyDoSomething(Integer i) {
        if (i != null) {
            // do something important
        }
    }
}
