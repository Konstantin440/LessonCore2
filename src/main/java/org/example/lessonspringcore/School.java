package org.example.lessonspringcore;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("school")
@Data
public class School {
    private String name;
    private String address;

    public School(@Value("Школа имени Маши") String name, @Value("ул.дрездена, дом 15") String address) {
        this.name = name;
        this.address = address;
    }
}

