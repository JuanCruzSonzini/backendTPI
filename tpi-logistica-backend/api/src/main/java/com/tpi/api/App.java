package com.tpi.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.tpi.service.LogisticaService;

@SpringBootApplication(scanBasePackages = "com.tpi")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner run(ApplicationContext ctx) {
        return args -> {
            LogisticaService svc = ctx.getBean(LogisticaService.class);
            System.out.println(svc.info());
        };
    }
}
