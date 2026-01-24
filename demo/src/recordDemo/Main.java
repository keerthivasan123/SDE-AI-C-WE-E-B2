package recordDemo;

import functionInterfaceDemo.Person;

public class Main {
    static void main() {
        Person person = new Person("Guvi", 30);

        System.out.println(person.age());
        System.out.println(person.name());

        System.out.println(person);
        System.out.println(person.hashCode());


    }
}
