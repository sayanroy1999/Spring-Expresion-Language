package com.example.demo13;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Test {

    //Providing expression language
    @Value("#{22+11}")
    private int x;

    @Value("#{2+4}")
    private int y;

    //Passing static method through SpEL
    @Value("#{T(java.lang.Math).sqrt(25)}")
    private double z;

    @Override
    public String toString() {
        return "Test{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", e=" + e +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ////Passing static variable through SpEL
    @Value("#{T(java.lang.Math).E}")
    private double e;

    //Passing objects through SpEL
    @Value("#{ new java.lang.String('Tyson')}")
    private String name;

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Test() {
    }
}
