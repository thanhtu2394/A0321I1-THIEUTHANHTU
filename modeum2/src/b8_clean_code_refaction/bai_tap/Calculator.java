package b8_clean_code_refaction.bai_tap;

public class Calculator {

    public static final char ADITTION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public static final char HELLO='A';

    public static int calculate(int first, int second, char operator) {
        switch (operator) {
            case ADITTION:
                return first + second;
            case SUBTRACTION:
                return first - second;
            case MULTIPLICATION:
                return first * second;
            case DIVISION:
                if (second != 0)
                    return first / second;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }

    public static void main(String[] args) {
        System.out.println(Calculator.calculate(4,7,ADITTION));
        System.out.println(Calculator.calculate(4,7,SUBTRACTION));
        System.out.println(Calculator.calculate(4,7,MULTIPLICATION));
        System.out.println(Calculator.calculate(4,7,DIVISION));
//        System.out.println(Calculator.calculate(4,0,DIVISION));
        System.out.println(Calculator.calculate(4,0,HELLO));
    }
}
