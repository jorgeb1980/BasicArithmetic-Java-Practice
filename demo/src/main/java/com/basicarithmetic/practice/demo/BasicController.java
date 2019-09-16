package com.basicarithmetic.practice.demo;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BasicController {

    @Autowired
    public BasicService basicService;

    @GetMapping(value="/add")
    public int add(int a, int b){
        return basicService.add(a,b);
    }

    @GetMapping(value="/subtract")
    public int subtract(int minuend, int subtrahend){
        return basicService.subtract(minuend, subtrahend);
    }

    @GetMapping(value="/product")
    public int product(int a, int b){
        return basicService.product(a, b);
    }

    @GetMapping(value="/division")
    public HashMap<String, Integer> division(int dividend, int divisor){
        return basicService.division(dividend, divisor);
    }

}