package genericDemo;

import java.util.List;

class Printer {
    public <T extends Integer, R extends StringBuilder> R multipelGeneric(T input, R string){
        return (R) string.append(input);
    }

    public <T> T getValue(T value) {
        System.out.println(value);
        return value;
    }

    public <T> void print(T value) {
        System.out.println(value);
    }

    void printList(List<?> list) {
//        list.add(null);
//        list.add(null);
//        list.add(1);
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n.doubleValue());
        }
    }

    void addIntegers(List<? super Integer> list) {

        list.add(10);
        list.add(20);
        System.out.println(list.get(0));
    }



}

