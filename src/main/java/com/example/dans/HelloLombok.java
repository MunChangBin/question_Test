package com.example.dans;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

@Getter
public class HelloLombok {
    private final String hello;
    private final int lombok;

    public HelloLombok(String hello, int lombok){
        this.hello = hello;
        this.lombok = lombok;
    }

    public static void main(String[] args){
        HelloLombok helloLombok = new HelloLombok("헬로",5);


        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}
