package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestTimeServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sampledata.csv")
    void shouldCalculateFirstDataSample(int income, int expenses, int threshold, int expected) {
        // Given
        RestTimeService service = new RestTimeService();

        // When
        int actual = service.calculate(income, expenses, threshold);

        // Then
        assertEquals(expected, actual);
    }
}
