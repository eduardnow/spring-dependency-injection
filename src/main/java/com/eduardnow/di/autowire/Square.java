package com.eduardnow.di.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Square implements Figure {

    @Value("2.5")
    private double side;

    @Override
    public Double calculateArea() {
        return side * side;
    }
}
