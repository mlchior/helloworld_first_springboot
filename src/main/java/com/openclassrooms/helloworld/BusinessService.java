package com.openclassrooms.helloworld;

import com.openclassrooms.*;
import com.openclassrooms.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {
    public HelloWorld getHelloWorld(){
        HelloWorld helloWorld = new HelloWorld();
            return  helloWorld;
    }

}
