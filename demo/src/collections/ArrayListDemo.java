package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    static void main() {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        // T - O(1) add last
        languages.add("Java");
        // T - O(n) add in between
        languages.add(0, "JavaScript");

        int[] a = new int[10];
        System.out.println(a);

        System.out.println(languages.toString());

        // T - O(n)
        languages.remove(1);

        System.out.println(languages);
        System.out.println(languages.size());
        // T - O(1)
        System.out.println(languages.get(1));

        for(String language : languages){
//            if(language.equals("Java")){
//                languages.remove(language);
//            }
            System.out.println(language);
        }

        System.out.println(languages);

        Iterator<String> itr = languages.iterator();
        while(itr.hasNext()){
            String ele = itr.next();
            if(ele.equals("Python")){
                itr.remove();
            }
        }

        System.out.println(languages);
    }

    public void printList(List<String> list){
        for (String ele : list){
            System.out.println(ele);
        }
    }
}
