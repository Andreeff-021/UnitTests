package calculator;


public class Calculator {


    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return (double) a / b;
    }

    public double calculateDiscount(double price, double sale) {
       if (price > 0 && sale > 0){
           return price - price / 100 * sale;
       }
       else throw new ArithmeticException("Недопустимы аргумент");
    }
}




