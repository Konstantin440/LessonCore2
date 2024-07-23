package org.example.springcore2;


import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("engine")
@Scope("prototype")

@Data
public class Engine {
    private int id;
    private int power;
}
