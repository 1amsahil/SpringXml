package com.Eternity.code;

public class Laptop implements Computer {

    public Laptop()
    {
        System.out.println("Laptop Constructor Created");
    }

    @Override
    public void compile()
    {
        System.out.println("Compiling using Laptop");
    }
}
