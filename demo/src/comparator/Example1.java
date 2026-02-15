package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example1 {
    static void main() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("asdf2", 1, 23));
        studentList.add(new Student("asdf1", 12, 26));
        studentList.add(new Student("asdf4", 9, 99));
        studentList.add(new Student("asdf4", 4, 100));
        studentList.add(new Student("asdf8", 45, 0));
        studentList.add(new Student("asdf3", 2, 45));

        Comparator<Student> marksComaratorAsc = (s1, s2) -> s1.marks - s2.marks;
        Comparator<Student> marksComaratorDesc = (s1, s2) -> s2.marks - s1.marks;

        Comparator<Student> byNameAsc = Comparator.comparing(s -> s.name);
        Comparator<Student> byNameDesc = Comparator.comparing(s -> s.name);

        Comparator<Student> byIdAsc = Comparator.comparing(s -> s.id);
        Comparator<Student> byIdDes = Comparator.comparingInt((Student s) -> s.id).reversed();

        Collections.sort(studentList);

        System.out.println(studentList);
    }
}
