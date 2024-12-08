interface Calculator {

    class Adder {
        public int add(int a, int b) {
            return a + b;
        }
    }
    
    int calculate(int a, int b);
}

public class Main implements Calculator {

    @Override
    public int calculate(int a, int b) {
        // Использование вложенного класса
        Calculator.Adder adder = new Calculator.Adder();
        return adder.add(a, b);
    }

    public static void main(String[] args) {
        Main calculator = new Main();

        // interface
        Calculator.Adder adder = new Calculator.Adder();
        System.out.println(adder.add(5, 10));

        // method
        System.out.println(calculator.calculate(20, 30));
    }
}
