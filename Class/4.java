public class A {
    public final int a;

    // Вариант 1: Инициализация в момент объявления
    public final int b = 10;

    // Вариант 2: Инициализация через конструктор
    public A(int value) {
        a = value;
    }

    public static void main(String[] args) {
        // 1
        A obj1 = new A(5);
        System.out.println( obj1.a);

        // 2
        A obj2 = new A(10);
        System.out.println(obj2.a);

        // 3
        A obj3 = new A(0); 
        System.out.println(obj3.b);
    }
}
