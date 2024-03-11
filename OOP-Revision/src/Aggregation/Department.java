package Aggregation;

import java.util.List;

public class Department {
    public String name;
    public List<Student> students;
    public Department(String name , List<Student> students) {
        this.name = name;
        this.students = students;
    }
}
