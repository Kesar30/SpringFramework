package com.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ref_config.xml");
        A a = (A) context.getBean("classA");
        System.out.println("the value of x is :" +a.getX());
        System.out.println("the value of y is :" +a.getOb().getY());
        System.out.println("the sum of x and y is :" + a.sum());
    }
}
