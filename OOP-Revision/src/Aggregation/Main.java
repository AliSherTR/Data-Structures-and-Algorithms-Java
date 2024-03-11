package Aggregation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> cs_students = new ArrayList<>();
        List<Student> ee_students = new ArrayList<>();
        int cs_count = 0;
        int ee_count = 0;
        Student s1 = new Student("John");
        Student s2 = new Student("Oliver");
        Student s3 = new Student("Haris");
        cs_students.add(s1);
        ee_students.add(s2);
        ee_students.add(s3);


        for (Student ignored : cs_students) {
            cs_count++;
        }
        for (Student ignored : ee_students) {

            ee_count++;
        }

        Department cs = new Department("Computer Science" , cs_students);

        Department ee = new Department("Electrical Engineering" , ee_students);

        System.out.println(cs.name + " has " + cs_count + " students");
        System.out.println(ee.name + " has " + ee_count + " students");

    }
}
