package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class HelloAyush implements HelloServiceInterface {

    public String helloWorld(){
        return ("Hello Ayush!!!");
    }
}
