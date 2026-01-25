package I18;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
////        Locale locale = new Locale("fr", "FR");
//        Locale locale = new Locale("en", "En");
//        ResourceBundle bundle =
//                ResourceBundle.getBundle("messages", locale);
//
//        System.out.println(bundle.getString("welcome"));
//        System.out.println(bundle.getString("asdf"));


        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        System.out.println(nf.format(1234567.89));


        NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(cf.format(100000));

        Locale locale = new Locale("fr", "FR");
        ResourceBundle bundle =
                ResourceBundle.getBundle("messages", locale);
        System.out.println(bundle.getString("welcome"));
//        System.out.println(bundle.getString("asdf"));


//        List<Integer> list = List.of(1, 2, 33, 4, 5, 6);
        List<List<String>> list = List.of(
                List.of("A", "B"),
                List.of("C", "D")
        );
        List<String> flatList = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(flatList);

        LocalDate today = LocalDate.now();
        LocalDate dob = LocalDate.of(1998, 5, 10);
        System.out.println(today);
        System.out.println(dob);

    }
}
