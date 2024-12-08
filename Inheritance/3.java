//3 
class A {
    int a;
    int b;
    int c;
    int z;
  
    public A() {
      this(0, 0, 0); 
      z = 1;
    }
  
    public A(int a) {
      this(a, 0, 0); 
      z = 1;
    }
  
    public A(int a, int b) {
      this(a, b, 0); 
      z = 1;
    }
  
    public A(int a, int b, int c) {
      this.a = a;
      this.b = b;
      this.c = c;
      z = 1;
    }
  }
  //1 
class A {
    int x = 10;

    public A() {
        System.out.println("Constructor of A");
    }

    public void display() {
        System.out.println("Display method of A");
    }
}

class B extends A {
    int x = 20;

    public B() {
        super();
    }

    public void display() {
        super.display();
    }

    public void show() {
        System.out.println(super.x);
    }
}

//2 - метод А, потом a из A
