package ru.netology.services.javacycles2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class FreelancerRestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/ru.netology.services.javacycles2/rest.csv")

    public void testFreelancerRestWithParam(int income, int expenses, int threshold, int expected) {
        FreelancerRestService service = new FreelancerRestService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalc3TimesRest() {
        FreelancerRestService service = new FreelancerRestService();

        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalc2TimesRest() {
        FreelancerRestService service = new FreelancerRestService();

        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);
    }
}