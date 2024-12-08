public class Main {
    public static void main(String[] args) {
        // 2
        System.out.println("Infinite loop using while:");
        int i = 1;
        while (true) {
            if (i == 4) {
                continue; 
            }
            if (i==5)
                break;
            System.out.println(i);
            i++;
        }
        //1
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (true);

        int k=0;
        while (true) {
            System.out.println(i);
            k++;
        }
    }
}
