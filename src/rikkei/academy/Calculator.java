package rikkei.academy;

public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION ='-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int caculate(int firstOperand, int secondOperand, char operator){
        switch (operator){
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand + secondOperand;
            case MULTIPLICATION:
                return firstOperand + secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        int result = 0;
        switch (operator){
            case Calculator.ADDITION:
                 return firstOperand + secondOperand;
            case Calculator.SUBTRACTION:
                return  firstOperand - secondOperand;
            case Calculator.MULTIPLICATION:
                return  firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                   return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                    throw new RuntimeException("Unsupported operation");
        }
    }
}
