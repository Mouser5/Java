import java.util.Date;

public class FormatterExample {
    public static void main(String[] args) {
 
        boolean isJavaFun = true;
        System.out.printf("%b%n", isJavaFun);

        char letter = 'A';
        System.out.printf("%c%n", letter);

        int number = 100;
        System.out.printf("%d%n", number);


        double price = 19.993;
        System.out.printf("%.1f%n", price); 

        Date currentDate = new Date();
        System.out.printf("%tF%n", currentDate); 

        //2        
         System.out.printf("%tH%n", currentDate);
         System.out.printf("%tI%n", currentDate);
         System.out.printf("%tM%n", currentDate);
         System.out.printf("%tS%n", currentDate);
         System.out.printf("%tA%n", currentDate);
    }
}
