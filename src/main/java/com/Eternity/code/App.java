package com.Eternity.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

//        Programmer obj= (Programmer) context.getBean("programmer");
//        obj.code();

        Computer com = context.getBean(Computer.class);
        Desktop desk = context.getBean(Desktop.class);
    }
}
