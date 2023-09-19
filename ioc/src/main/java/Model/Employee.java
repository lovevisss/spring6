package Model;

public class Employee {
    private String name;
    private Integer age;
//    员工属于某个部门
    private Department department;

    public void add(){
        System.out.println("add...");
    }

    public Employee(){
        System.out.println("Employee无参构造方法");
    }

    public void run(){
        System.out.println("run..." + name + "is " + age);
    }
}
