package com.eduardnow.di.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Figure {

    @Value("2.5")
    private double radius;

    @Override
    public Double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
