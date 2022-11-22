import java.io.*;

class Student implements Serializable {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}

public class ObjectSerialization {

    public static void main(String[] args) throws IOException {
        Student s1 = new Student("Shivam", 1);
        FileOutputStream file = new FileOutputStream("object.text"); // byteStream
        ObjectOutputStream obStream = new ObjectOutputStream(file); // byteStream
        obStream.writeObject(s1);
        obStream.close();
        file.close();
    }

}
