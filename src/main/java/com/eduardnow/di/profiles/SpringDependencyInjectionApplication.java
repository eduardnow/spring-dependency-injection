package com.eduardnow.di.profiles;

import com.eduardnow.di.setters.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringDependencyInjectionApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

        // spring.profiles.active = dev
        EnvironmentService environmentService = context.getBean(EnvironmentService.class);
        log.info("Environment {}", environmentService.getEnvironment());

    }

}
