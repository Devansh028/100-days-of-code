public class ExceptionHandlingDemo {

    public static void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        } finally {
            System.out.println("Execution finished.");
        }
    }

    public static void main(String[] args) {
        divide(10, 2); // ok
        divide(10, 0); // error handled
    }
}
