package org.fasttrackit.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create a function TDD.find that receives a list and a number and returns the index or -1 if not found
 */
public class TDDTest {

    @Test
    public void instantiateClass() {
        TDD tdd = new TDD();
    }

    @Test
    public void callMethod() {
        TDD tdd = new TDD();
        tdd.find(new ArrayList<>(), 2);
    }

    @Test
    public void methodReturnsAnInt() {
        TDD tdd = new TDD();
        int result = tdd.find(new ArrayList<>(), 2);
    }

    @Test
    public void returnMinusOneIfNotFound() {
        // GIVEN
        TDD tdd = new TDD();
        List<Integer> list = new ArrayList<>();
        int element = 2;

        // WHEN
        int result = tdd.find(list, element);

        // THEN
        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void returnIndexIfFound(){
        // GIVEN
        TDD tdd = new TDD();
        List<Integer> list = Arrays.asList(1,3,6);
        int element = 3;

        // WHEN
        int result = tdd.find(list, element);

        // THEN
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void returnMinusOneIfListIsNull(){
        // GIVEN
        TDD tdd = new TDD();
        List<Integer> list = null;
        int element = 3;

        // WHEN
        int result = tdd.find(list, element);

        // THEN
        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void returnMinusOneIfNumberIsNull(){
        // GIVEN
        TDD tdd = new TDD();
        List<Integer> list = Arrays.asList(1,3,6);;
        Integer element = null;

        // WHEN
        int result = tdd.find(list, element);

        // THEN
        Assertions.assertThat(result).isEqualTo(-1);
    }
}
