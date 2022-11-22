public class ThrowVsThrows {
    public static void main(String[] args) {

        try {
            int result = divide(5, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            let_Me_Handle_Exception_In_Some_Other_Way();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("You can't divide a number with 0");
        }
        return a / b;
    }

    static void let_Me_Handle_Exception_In_Some_Other_Way() throws ArithmeticException {
        int result = 5 / 0;
    }
}
