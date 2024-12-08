/**
 * Класс Calculator предоставляет базовые методы для выполнения
 * арифметических операций.
 * @author Егоркин
 */
public class Calculator {

    /**
     * Складывает два числа.
     *
     * @param a первое число
     * @param b второе число
     * @return результат сложения a и b
     */
    public int add(int a, int b) {
        return a + b;
    }

    
    /**
     * Делит первое число на второе.
     *
     * @param a делимое
     * @param b делитель
     * @return результат деления a на b
     * @throws ArithmeticException если делитель равен нулю
     */
    public double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        return (double) a / b;
    }

    /**
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println( calc.add(5, 3));
        System.out.println( calc.divide(5, 3));
    }
}
