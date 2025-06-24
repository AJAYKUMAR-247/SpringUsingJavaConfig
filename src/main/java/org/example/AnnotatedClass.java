package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // -- > This annotation is used to make this class to be manipulated by the spring.
// So if we add this annotation in a class, this class will be automatically used by the spring with the help of @ComponentScan
public class AnnotatedClass {

    @Autowired // --> If we're using a different class inside a class, then we have to autowired that another class, so that spring will create a bean of that class
    AutoWiredAnnotatedClass autoWiredAnnotatedClass;

    // This @Autowired is classified into three types, 1. Filed Injection, 2. Constructor Injection and 3. Setter Injection

    public AnnotatedClass() {
        System.out.println("AnnotatedClass object Created");
//        autoWiredAnnotatedClass.print();
    }
}
