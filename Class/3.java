public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void anotherMethod() {
        printVars(); 
    }

    public static void main(String[] args) {
        // 1
        A.printVars();

        // 2
        A obj = new A();
        obj.printVars();

        // 3
        anotherMethod();
    }
}
