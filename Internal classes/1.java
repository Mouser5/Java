class Calculator {
    //2
    private int value=3;
    public class Adder {
        public int add(int a, int b) {
            return a + b+value;
        }
    }

    private class Subtractor {
        public int subtract(int a, int b) {
            return a - b-value;
        }
    }

    protected class Multiplier {
        public int multiply(int a, int b) {
            return a * b*value;
        }
    }
    //1
    void accessPrivateInnerClass() {
        Subtractor subtractor = new Subtractor();
        System.out.println(subtractor.subtract(10, 5));
    }
    public int accessInnerClass(int a, int b){
        Subtractor sub= new Subtractor();
        return sub.subtract(a, b);
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        //public
        Calculator.Adder adder = calculator.new Adder();
        System.out.println(adder.add(3, 4));

        // protected
        Calculator.Multiplier multiplier = calculator.new Multiplier();
        System.out.println(multiplier.multiply(6, 7));

        
        // private
        calculator.accessPrivateInnerClass();
        //3
        calculator.accessInnerClass(10, 3);
    }
}
