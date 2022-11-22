interface I {
    void name(); // we have to implement non-default methods in child class

    default void type() { // we can give some default definition to methods in interface [not possible in
                          // abstract class]
        System.out.println("I am Interface");
    }
}

class C implements I {

    @Override
    public void name() {
        System.out.println("I am Class");
    }

}

public class Interfaces {
    public static void main(String[] args) {
        // I i=new I() // not allowed => interfaces can't be intantiated
        C c = new C(); // allowed
    }
}
