package org.example;

public class Alien {
    private String name;
    private int age;
    private Computer com;

    public Alien() {
        System.out.println("Alien Object created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", com=" + com +
                '}';
    }
}
