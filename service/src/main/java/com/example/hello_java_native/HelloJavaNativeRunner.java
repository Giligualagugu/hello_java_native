package com.example.hello_java_native;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class HelloJavaNativeRunner {
    public static void main(String[] args) {
        SpringApplication.run(HelloJavaNativeRunner.class, args);
    }
}
