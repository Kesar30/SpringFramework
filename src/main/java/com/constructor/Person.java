package com.constructor;

public class Person {
    private String name;
    private int id;
    private certificate cer;
    public Person(String n , int id ,certificate c){
        this.name = n;
        this.id = id;
        this.cer = c;
    }

    @Override
    public String toString() {
        return "Name :"+this.name +  "  Id :" + this.id +  "  certificate :" + this.cer; // it will print reference
        //return "Name :"+this.name +  "  Id :" + this.id +  "  certificate :" + this.cer.getCerti(); // it will print name by get method to access private object
        //return "Name :" + this.name + "  Id :" + this.id + "  certificate :" + this.cer.certi; // when name i public it will print name

    }
}
