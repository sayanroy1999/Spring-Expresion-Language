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

    @Override
    public String toString() {
        return "Test{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Test() {
    }
}
