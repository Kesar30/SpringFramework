package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionconfig.xml");
        details data = (details) context.getBean("academy");
        System.out.println(data.getName());
        System.out.println(data.getPhones());
        System.out.println(data.getAddresses());
        System.out.println(data.getCourses());
    }
}
