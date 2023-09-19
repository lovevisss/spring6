package org.zufedfc.ioc;

public class User {
    private String name;
    private Integer age;

    public void add(){
        System.out.println("add...");
    }

    public User(){
        System.out.println("User无参构造方法");
    }

    public void run(){
        System.out.println("run...");
    }
}
