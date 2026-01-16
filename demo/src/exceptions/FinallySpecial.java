package exceptions;

public class FinallySpecial {
    static void main() {
        System.out.println(m());
    }

    static int m() {
        try {
            System.out.println("Running try");
            System.exit(0);
            return 1;
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Finally block is executed");
        }
        return 0;
    }
}
