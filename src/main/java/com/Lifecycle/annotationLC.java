package com.Lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class annotationLC {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public annotationLC() {
    }

    @Override
    public String toString() {
        return "annotationLC{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    @PostConstruct
    public void start(){
        System.out.println("starting....");
    }
    @PreDestroy
    public void end(){
        System.out.println("ending....");
    }
}
