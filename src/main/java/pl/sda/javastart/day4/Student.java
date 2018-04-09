package pl.sda.javastart.day4;

import pl.sda.javastart.day3.Person;

public class Student extends Person implements WorkingPerson, FaltinfoHolder{

    private int index;
    private double scoolarship;
    private double fromMom;

    public Student(String name, String surName, int age, int index, double scoolarship, double fromMom) {
        super(name, surName, age);
        this.index = index;
        this.scoolarship = scoolarship;
        this.fromMom = fromMom;
    }

    @Override
    public String toString() {
        return super.toString() +
                "index=" + index +
                ", scoolarship=" + scoolarship +
                ", fromMom=" + fromMom +
                '}';
    }

    @Override
    public double getIncome() {
        return fromMom + scoolarship;


    }

    public int getIndex () {
        return index;
    }
}