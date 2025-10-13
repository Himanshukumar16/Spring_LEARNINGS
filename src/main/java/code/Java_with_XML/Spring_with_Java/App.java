package code.Java_with_XML.Spring_with_Java;

import code.Java_with_XML.Alien;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien al = context.getBean(Alien.class);
        al.code();
    }
}
