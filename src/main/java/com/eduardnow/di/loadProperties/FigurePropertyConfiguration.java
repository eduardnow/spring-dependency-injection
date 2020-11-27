package com.eduardnow.di.loadProperties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:areas.properties")
public class FigurePropertyConfiguration {

    public PropertySourcesPlaceholderConfigurer getPropertiesConfig() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
