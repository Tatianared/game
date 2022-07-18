package ru.netology.domain;

public class Player implements Comparable<Player> {


    protected int id;
    protected String name;
    protected int strength;


    public int getId() {
        return id;
    }

    public Player(int id, String name, int strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public int compareTo(Player o) {
        if (this.strength < o.strength) {
            return 2;
        }
        if (this.strength > o.strength) {
            return 1;
        } else {

            return 0;
        }
    }
}
