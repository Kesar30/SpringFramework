package com.Lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class interfacesLC implements InitializingBean , DisposableBean {
    private String name;
    private String type;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public interfacesLC() {
    }

    @Override
    public String toString() {
        return "interfacesLC{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
    //interface method
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Specifying product");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("closing product details");
    }
}
