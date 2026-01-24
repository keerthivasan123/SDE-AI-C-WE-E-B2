package FileHandlingDemo;

import java.io.*;
public class FileWriteOld {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            FileWriter fw = new FileWriter("demo/config/fileWriterOld.txt");
            writer = new BufferedWriter(fw);
            writer.write("Java File Handling \n New Style \n Old Style");
//            writer.newLine();
//            writer.write("Old Style");



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

