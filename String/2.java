public class StringBufferBuilderExample {
    public static void main(String[] args) {
        // 1. Создание StringBuffer и добавление текста
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        System.out.println(stringBuffer);  

        // 2. Вставка текста в StringBuffer
        stringBuffer.insert(5, ",");
        System.out.println(stringBuffer); 

        // 3. Замена части строки в StringBuffer
        stringBuffer.replace(5, 6, ":");
        System.out.println(stringBuffer);  

        // 4. Удаление части строки из StringBuffer
        stringBuffer.delete(5, 6);
        System.out.println(stringBuffer);  

        // 5. Реверс строки в StringBuffer
        stringBuffer.reverse();
        System.out.println(stringBuffer); 

        // 6. Получение длины StringBuffer
        int length = stringBuffer.length();
        System.out.println(length);  


        // 8. Использование StringBuilder: создание объекта
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" world");
        System.out.println(stringBuilder); 

        // 9. Использование setLength() в StringBuilder
        stringBuilder.setLength(7);  
        System.out.println(stringBuilder);  

        //2 
        
        // 7. Преобразование StringBuffer в String
        
        String str = stringBuffer.toString();
        System.out.println(str);  

        // 10. Преобразование StringBuilder в String
        StringBuilder sb = new StringBuilder("Hello world");
        String sbStr = sb.toString();
        System.out.println(sbStr);  
    }
}
