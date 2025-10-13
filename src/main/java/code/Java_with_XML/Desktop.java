package code.Java_with_XML;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

    public Desktop(){
        System.out.println("object created !");
    }

    @Override
    public void compile() {
        System.out.println("coding.. with Desktop.");
        System.out.println("Compiling in desktop...");
    }

}
