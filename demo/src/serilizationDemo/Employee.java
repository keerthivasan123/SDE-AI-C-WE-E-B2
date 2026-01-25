package serilizationDemo;

import java.io.Serializable;
class Employee implements Serializable {
    private static final long serialVersionUID = 2L;
    int id;
    String name;
    String address;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

