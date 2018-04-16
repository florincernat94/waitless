package com.florincernat.waitless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.florincernat.controllers")
public class WaitlessApplication {

    public static void main(String args[]) {
        SpringApplication.run(WaitlessApplication.class, args);
    }
}
