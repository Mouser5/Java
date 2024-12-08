public class Example {

    // Иерархия исключений
    static class Ex1 extends Exception {}
    static class Ex2 extends Ex1 {}
    static class Ex3 extends Ex2 {}

    public static void main(String[] args) {
        try {
           
            throw new Ex3(); 
        } catch (Ex1 | Ex2 | Ex3 e) { 
            
            System.out.println("Обработано исключение: " + e.getClass().getSimpleName());
        }
    }
}

//2 - перемннная e не может быть изменена в данном объявлении 
