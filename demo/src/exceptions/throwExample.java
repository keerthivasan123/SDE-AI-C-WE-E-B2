package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class throwExample {
    static void main() {
//        validAge(12);
//        try {
//            readFile();
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }

        try {
            m1();
        } catch (IOException e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    static void validAge(int age){
        if(age < 18){
            throw new RuntimeException("Age should be greater than 18");
        }

        System.out.println("Valid Age to Vote");
    }

    static void readFile() throws FileNotFoundException {
        FileReader fr = new FileReader("data1.txt");
    }

    static void m1() throws IOException {
        m2();
    }
    static void m2() throws IOException {
        m3();
    }
    static void m3() throws IOException {
        throw new IOException("Error");
    }

}
