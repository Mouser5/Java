public class Main {
    public static void main(String[] args) {
        //1 
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("a is 1");
                break;
            case 2:
                System.out.println("a is 2");
                break;
        }

        char b = 'A';
        switch (b) {
            case 'A':
                System.out.println("b is A");
                break;
            case 'B':
                System.out.println("b is B");
                break;

        }
        String color = "Red";
        switch (color) {
            case "Red":
                System.out.println("The color is Red");
                break;
            case "Green":
                System.out.println("The color is Green");
                break;
        }
        //2
        int i = 0;
        int value = 2;

        switch (value) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2; // Выполнение этого блока и переход к case 3 
            case 3:
                i = 3;
                break;

        }
        // Вывод i=3;
    }
}
