package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("scopeconfig.xml");
        Children children = context.getBean("children", Children.class);
        Teacher teacher = context.getBean("teacher", Teacher.class);
        Children children1 = context.getBean("children", Children.class);
        Teacher teacher1 = context.getBean("teacher", Teacher.class);

        System.out.println(children);
        System.out.println(children1);
        System.out.println(children.hashCode());
        System.out.println(children1.hashCode());
        System.out.println(teacher);
        System.out.println(teacher1);
        System.out.println(teacher.hashCode());
        System.out.println(teacher1.hashCode());


    }
}
