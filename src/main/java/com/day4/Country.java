package com.day4;

/**
 * Created by vsanghav on 8/25/2016.
 */
public class Country {

    private String name;
    private int medals;
    private int gold;
    private int silver;
    private int bronze;

    public Country(String name, int medals, int gold, int silver, int bronze) {
        this.name = name;
        this.medals = medals;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }


    public String getName() {
        return name;
    }

    public void setName(String country) {
        this.name = country;
    }

    public int getMedals() {
        return medals;
    }

    public void setMedals(int medals) {
        this.medals = medals;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }

    public int getBronze() {
        return bronze;
    }

    public void setBronze(int bronze) {
        this.bronze = bronze;
    }
}
