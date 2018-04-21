package pl.sda.javastart.Homework.OdPochcia;

public class Autor {

    private String name;
    private String surName;

    public Autor(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Autor:"+ name + '\'' +
                surName + '\'';
    }
}
