import Model.Employee;
import di.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zufedfc.ioc.User;
import org.zufedfc.ioc.UserDao;
import org.zufedfc.ioc.UserImpl;

public class TestUser {

    @Test
    public void testAdd() {
//        加载spring配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        获取配置创建的对象
        User user = (User) applicationContext.getBean("user");
        System.out.println("get by id:" + user);

        User user2 = applicationContext.getBean(User.class);
        System.out.println("get by class:" + user2);

        User user3 = applicationContext.getBean("user", User.class);
        System.out.println("get by id and class:" + user3);

//        UserDao user4 =  applicationContext.getBean(UserDao.class);
//        user4.sub();
    }

    @Test
    public void testBook() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = applicationContext.getBean("book", Book.class);
        System.out.println(book.getAuthor());
        System.out.println(book.getName());
        System.out.println(book.getPrice());
    }

    @Test
    public void testConstruct(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("construct.xml");

        Book book = (Book) applicationContext.getBean("book");
        System.out.println(book.getAuthor());
        System.out.println(book.getName());
        System.out.println(book.getPrice());

    }

    @Test
    public void testEmployee(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("model.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        employee.run();

    }

    @Test
    public void testEmployee2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("model.xml");
        Employee employee2 = (Employee) applicationContext.getBean("employee2");
        employee2.run();
    }

    @Test
    public void testEmployee3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("model.xml");
        Employee employee3 = (Employee) applicationContext.getBean("emp3");
        employee3.run();

    }

    @Test
    public void testEmployee4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("arraystring.xml");
        Employee employee4 = (Employee) applicationContext.getBean("employee");
        employee4.run();

    }



    

}