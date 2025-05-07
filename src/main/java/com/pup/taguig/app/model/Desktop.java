package com.pup.taguig.app.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Device {

    @Override
    public void compile() {
        System.out.println("Compiling using Desktop");
    }
}