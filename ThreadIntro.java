public class ThreadIntro {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new SayHii();
        SayHello t2 = new SayHello();
        // threads are in new state

        t1.start();
        t2.start();
        // threads are in active state

        // set priorities
        t1.setPriority(1);
        t2.setPriority(10);

        t1.join();
        t2.join();
        // thread main in waiting

        System.out.println("Work is done");

        // threads are in terminated state

    }
}

class SayHii extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }

        }
    }
}

class SayHello extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000); // timed waiting
            } catch (Exception e) {

            }
        }

    }
}
