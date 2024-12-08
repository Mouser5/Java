import java.util.ArrayList;
import java.util.List;
//1
class Wrapper<T> {
    private T item;

    public Wrapper(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}



class NumberProcessor {
    public static double sumOfNumbers(List<? extends Number> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void addIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }
}


public class Main {
    public static void main(String[] args) {
        Wrapper<String> stringWrapper = new Wrapper<>("Hello");
        Wrapper<Integer> integerWrapper = new Wrapper<>(123);

        System.out.println(stringWrapper.getItem());
        System.out.println(integerWrapper.getItem());     
        
        //2
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        List<Double> doubles = List.of(1.1, 2.2, 3.3);
        
        System.out.println(NumberProcessor.sumOfNumbers(integers));
        System.out.println(NumberProcessor.sumOfNumbers(doubles));

        List<Object> objects = new ArrayList<>();
        NumberProcessor.addIntegers(objects);

        System.out.println( objects);
    }
}
