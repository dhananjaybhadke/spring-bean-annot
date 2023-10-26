package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfiguration.class);
        College col = context.getBean("collegeBean", College.class);
//        College col = context.getBean("collegeObject", College.class);
        col.testing();
        System.out.println("college object is created "+col);



    }
}