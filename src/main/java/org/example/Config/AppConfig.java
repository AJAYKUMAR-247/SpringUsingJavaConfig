package org.example.Config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;


// If you're going to use this class as a configuration file for spring config, then annotate it with @Configuration annotation
@Configuration
public class AppConfig {

    @Bean // This is used to say spring that this bean has to be created, injected and managed by the spring
    @Primary
    public Desktop desktop() { // We have to create a method, which will return the bean
        Desktop desktop = new Desktop();
        desktop.setDesktopId(1);
        return desktop;
    }

    // If you want to give a name for bean you can give like this, or else it will take the method name as Bean name
    // You can also give array of bean names. ex : @Bean(name = {"Des","Des1"})
    @Bean(name = "Des")
    @Scope("prototype")// This annotation is used to change the scope of the bean
    public Desktop desktop1() {
        Desktop desktop = new Desktop();
        desktop.setDesktopId(2);
        return desktop;
    }

    @Bean
    // @Autowired is used to autowire the class, which we're going to use here
    // @Qualifier is used to decide which bean we're going to use in case if we're having more than one bean of a same class
    public Alien alien(@Autowired @Qualifier("Des") Computer com) {
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setName("Ajay");
        obj.setCom(com);

        return obj;
    }
}
