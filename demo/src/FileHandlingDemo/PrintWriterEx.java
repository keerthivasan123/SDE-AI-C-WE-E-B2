package FileHandlingDemo;

import java.io.*;

public class PrintWriterEx {
    static void main() throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        PrintWriter pw = new PrintWriter(System.out);

        String name = br.readLine();
        pw.println("Hello " + name);


        int i = 10;
        double d = 99.5;
        boolean flag = true;
        char ch = 'A';

        pw.println(i);
        pw.println(d);
        pw.println(flag);
        pw.println(ch);


    }
}
