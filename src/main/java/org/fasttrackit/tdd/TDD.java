package org.fasttrackit.tdd;

import java.util.List;

public class TDD {
    public int find(List<Integer> list, Integer number) {
        if (list == null || !list.contains(number)) {
            return -1;
        }
        return list.indexOf(number);
    }
}
