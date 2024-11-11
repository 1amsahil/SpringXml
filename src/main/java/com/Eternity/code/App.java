package com.Eternity.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Programmer obj = (Programmer) context.getBean("programmer");
        obj.age = 23;
        System.out.println(obj.age);

        Programmer newObj = (Programmer) context.getBean("programmer");
        System.out.println(newObj.age);
    }
}
