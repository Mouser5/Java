public class Example {

    public static void main(String[] args) {
        
        try {

            int result = 10 / 0;  
            System.out.println(result);
            
        } catch (ArithmeticException e) {
            System.out.println("Ошибка.");
        }

        try {
            // NullPointerException
            String str = null;
            System.out.println(str.length());  

        } 

    }
}
