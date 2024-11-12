package com.Eternity.code;

public class Programmer {

    private int age;
    Computer com;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code()
    {
        System.out.println("Coding");
        com.compile();
    }
}
