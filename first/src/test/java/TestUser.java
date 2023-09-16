import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zufedfc.spring6.User;

public class TestUser {

    @Test
    public void testAdd(){
//        加载spring配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        获取配置创建的对象
        User user = (User) applicationContext.getBean("user");
        user.add();
    }

//    反射创建对象
    @Test
    public void test2() throws Exception {
        Class<?> aClass = Class.forName("org.zufedfc.spring6.User");
//        User user = (User) aClass.newInstance();
        User user = (User) aClass.getConstructor().newInstance();
        user.add();
    }


}
