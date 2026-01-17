package collections.studentmanager;

public class Main {
    static void main() {
//        StudentManager studentManager = new StudentManager();
//        studentManager.addStudent(new Student(1, "ABCD"));
//        studentManager.addStudent(new Student(2, "QWER"));
//        studentManager.addStudent(new Student(3, "RTEW"));
//        studentManager.addStudent(new Student(4, "IOPU"));
//        studentManager.addStudent(new Student(5, "CGHD"));
//
//
//        studentManager.print();
//
//        studentManager.removal(1);
//
//        studentManager.print();
//
//        studentManager.removal(10);
//
//        studentManager.print();

        StudentManagerUsingHashMap studentManagerUsingHashMap = new StudentManagerUsingHashMap();
        studentManagerUsingHashMap.addStudent(new Student(1, "ABCD"));
        studentManagerUsingHashMap.addStudent(new Student(2, "QWER"));
        studentManagerUsingHashMap.addStudent(new Student(3, "RTEW"));
        studentManagerUsingHashMap.addStudent(new Student(4, "IOPU"));
        studentManagerUsingHashMap.addStudent(new Student(5, "CGHD"));
        studentManagerUsingHashMap.addStudent(new Student(1, "CGHD"));


        studentManagerUsingHashMap.print();

        studentManagerUsingHashMap.removal(1);

        studentManagerUsingHashMap.print();

        studentManagerUsingHashMap.removal(10);

        studentManagerUsingHashMap.print();
    }
}

