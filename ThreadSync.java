class Post {
    int likes = 0;

    // use synchronized to make a method thread proof
    public synchronized void like() {
        likes++;
    }

    public int getLikes() {
        return likes;
    }
}

class Server extends Thread {
    Post post;

    public Server(Post post) {
        this.post = post;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            post.like();
        }
    }
}

public class ThreadSync {
    public static void main(String[] args) throws InterruptedException {
        Post p = new Post();
        Server t1 = new Server(p);
        Server t2 = new Server(p);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(p.getLikes());
    }
}
