package exceptions;

public class AIOB {
    static void main() {
        try {
            int[] arr = new int[10];
            // 0 - 9
            arr[12] = 100;
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }

    }
}
