package Code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext con = new ClassPathXmlApplicationContext("Spring.xml");
        Alien a = (Alien) con.getBean("alien");
        System.out.println(a.getRollno());
        a.code();
    }
}
