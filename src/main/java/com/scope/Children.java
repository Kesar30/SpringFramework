package com.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
//defining scope using annotation
@Scope("prototype")
//default scope is singleton that use same object and prototype create different object every time
//it will create object by class name in small letters like children or you can pass name of the object like @Component("ob")
public class Children {
    @Value("kesar")
    private String name;
    @Value("20")
    private int age;
    //collection
    @Value("#{mark}")
    private Map<String,Integer> marks;

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
}

