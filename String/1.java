//2
    import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // Создание объекта StringJoiner с разделителем
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Orange");

        // Вывод объединённой строки
        System.out.println("Fruits: " + joiner.toString());
    
    //1
    
        // Создание строки
        String str = " Hello World";

        System.out.println(str.length());


        System.out.println( str.charAt(7));


        System.out.println(str.substring(7));


        System.out.println(str.toUpperCase());


        System.out.println(str.toLowerCase());


        System.out.println(str.contains("World"));

        System.out.println(str.replace("World", "Java"));

        System.out.println(str.startsWith("Hello"));

        System.out.println(str.endsWith("!"));

        System.out.println( str.indexOf("World"));

        // 3 """ - Создание текстовых блоков
    }
}
