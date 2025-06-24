package org.example;

import org.springframework.stereotype.Component;

@Component
public class AutoWiredAnnotatedClass {
    public AutoWiredAnnotatedClass() {
        System.out.println("AutowiredAnnotated object created");
    }

    public void print() {
        System.out.println("Printed");
    }
}
