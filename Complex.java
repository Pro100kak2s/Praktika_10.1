package com.company;

public class Complex {
    public Complex(){
        System.out.println("1+2*i");
    }
    public Complex(int real,int image){
        System.out.println(Integer.toString(real)+"+"+Integer.toString(image)+"*i");
    }
}
