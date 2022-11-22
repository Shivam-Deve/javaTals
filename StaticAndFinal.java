class A {
    // only one copy for "static field" is created
    // and it exist even when no object is instantiated=> it can be called using
    // className (e.g. A.num_of_objects)
    public static int num_of_objects = 0;

    // final is const i.e. its value can't be changed and declaration and
    // initialization is done at same time
    static final String name = "Class A"; // one unChangeable copy is created [field name is readOnly]

    A() {
        num_of_objects++;
    }
}

public class StaticAndFinal {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        System.out.println(a3.num_of_objects); // here its anicipated to print 1 but it will print 3
    }
}
