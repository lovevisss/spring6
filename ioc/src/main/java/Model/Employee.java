package Model;

import java.util.Arrays;

public class Employee {
    private String name;
    private Integer age;
//    员工属于某个部门
    private Department department;

    private String[] hobby;


    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public void add(){
        System.out.println("add...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee(){
        System.out.println("Employee无参构造方法");
    }

    public void run(){
        System.out.println("run..." + name + "is " + age);
        System.out.println("hobby:" + Arrays.toString(getHobby()));
        department.add();
    }
}
