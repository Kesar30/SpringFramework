package com.collection.Standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Std-collectionconfig.xml");
        Person person1 = (Person) context.getBean("person1");
        Person person2 = context.getBean("person2", Person.class);
        System.out.println(person1);
        System.out.println(person1.getCourse_fees().getClass().getName());
        System.out.println(person1.getFriends().getClass().getName());
        System.out.println(person2);
        System.out.println(person2.getCourse_fees().getClass().getName());
        System.out.println(person2.getFriends().getClass().getName());
    }

}
