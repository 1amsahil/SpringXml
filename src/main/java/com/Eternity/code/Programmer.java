package com.Eternity.code;

public class Programmer {

    public Programmer()
    {
        System.out.println("Object Created ");
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter Called");
        this.age = age;
    }

    public void code()
    {
        System.out.println("Coding");
    }
}
