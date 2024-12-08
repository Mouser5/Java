public class Main {
    public static void main(String[] args) {
        //1
        Integer intValue1 = Integer.decode("12");        // 10 значение
        Integer intValue2 = Integer.decode("0x12");      // 16 значение
        Integer intValue3 = Integer.decode("012");       // 8 значение

        System.out.println("intValue1: " + intValue1);    
        System.out.println("intValue2: " + intValue2);    
        System.out.println("intValue3: " + intValue3);    

        //2
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf("true");
        Boolean b3 = true;
        Boolean b4 = Boolean.parseBoolean("TRUE");

        System.out.println(b1);  
        System.out.println(b2);  
        System.out.println(b3);  
        System.out.println(b4);  
        //3
        Integer i = null;
        try {
            int j = i;  
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }

        /* 4
         * для 128  a1 b1 выходят за пределы кэша, поэтому a1==b1 -false 
         * a1.equals(b1) - true
         * в остальных - true
         */
        
    }
}
