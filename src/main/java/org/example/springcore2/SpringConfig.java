package org.example.springcore2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.springcore2")
public class SpringConfig {

    @Bean
    public Engine getEngine() {
        Engine engine = new Engine();
        engine.setId(1);
        engine.setPower(100);
        return engine;
    }

    @Bean
    public Engine getEngine2() {
        Engine engine = new Engine();
        engine.setId(2);
        engine.setPower(200);
        return engine;
    }

    @Bean
    public Auto getAuto() {
        return new Auto(1, getEngine(), "БМВ");

    }

    @Bean
    public Auto getAuto2() {
        return new Auto(2, getEngine(), "ПОРШ");
    }

    @Bean
    public Auto getAuto3() {
        return new Auto(3, getEngine2(), "Феррари");
    }

}



