package I18;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

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
        System.out.println(bundle.getString("asdf"));
    }
}
