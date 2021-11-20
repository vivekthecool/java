package com.example.helloworld;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        String s = "Anurag";
        String s1 = "vivek|kumar|anurag|sharma";

        String n = Arrays.asList(s1.split("\\|")).stream()
                .filter(name -> s.equalsIgnoreCase(name))
                .findAny()
                .orElse(null);
        System.out.println(n);
    }
}
