package pl.sda.javastart.day3;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Car {

    private String model;
    private String manufacturer;
    private String colour;
    private double basePrice;
    private double engineCapcity;
    private String hp;
    private LocalDateTime date;
    private String[] options;
    private int doorsNumber;

    public final Person owner = new Person("Andrzej");

    public static int carsCounter;

    public static final int WHEELS_NUMBER = 4;


    public static String sound() {

        return "brumm";
    }

    public static String doYouRide() {
        return "YES";
    }


    static {
        System.out.println("Statyczny blok inicjalizujący");
        carsCounter = 49;
    }

    {
        System.out.println("Blok inicjalizujący");
        carsCounter = carsCounter + 1;
    }


    public Car() {

    }


    public Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }


    public String getMAnufacturerAndModel() {
        //return manufacturer + " " + model;
        //return manufacturer == null ? "" : manufacturer + " " + model == null ? "" : model;
        return StringUtils.defaultIfBlank(manufacturer, "") +
                StringUtils.defaultString(model, "");
    }

    //@Override
    // public String toString() {
    // return "Marka: " + StringUtils.defaultIfBlank(manufacturer, "") + " " +
    //        "Model: " + StringUtils.defaultIfBlank(model, "");


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", coloure='" + colour + '\'' +
                ", basePrice='" + basePrice + '\'' +
                ", engineCapcity='" + engineCapcity + '\'' +
                ", hp='" + hp + '\'' +
                ", date=" + date +
                ", options=" + Arrays.toString(options) +
                ", doorsNumber=" + doorsNumber +
                '}';
    }


    public void setModel(String model) {

        this.model = model;
    }


    public String getModel() {

        return model;
    }

    public String getManufacturer() {

        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColoure() {
        return colour;
    }

    public void setColoure(String coloure) {
        this.colour = coloure;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getEngineCapcity() {
        return engineCapcity;
    }

    public void setEngineCapcity(double engineCapcity) {
        this.engineCapcity = engineCapcity;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public Person getOwner() {
        return owner;
    }

}
