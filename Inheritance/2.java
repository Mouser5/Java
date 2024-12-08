class A {
    public final void display() {
        System.out.println("Method in class A");
    }
}

class B extends A {
    // @Override
    // public void display() {
    //     System.out.println("Method in class B");
    // }
}

//2 
final class A2 {
    public final void display() {
        System.out.println("Method in class A");
    }
}

class B2 extends A2{}
