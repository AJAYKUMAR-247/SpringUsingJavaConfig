package org.example;

import org.example.Config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        // If you want spring to manage all the beans through java based configurations

        // To use the ApplicationContext of spring, you have to add the spring context dependency in the pom.xml file.
        // Use AnnotationConfigApplicationContext class to implement using java-based config, pass the java configuration file as the Argument
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop desktop = context.getBean(Desktop.class);

        Alien alien = context.getBean("alien", Alien.class);
        System.out.println(alien.getCom());

//        AnnotatedClass annotatedClass =
    }
}
