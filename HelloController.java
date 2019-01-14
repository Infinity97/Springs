package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController // It became a bean because of this code
// They are by default a singleton object and acts as a beans due to the certain asoects of the game.
public class HelloController {

    private int foo ;
    @PostConstruct
    public void init(){
        this.foo = 1 ;
    }

    @Autowired
    @Qualifier("helloService")
    HelloServiceInterface helloService1;

    @Autowired
    @Qualifier("helloAyush")
    HelloServiceInterface helloService2;

    @RequestMapping("/hello")
    public String sayHello()
    {
        return "Hello World";
    }

    @RequestMapping("/hellonew")
    public void callingMethod(){
        sayHelloService();
        printanother();
    }
    public  String sayHelloService()
    {
        System.out.println("this is the new variable " + foo);
        return helloService1.helloWorld();

    }
    //@RequestMapping("/hellonew")
    public int printanother()
    {
        return this.foo;
    }
    @RequestMapping("/hello1")
    public  String sayHelloAyush()
    {
        return helloService2.helloWorld();
    }

}

// This class is nothing but a bean
// Thus the sring creates a bean and understand how it works.
//