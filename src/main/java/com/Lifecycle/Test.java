package com.Lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //to call destroy method using abstract
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifecycleConfig.xml");
        simple s = (simple) context.getBean("s");
        System.out.println(s);
        context.registerShutdownHook();//it will call destory method
        //interfacesLC
        interfacesLC lc = (interfacesLC) context.getBean("lc");
        System.out.println(lc);
        //annotation
        annotationLC a = (annotationLC) context.getBean("a");
        System.out.println(a);
    }

}
