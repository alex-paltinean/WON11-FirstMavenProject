package org.fasttrackit.homework;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class FirstTest {

    private static First first;
    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll()");
        first = new First();
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("afterAll()");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach()");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("afterEach()");
    }



    @Test
    @DisplayName("WHEN sum is called on two numbers THEN sum is returned")
    public void sumTest() {
        System.out.println("sumTest()");
        // GIVEN
        int a = 2;
        int b = 3;

        // WHEN
        int sum = first.sum(a, b);

        // THEN
        Assertions.assertThat(sum).isEqualTo(5);
    }

    @Test
    @DisplayName("WHEN sum is called on two negative numbers THEN sum is returned")
    public void sumOfNegativeNumbersTest() {
        System.out.println("sumOfNegativeNumbersTest()");
        // GIVEN
        int a = -3;
        int b = -1;

        // WHEN
        int sum = first.sum(a, b);

        // THEN
        Assertions.assertThat(sum).isEqualTo(-4);
    }


}
