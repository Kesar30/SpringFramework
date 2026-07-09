package com.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    // on property
    @Autowired
    @Qualifier("address") //name of the bean
    private Address address;

    public Address getAddress() {
        return address;
    }
    //on setter method
//    @Autowired
    public void setAddress(Address address) {
        System.out.println("setting address");
        this.address = address;
    }

    public Emp() {
    }
    //on constructor
//    @Autowired
    public Emp(Address address) {
        System.out.println("inside constructor");//byconstructor autowiring
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
