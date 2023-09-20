package Model;

import java.util.List;

public class Department {
    private String name;
//    有很多员工
    private List<Employee> employees;

    public void add(){
        System.out.println("info..." + name);
        for (Employee emp:employees){
            System.out.println(emp.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
