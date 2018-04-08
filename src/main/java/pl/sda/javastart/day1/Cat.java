package pl.sda.javastart.day1;

import java.time.LocalDateTime;

public class Cat {

    private String name;

    private double wight;

    private String ownerName;

    private LocalDateTime dateOfBrith;

    public void setName(String name ){

        this.name = name;
    }


    public String getName(){

        return name;
    }
}
