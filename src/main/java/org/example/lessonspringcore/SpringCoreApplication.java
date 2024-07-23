package org.example.lessonspringcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCoreApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Student student1 = context.getBean("student", Student.class);
        Student student2 = context.getBean("student", Student.class);
        Student student3 = context.getBean("student", Student.class);
        Student student4 = context.getBean("student", Student.class);
        Student student5 = context.getBean("student", Student.class);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);

        School school = context.getBean("school", School.class);
        System.out.println(school);

    }
}
