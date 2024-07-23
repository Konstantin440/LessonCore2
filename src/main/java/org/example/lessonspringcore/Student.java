/*Задача
Имя новый проект LessonSpringCore


Получить 5 объектов этогл класса
Через создание бинов

Так же создать
Класс School
У него будет
Название  и адрес
Получить данный бин
Синглтон
Внедрить свойства через Value
*/


package org.example.lessonspringcore;

import lombok.Data;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student")
@Scope ("prototype")

public class Student {
    private int idGroup;
    private String name;
}


