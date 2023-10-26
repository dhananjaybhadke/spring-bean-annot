package com.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfiguration {

    // by default the bean name is the method name and that we pass in the application context
    // @Bean("collegeObject")

    @Bean
    public Teacher mathTeacherBean(){
        return new MathTeacher();
    }

    /* @Bean
    public Teacher scienceTeacherBean(){
        return new ScienceTeacher();
    } */

    @Bean
    public Principal principalBean(){
        Principal prince = new Principal();
        return prince;
    }

    @Bean
    public College collegeBean(){
        // Constructor Dependency Injection
        // College college = new College(principalBean());

        // Setter Dependency Injection
        College college = new College();
        college.setPrincipal(principalBean());
        college.setTeacher(mathTeacherBean());
        return college;
    }

}
