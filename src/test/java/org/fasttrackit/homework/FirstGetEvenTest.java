package org.fasttrackit.homework;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstGetEvenTest {

    @Test
    public void getEmptyListIfListIsEmpty() {
        // GIVEN
        List<Integer> input = new ArrayList<>();
        First first = new First();
        // WHEN
        List<Integer> even = first.getEven(input);
        // THEN
        Assertions.assertThat(even).isEmpty();
    }

    @Test
    public void getEmptyListIfListHasOnlyOddNumbers() {
        // GIVEN
        List<Integer> input = Arrays.asList(1, 5, 7);
        First first = new First();
        // WHEN
        List<Integer> even = first.getEven(input);
        // THEN
        Assertions.assertThat(even).isEmpty();
    }


    @Test
    public void getFullListIfListHasOnlyEvenNumbers() {
        // GIVEN
        List<Integer> input = Arrays.asList(2, 4, 6);
        First first = new First();
        // WHEN
        List<Integer> even = first.getEven(input);
        // THEN
        Assertions.assertThat(even).hasSameSizeAs(input);
        Assertions.assertThat(even).containsAll(input);
    }


    @Test
    public void getListWithOnlyEvenNumbers() {
        // GIVEN
        List<Integer> input = Arrays.asList(1, 4, 6, 7);
        First first = new First();
        // WHEN
        List<Integer> even = first.getEven(input);
        // THEN
        Assertions.assertThat(even).hasSize(2);
        Assertions.assertThat(even).containsAll(Arrays.asList(4, 6));
    }

    @Test
    public void throwExceptionIfListIsNull() {
        // GIVEN
        List<Integer> input = null;
        First first = new First();
        // WHEN-THEN
        org.junit.jupiter.api.Assertions.assertThrows(NullPointerException.class, () -> {
            List<Integer> even = first.getEven(input);
        });
    }

    @Test
    public void testExceptionWithMock() {
        // GIVEN
        First first = Mockito.mock(First.class);
        Mockito.when(first.getEven(null)).thenCallRealMethod();
        Mockito.when(first.validateInput(null)).thenThrow(new NullPointerException());

        // WHEN-THEN
        org.junit.jupiter.api.Assertions.assertThrows(NullPointerException.class, () -> {
            List<Integer> even = first.getEven(null);
        });

    }
}
