package comparator;

public class Student implements Comparable<Student> {
    public Student(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    String name;
    int id;
    int marks;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student others) {
        return this.marks - others.marks;
    }
}
