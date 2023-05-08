package org.fasttrackit.homework;

import org.assertj.core.data.Percentage;
import org.fasttrackit.homework.TemperatureConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

    @Test
    public void testMethodDefinitionIsCorrect() {
        // GIVEN
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double fahrenheit = 3.4D;

        // WHEN
        double celsius = temperatureConverter.toCelsius(fahrenheit);

        // THEN
        Assertions.assertEquals(1, 1);
    }


    @Test
    public void testMethodToCelsius() {
        // GIVEN
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double fahrenheit = 100D;

        // WHEN
        double celsius = temperatureConverter.toCelsius(fahrenheit);

        // THEN
        org.assertj.core.api.Assertions.assertThat(celsius).isCloseTo(37.77, Percentage.withPercentage(0.1));
    }
}
