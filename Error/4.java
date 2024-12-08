class InvalidAge extends Exception {
        public InvalidAge (String message) {
        super(message); 
    }
}

public class Example {
    public static void checkAge(int age) throws InvalidAge {
        if (age < 18) {
            throw new InvalidAge("Возраст должен быть >=18 лет");
        } else {
            System.out.println("Возраст допустим");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16); 
        } catch (InvalidAge e) {
            System.out.println(e.getMessage());
        }
    }
}
