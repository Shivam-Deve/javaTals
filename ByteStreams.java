import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteStreams {
    public static void main(String[] args) throws IOException {
        // String message = "Hello doston";
        // byte b[] = message.getBytes();
        FileInputStream in = new FileInputStream("text2.text");
        FileOutputStream ip = new FileOutputStream("text.text");
        int n;
        while ((n = in.read()) != -1) {
            ip.write(n);
        }

        // for (int i = 0; i < b.length; i++) {
        // ip.write(b[i]);
        // }
        ip.close();
        in.close();
    }
}
