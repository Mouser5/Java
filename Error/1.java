public class Errors {

    public static void main(String[] args) {
        
        try {
            int result = 10 / 0; // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }

        
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Попытка доступа к элементу с индексом 5
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс за пределами массива");
        }

        try {
            setAge(-5); // Пытаемся задать неверный возраст
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: Неверное значение возраста");
        }

        try {
            Object obj = new Integer(10);
            String str = (String) obj; // Неверное преобразование
        } catch (ClassCastException e) {
            System.out.println("Ошибка: Невозможно преобразовать Integer в String");
        }

        try {
            String str = null;
            System.out.println(str.length()); // Попытка вызвать метод у объекта null
        } catch (NullPointerException e) {
            System.out.println("Ошибка: Попытка вызвать метод у объекта null");
        }
    }
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }
}
