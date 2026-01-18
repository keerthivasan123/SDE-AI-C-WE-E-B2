package genericDemo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        Box<Integer> boxInt = new Box<>();
        boxInt.setValue(1);
        System.out.println(boxInt.getValue());

        Box<String> boxString = new Box<>();
        boxString.setValue("asdf");
        System.out.println(boxString.getValue());

//        BoxNonGeneric<String> boxNonGeneric = new BoxNonGeneric();
//        boxNonGeneric.setValue("asdf");
//        System.out.println(boxNonGeneric.getValue());

        Pair<String, Integer> pair1 = new Pair<>("asdf", 1);
        Pair<Character, String> pair2 = new Pair<>('C', "Character");
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("123");

        Pair<String, List<String>> pair3 = new Pair<>();
        pair3.setKey("C");
        pair3.setValue(list);

        Calculator<Integer> calculator = new Calculator<>(10);
        System.out.println(calculator.square());
        Calculator<Double> calculator1 = new Calculator<>(10.0);
        System.out.println(calculator1.square());


        Box<I> box = new Box<>();

        Printer printer = new Printer();
        printer.print("ADSF");
        printer.print(1);
        printer.print(2323L);
        printer.print(2.232323);
        System.out.println(printer.getValue(1));
        System.out.println(printer.getValue("asdf"));

        System.out.println(printer.multipelGeneric(1, new StringBuilder("Hi ")));

//        List<Number> numbers = new ArrayList<Integer>();

        List<Integer> asdf = new ArrayList<>();
        asdf.add(1);
        asdf.add(2);
        printer.printList(asdf);

        printer.printNumbers(asdf);

        List<Number> list5 = new ArrayList<>();
        list5.add(1);
        list5.add(5.5545);
        Double result = list5.get(0).doubleValue() +  list5.get(1).doubleValue();
        System.out.println(result);
        Integer result1 = (int) (list5.get(0).doubleValue() +  list5.get(1).doubleValue());
        System.out.println(result1);

        printer.addIntegers(asdf);
        System.out.println(asdf);
    }
}
