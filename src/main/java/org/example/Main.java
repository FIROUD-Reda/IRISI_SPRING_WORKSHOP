package org.example;

import org.example.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("config.xml");

        Person personSingletonA = (Person) applicationContext.getBean("personSingleton");
        Person personSingletonB = (Person) applicationContext.getBean("personSingleton");

        personSingletonA.setName("reda");
        System.out.println("first time:");
        System.out.println("a "+personSingletonA.getName());
        System.out.println("b "+personSingletonB.getName());

        System.out.println("second time time:");

        personSingletonB.setName("changedName");

        System.out.println("a "+personSingletonA.getName());
        System.out.println("b "+personSingletonB.getName());

        ((AbstractApplicationContext) applicationContext).close();
    }
}