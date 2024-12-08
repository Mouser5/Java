class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}


class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();

        myAnimal.sound(); 
        myCat.sound();    

        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));        
        System.out.println(calc.add(2.5, 3.5));    
    }
}
