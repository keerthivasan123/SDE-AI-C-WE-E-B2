package functionInterfaceDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    static void main() {
        Runnable r = () -> {
            System.out.println("Thread running");
            System.out.println("Started!!!");
        };

        Runnable r2 = () -> System.out.println("Thread running");
        r.run();
        r2.run();

        Runnable runnable = new RunnableImpl();
        runnable.run();

        Comparator<Integer> comp = (a, b) -> a - b;

        System.out.println(comp.compare(100, 2));

        Calculator calculator = (a, b) -> a * b;
        Calculator calculatorUsingMethodRef = Math::max; // (a, b) -> Math.max(a, b)
        System.out.println(calculator.add(8, 9));
        System.out.println(calculatorUsingMethodRef.add(100,200));

        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(10)); // true
        System.out.println(isEven.test(7));  // false


        Function<Integer, String> toString = n -> "Value asdf : " + n;
        System.out.println(toString.apply(10));

        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("Hello Java");


        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());


        Predicate<Integer> even = n -> n % 2 == 0;
        Function<Integer, Integer> square = n -> n * n;
        Consumer<Integer> print = System.out::println;
        Supplier<Integer> number = () -> 10;
        if (even.test(number.get())) {
            print.accept(square.apply(number.get()));
        }


        // Sorting using comparator
        List<Integer> list = new ArrayList<>(List.of(23,342, 1, 32, 231, 423));
        System.out.println(list);
        list.sort((a, b) -> a - b);
//        list.sort(Comparator.comparingInt(a -> a));
        System.out.println(list);

    }
}
