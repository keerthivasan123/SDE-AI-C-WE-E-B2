package streamDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<Integer> list = List.of(10, 22, 1, 3, 15);
        list.stream()
                .filter(n -> n > 10)
                .map(n -> n * 2)
                .forEach(System.out::println);




        List<List<String>> twoDList = List.of(
                List.of("A", "B"),
                List.of("C", "D")
        );

        System.out.println(twoDList);

        for(int i=0; i<twoDList.size(); i++){
            for(int j=0; j<twoDList.get(i).size(); j++){
                System.out.println(twoDList.get(i).get(j));
            }
        }


        twoDList.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);


        List<String> flatList = twoDList.stream()
                .flatMap(Collection::stream)
                .toList();

        System.out.println(flatList);


        List<Integer> unsortedList = new ArrayList<>(List.of(232, 324, 1, 23, 546, 3));

        System.out.println(unsortedList.stream().sorted(Collections.reverseOrder()).toList());


        System.out.println(unsortedList.stream().limit(3).toList());
        System.out.println(unsortedList.stream().skip(3).toList());

        System.out.println(unsortedList.stream().sorted(Collections.reverseOrder()).limit(3).toList());

        List<Integer> even =
                list.stream()
                        .filter(n -> n % 2 == 0)
                        .collect(Collectors.toList());

        System.out.println("Even : " + even);

        int sum =
                list.stream()
                        .reduce(0, Integer::sum);
        System.out.println("Sum of list : " + sum);

        // Word that have e
        // Butterfly, Apple, Ball
        List<String> words = List.of("Butterfly", "Apple", "Ball");
        words.stream()
                .filter(w -> w.contains("e"))
                .findFirst().ifPresent(System.out::println);

        System.out.println(list.stream().anyMatch(n -> n > 10));
        System.out.println(list.stream().allMatch(n -> n > 10));
        System.out.println(list.stream().noneMatch(n -> n > 10));
    }
}
