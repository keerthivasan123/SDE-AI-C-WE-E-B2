package genericDemo;

class Calculator<T extends Number> {
    T num;
    Calculator(T num) {
        this.num = num;
    }

    double square() {
        return num.doubleValue() * num.doubleValue();
    }
}

