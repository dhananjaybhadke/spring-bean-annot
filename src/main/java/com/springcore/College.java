package com.springcore;


//Component does the same work as <bean> in beans.xml
//we can create the object using @Component annotation no need to add configuration in beans.xml
// If we dont mentioned the name of the bean in the @Component annotation by default it takes the class name in small letters

public class College {

    private Principal principal;
    private Teacher teacher;

    // Constructor Injection
    /*public College(Principal principal) {
        this.principal = principal;
    }*/

    // Setter Injection
    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void testing(){
        principal.principalInfo();
        teacher.teaching();
        System.out.println("Testing @Bean annotation");
    }


}
