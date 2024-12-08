//1
public class Main {
    public static void main(String[] args) {
        byte by = 0;
        short s = 0;
        int i = 0;
        long l = 0L;
        float f = 0.0f;
        double d = 0.0;
        boolean BB = false;
        char ch = '\u0000';
        //2 
        String name= "\u0421\u0442\u0430\u043d\u0438\u0441\u043b\u0430\u0432"; 
        System.out.println(name); // Ваше имя
        // 3 Ошибка из-за ограничение видимости . Решение проблемы приведенено  
        int b=0;
        int a = 1;
        {
             b = 2;
        }
        int c = a + b;
        System.out.println(c);
        // 4
        String res= "Result : ";
        System.out.println(res+i);
        System.out.println(res+name);
        // 5 int->float
        System.out.println(a+f); 
        // 6
        by = (byte)(a);
        System.out.println(by); 
        //7
        //int a2 = 120;
        //byte b2 = a2 + 10; //Ошибка с типами (справа byte - слева int)

    }
}
