package org.example.springcore2;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("auto")
@Scope("prototype")

@Data
@AllArgsConstructor
public class Auto {
    private int id;

    private Engine engine;
    private String model;
}
