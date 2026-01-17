package collections.studentmanager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentManager {
    List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void removal(int id){
        Iterator<Student> itr = students.iterator();
        while(itr.hasNext()){
            Student student = itr.next();
            if(student.getId() == id){
                System.out.println("Student : " + student.getName() + " is removed !!!");
                itr.remove();
                return;
            }
        }

        System.out.println("Student with id : " + id + " is not present");
    }

    public void print(){
        for(Student student : students){
            System.out.println(student);
        }
    }
}
