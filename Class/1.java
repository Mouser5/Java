public class AccessModifiersExample {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3;
    private int privateVar = 4;

    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();
        System.out.println( example.publicVar);
        System.out.println (example.protectedVar);
        System.out.println( example.defaultVar);
        System.out.println( example.privateVar);
    }
}
