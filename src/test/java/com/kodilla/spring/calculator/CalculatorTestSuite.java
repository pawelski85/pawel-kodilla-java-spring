package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        double resultAdd = calculator.add(5, 5);
        double resultSub = calculator.sub(5, 5);
        double resultMul = calculator.mul(5, 5);
        double resultDiv = calculator.div(5, 5);
        //Then
        assertEquals(10, resultAdd);
        assertEquals(0, resultSub);
        assertEquals(25, resultMul);
        assertEquals(1, resultDiv);
    }
}