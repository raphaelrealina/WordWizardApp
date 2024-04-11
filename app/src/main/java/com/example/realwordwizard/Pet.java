package com.example.realwordwizard;


public class Pet {

    private String name;
    private int multiplier;

    private int cost;

    public Pet()
    {
        name = "";
        multiplier = 1;
        cost = 0;
    }

    public Pet(String name, int multiplier, int c)
    {
        this.name = name;
        this.multiplier = multiplier;
        this.cost = c;
    }

    public String getName()
    {
        return name;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int x) {
        multiplier = x;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost(){
        return cost;
    }



}

