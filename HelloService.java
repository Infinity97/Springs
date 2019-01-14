package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service // Creates a Java Bean to be injected wherever needed
public class HelloService implements HelloServiceInterface{

    @Primary
    public String helloWorld(){
        return ("Hello World is bomb");
    }
}
