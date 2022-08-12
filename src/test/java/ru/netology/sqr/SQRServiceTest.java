package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrServiceTestData.csv")

    public void testSqrService(int expected, long lower, long upper) {
        SQRService service = new SQRService();

        long actual = service.sqrCount(lower, upper);
        Assertions.assertEquals(expected, actual);

    }
}
