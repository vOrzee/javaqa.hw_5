package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestTimeServiceTest {
    @Test
    void shouldCalculateFirstDataSample() {
        // Given
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        RestTimeService service = new RestTimeService();

        // When
        int actual = service.calculate(income, expenses, threshold);

        // Then
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSecondDataSample() {
        // Given
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        RestTimeService service = new RestTimeService();

        // When
        int actual = service.calculate(income, expenses, threshold);

        // Then
        int expected = 2;
        assertEquals(expected, actual);
    }
}
