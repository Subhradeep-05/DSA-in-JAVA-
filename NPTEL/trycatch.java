public class trycatch {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0; // two possible exceptions
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e);
        }

        System.out.println("Program finished!");
    }
}
