class A {

}

class B extends A implements Runnable {

    @Override
    public void run() {
        System.out.println("I am runnable");
    }

}

public class RunableInterface {
    public static void main(String[] args) {
        B b = new B(); // create object of B
        Thread t = new Thread(b); // pass object into thread
        t.start();
    }
}
