package exceptions;

public class FinallyEx {
    static void main() {
//        boolean isFileCreated = true;
//        int divider = 0;
//        while(isFileCreated){
//            try {
//                System.out.println("Entering into try block");
//                int a = 10 / divider;
//                System.out.println(a);
//                isFileCreated = false;
//            } catch (ArithmeticException ex) {
//                System.out.println(ex.getMessage());
//                divider = 1;
//            } finally {
//                System.out.println("Finally block executed.");
//            }
//        }

        try {
            int[] a = new int[3];
            a[2] = 10 / 0;
            a[5] = 10;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index error");
        } catch (Exception e) {
            System.out.println("General exception");
        }


    }
}
