package serilizationDemo;

import java.io.*;
public class DeserializeDemo {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois =
                new ObjectInputStream(
                        new FileInputStream("emp.txt"));
        Employee emp = (Employee) ois.readObject();
        System.out.println(emp.id + " " + emp.name);
        ois.close();
    }
}

