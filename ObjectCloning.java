class Student implements Cloneable {
    String name;
    int roll;

    Student(String name, int roll) {
        this.roll = roll;
        this.name = name;
    }

    Student() {

    }

    @Override
    public String toString() {
        return "Object:" + this.name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Shivam", 1);
        Student s2 = (Student) s1.clone();
        System.out.println(s2);
    }
}
