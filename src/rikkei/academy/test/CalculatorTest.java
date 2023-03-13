package rikkei.academy.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rikkei.academy.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Testing addition")
    void testCaculateAdd(){
        int firstOperand = 2;
        int secondOperand = 0;
        char operator = '+';
        int expected =  2;


        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }
}
