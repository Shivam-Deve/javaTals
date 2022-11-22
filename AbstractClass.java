abstract class A {

    // abstract void name(){ // not allowed => abstract methods can't have body
    // System.out.println("I am A");
    // }
    abstract void name();

}

class B extends A {

    @Override
    void name() { // abstract methods must be implemented in child class
        // TODO Auto-generated method stub

    }

}

public class AbstractClass {
    public static void main(String[] args) {
        // A a = new A(); // not allowed => abstract classes can't be instansiated
        B b = new B(); // allowed
    }

}
