
//import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.io.FileReader;
import java.io.IOException;
import static java.lang.Math.*;

void m1() throws IOException {
    m2();
}
void m2() throws IOException {
    m3();
}
void m3() throws IOException {
    throw new IOException("Error");
}

void main(String[] arr)  {
    try {
        m1();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
