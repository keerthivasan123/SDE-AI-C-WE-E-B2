package abstractDemo;

abstract public class Vehicle {
    Vehicle() {
        System.out.println("Vehicle !!!");
    }

    int speed;

    abstract void move();

    void fuelType() {
        System.out.println("Uses fuel");
    }

}
