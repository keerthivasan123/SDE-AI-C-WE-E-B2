package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FNF {
    static void main() {
        try {

            System.out.println("Entering into try block");
            int i = 10 / 0;
            System.out.println(i);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
