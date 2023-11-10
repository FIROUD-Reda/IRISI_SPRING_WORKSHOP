package org.example;

import org.example.Service.Interface.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("org.example.Service","org.example.Dao","org.example.Aspects");
//        Calculator calculatorByName= (Calculator) applicationContext.getBean("calculator");
        Calculator calculatorByName=  applicationContext.getBean(Calculator.class);
//        System.out.println(calculatorByName.getClass().getName());
        System.out.println(calculatorByName.addNumberToMagicNumberFromDb(4));
    }
}