package com.basicarithmetic.practice.demo;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class BasicService {

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int minuend, int subtrahend){
        return minuend - subtrahend;
    }

    public int product(int a, int b){
        return a * b;
    }

    public HashMap<String, Integer> division(int dividend, int divisor){
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        HashMap<String, Integer> response = new HashMap<>();
        response.put("quotient",quotient);
        response.put("remainder",remainder);
        return response;
    }

}