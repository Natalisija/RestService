package ru.netology.RestService.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {
    @Test
    public void calcRest() {
        RestService service = new RestService();
        int expected = 3;
        int threshold = 20_000; // порог
        int expenses = 3_000; // расходы
        int income = 10_000;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(actual, expected);
    }
}
