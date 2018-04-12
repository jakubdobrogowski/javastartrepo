package pl.sda.javastart.day3;

public abstract class Person {
    private String name;
    private String surName;
    private Integer age;


    public Person( String name, String surName, Integer age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        }


    public abstract double getIncome();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String lastName) {
        this.surName = lastName;
    }

    public Integer getAge() {  // czemu tu jest duży int?
        return age;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age
                + (isParenthesisNeeded() ? ")" : " ");
    }

    protected abstract boolean isParenthesisNeeded();
}
