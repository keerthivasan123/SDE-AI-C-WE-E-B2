package collections.studentmanager;

import java.util.*;

public class StudentManagerUsingHashMap {
    Map<Integer, Student> studentMap = new HashMap<>();

    // T - O(1)
    public void addStudent(Student student){
        if(studentMap.containsKey(student.getId())){
            System.out.println("Student already exist !!!");
            return;
        }

        studentMap.put(student.getId(), student);
    }

    // T - O(1)
    public void removal(int id){
        if(!studentMap.containsKey(id)){
            System.out.println("Student doesn't exist");
            return;
        }

        System.out.println("Student removed successfully");
        studentMap.remove(id);
    }

    // T - O(n)
    public void print(){
        Iterator itr = studentMap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer, Student> entry = (Map.Entry<Integer, Student>) itr.next();
            System.out.println(entry.getValue());
        }
    }
}
