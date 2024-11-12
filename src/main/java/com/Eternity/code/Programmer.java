package com.Eternity.code;

public class Programmer {

    private int age;

    public Programmer(int age, Laptop lap)
    {
        System.out.println("Para Constructor Called");
        this.age = age;

        lap.Compile();
    }

    public int getAge() {
        return age;
    }
}
