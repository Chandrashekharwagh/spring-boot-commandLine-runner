package com.example.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Running CommandLineRunner logic...");
        // You can add your logic here
        System.out.println("Number of arguments: " + args.length);
        for (String arg : args) {
            System.out.println("Arg: " + arg);
        }
    }
}
