interface Calculator {
    double calculate(double a, double b); 
}

class SimpleCalculator implements Calculator {

    @Override  // Переопределение
    public double calculate(double a, double b) {
        return a + b;  
    }

    @Deprecated  // Устаревший метод
    public int add(int a, int b) {
        return a + b; 
    }
}

public class CalculatorApp {
    public static void main(String[] args) {

        SimpleCalculator calc = new SimpleCalculator();

        System.out.println("Sum (double): " + calc.calculate(5.5, 3.2)); 

        @SuppressWarnings("deprecation")
        int temp= calc.add(5, 3);  
    }
}
