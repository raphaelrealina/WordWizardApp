package com.example.realwordwizard;


public class Player {


    private String name;
    private int level; // current level the player is on
    private int xp; // 20 xp to level 2, 30 xp to level 3, etc...
    private Pet pet;


    public Player(String name, int level, int xp, Pet pet) {
        this.name = name;
        this.level = level;
        this.xp = xp;
        this.pet = pet;
    }

    public Player() {
        name = "";
        level = 1;
        xp = 0;
        pet = null;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getXP() {
        return xp;
    }

    public Pet getPet() {
        return pet;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public void setXP(int xp){
        this.xp = xp;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addXP(int x) {
        int possibleXP = xp + x;
        if ( possibleXP > 10) {
            possibleXP -= 10;
            xp = possibleXP;
        }

        else if (possibleXP == xp) {
            xp = 0;
        }

        else {
            xp = possibleXP;
        }
    }

    public void addLevel() {
        level ++;
    }

    @Override
    public String toString() {
        String stats = name + " STATS: " + "\n" +
                "LEVEL: " + level + "\n" +
                "XP: " + xp + "\n" +
                "PET: " + pet;

        return stats;
    }

}

