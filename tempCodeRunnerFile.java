try {
            int result = divide(5, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }