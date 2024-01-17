package com.example.savory;

import com.example.savory.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SavoryApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SavoryApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
    }
}
