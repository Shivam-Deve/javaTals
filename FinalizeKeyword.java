class Student {
    String name;
    int roll;

    @Override
    protected void finalize() throws Throwable {
        // you can write code to release all the resources that are aquired by object
        // i.e. close() connection to database or close() Scanner object etc...
        // Note: finalize is not called when reference to the Object is assigned null or
        // deleted
        // NOTE: "finalize is invoked when garbage collector free the memory of the
        // Object finalize is associated to"
        // and garbage collector doesn't free the memory instantly
        // it waits and then free alot of unused memory at once

        // below statement shows when finalized id called
        System.out.println("Finalized is invoked");
    }
}

public class FinalizeKeyword {
    public static void main(String[] args) {
        Student s;

        // here 9 Student objects are not being reference yet garbage collector is not
        // called
        for (int i = 0; i < 10; i++) {
            s = new Student();
        }

        // here alot are objects are not being referenced and new are being created
        // so garbage collector is called to free the memory needed
        for (int i = 0; i < 1000000; i++) {
            s = new Student();
        }
    }
}
