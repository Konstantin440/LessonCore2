package org.example.springcore2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Auto auto = context.getBean("getAuto", Auto.class);


        Auto auto2 = context.getBean("getAuto2", Auto.class);


        Auto auto3 = context.getBean("getAuto3", Auto.class);


        System.out.println(auto);
        System.out.println(auto2);
        System.out.println(auto3);


    }
}
