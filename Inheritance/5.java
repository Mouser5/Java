class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. Проверка на одинаковые
        if (this == obj) {
            return true;
        }

        // 2. Проверка на null
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Person person = (Person) obj;

        return name.equals(person.name) && age == person.age;
    }

}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Alice", 30);
        Person p3 = new Person("Alice", 30);
        Person p4 = new Person("Bob", 25);

        // Проверка на рефлексивность
        System.out.println(p1.equals(p1)); 

        // Проверка на null
        System.out.println(p1.equals(null)); 

        // Проверка на симметричность
        System.out.println(p1.equals(p2));  
        System.out.println(p2.equals(p1));  

        // Проверка на транзитивность
        System.out.println(p1.equals(p2));  
        System.out.println(p2.equals(p3));  
        System.out.println(p1.equals(p3));  

        // Проверка на разные объекты
        System.out.println(p1.equals(p4)); 
    }
}
