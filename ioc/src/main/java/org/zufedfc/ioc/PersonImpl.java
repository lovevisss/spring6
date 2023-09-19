package org.zufedfc.ioc;

public class PersonImpl implements UserDao{
    @Override
    public void sub() {
        System.out.println("sub... person");
    }
}
