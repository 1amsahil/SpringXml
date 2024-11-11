package com.Eternity.code;

public class Programmer {

    public Programmer()
    {
        System.out.println("Object Created ");
    }

    private Laptop lap;

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code()
    {
        System.out.println("Coding");
        lap.Compile();
    }
}
