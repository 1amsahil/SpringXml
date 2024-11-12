package com.Eternity.code;

public class Desktop implements Computer{

    public Desktop()
    {
        System.out.println("Desktop Constructor Created");
    }
    @Override
    public void compile()
    {
        System.out.println("Compiling using Desktop");
    }
}
