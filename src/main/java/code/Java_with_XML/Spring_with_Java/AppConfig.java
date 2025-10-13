package code.Java_with_XML.Spring_with_Java;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("code.Java_with_XML")
public class AppConfig {

//    //    @Bean(name = "modern_desktop") for changing name of a bean we can also use array here and use any name from it to call this.
////    @Qualifier is used to give command to bean to use this object only... works as @primary
//    @Bean
//    public Alien alien(@Qualifier("laptop") Computer com) {
//        Alien obj = new Alien();
//        obj.setCom(com);
//        return obj;
//    }
//
//    @Bean
//    @Primary
////    @Scope("prototype") used to make more than one object of a method.
//    public Desktop desk() {
//        return new Desktop();
//    }
//
//    @Bean
////    @Primary
//    public Laptop laptop() {
//        return new Laptop();
//    }

}
