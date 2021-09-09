package com.spring1.springproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
        samsung s7=factory.getBean(samsung.class);
        s7.config();
    }
}
//spring core annotations