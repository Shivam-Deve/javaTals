public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            // handle exception here
            // i.e. [e.printStackTrace(),System.out.println(e.getMessage())]
            System.out.println("You can't divide any number by 0");
        } finally {
            System.out.println("finally block runs always");
        }
    }
}
