package com.example.commandlinerunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CommandLineRunnerLoggingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommandLineRunnerLoggingApplication.class, args);
    }

    @Bean
    public MyCommandLineRunner commandLineRunner() {
        return new MyCommandLineRunner();
    }
}
