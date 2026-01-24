package FileHandlingDemo;

import java.io.*;
public class FileReadOld {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            File file = new File("demo/config/config1.txt");
            if(!file.exists())
                System.out.println("File Exist");
            else
                System.out.println("File Not Exist");
            FileReader fr = new FileReader(file);
            reader = new BufferedReader(fr);
            String line;
            while ((line = reader.readLine()) != null) {
                for(Character c : line.toCharArray()){
                    System.out.print(c);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();  // Mandatory cleanup
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

