import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharactersStreams {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("text2.text");
        FileWriter ip = new FileWriter("text.text");
        int n;
        while ((n = in.read()) != -1) {
            ip.write((char) n);
        }

        // for (int i = 0; i < b.length; i++) {
        // ip.write(b[i]);
        // }
        ip.close();
        in.close();
    }
}
