package com.constructor;

public class certificate {
    public String certi;


    public certificate(String c){
        this.certi = c;
    }
//    public String getCerti() { // to print private name using get method
//        return certi;
//    }
@Override
public String toString() {//to print name directly by reference printing statement
    return certi;
}

}
