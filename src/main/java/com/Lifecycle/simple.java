package com.Lifecycle;

public class simple {
    private String product;
    private int price;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public simple() {
    }

    @Override
    public String toString() {
        return "simple{" +
                "product='" + product + '\'' +
                ", price=" + price +
                '}';
    }
    public void init(){
        System.out.println("init method intialized : product details");
    }
    public void destroy(){
        System.out.println("destroy method called : product wrapped");
    }
}
