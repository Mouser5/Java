import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class Example {
    public static void main(String[] args) {
        try (FileInputStream file = new FileInputStream("input.txt")) {
            int byteData;
            while ((byteData = file.read()) != -1) {
                System.out.print((char) byteData); // Чтение и вывод символа
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
            try (FileOutputStream fos = new FileOutputStream("output.txt")) {
                String data = "Hello world!";
                for (int i = 0; i < data.length(); i++) {
                    fos.write(data.charAt(i)); // Запись одного байта в файл
                }
            } catch (IOException e) {
                e.printStackTrace();
        }    
        try (AutoCloseableExample example = new AutoCloseableExample()) {
            example.Do();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

//3 Reader, Writer предназначены для работы с текстовыми данными 
