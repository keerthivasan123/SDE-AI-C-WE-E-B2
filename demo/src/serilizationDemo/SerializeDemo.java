package serilizationDemo;

import java.io.*;
public class SerializeDemo {
    public static void main(String[] args) throws Exception {
        Employee emp = new Employee(1, "Alice");
        ObjectOutputStream oos =
                new ObjectOutputStream(
                        new FileOutputStream("emp.txt"));
        oos.writeObject(emp);
        oos.close();
    }
}

