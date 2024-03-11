package Aggregation;

import java.util.List;

public class Institute {
    public String name;
    public List<Department> departments;

    public Institute(String name , List<Department> departments ) {
        this.name = name;
        this.departments = departments;
    }
}
