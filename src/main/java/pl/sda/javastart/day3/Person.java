package pl.sda.javastart.day3;

public abstract class Person {

    private Integer id;
    private String name;
    private String surName;
    private Integer age;


    public Person(Integer id, String name, String surName, Integer age) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        }

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }


    public abstract double getIncome();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return surName;
    }

    public void setLastName(String lastName) {
        this.surName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "{name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
