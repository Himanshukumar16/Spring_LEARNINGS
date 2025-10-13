package code.Java_with_XML;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    @Override
    public void compile() {
        System.out.println("coding.. with Laptop.");
        System.out.println("compiling in laptop..");
    }
}