public class Main {
    public static void main(String[] args) {
        int a = 10, b = 5;
        double x = 15.5, y = 4.5;
        boolean flag1 = true, flag2 = false;
        String str1 = "Hello", str2 = "World!";

        a = b;
        a += b;
        a -= b;
        a *= b;
        a /= b;
        a %= b;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        System.out.println(flag1 && flag2);
        System.out.println(flag1 || flag2);
        System.out.println(!flag1);

        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(a & b);

        System.out.println(a << 2);
        System.out.println(a >> 2);
        System.out.println(a >>> 2);

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);

        System.out.println(~a);
        System.out.println(!flag1);

        int[] arr = {1, 2, 3};
        System.out.println(arr[0]);

        System.out.println(str1 + str2);

        // 2
        Object obj1 = "Test";
        Object obj2 = 123;
        Object obj3 = null;

        System.out.println(obj1 instanceof String);
        System.out.println(obj2 instanceof String);
        System.out.println(obj3 instanceof String);
    }
}
