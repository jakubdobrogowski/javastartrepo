package pl.sda.javastart.day4;

import pl.sda.javastart.day3.Person;

public class OPP3 {

    public static void main(String[] args) {

       // Person tomasz = new Person("Tomasz");
        Person pensioner = new Pensioner("Adam", "Nowak", 78, 800);
        Person student = new Student("Maciek", "Nowak", 19, 123123, 100, 120);
        Person worker = new Worker("Jan", "Nowak", 23, 1000, "PhysicalWorker");

        Person[] people = new Person[]{pensioner, student, worker};

        //  ((Pensioner) pensioner).getPension(); //kastowanie?????? mozemy kastowac rzutowac w dol

        //   overrideStringExample(tomasz, (Pensioner) pensioner, student, worker);
        //  overrideIncomeExample((Pensioner) pensioner, student, worker);

        show(people);
    }

    private static void show(Person[] people) {

        for (Person person : people) {

            System.out.println(person.getClass().getSimpleName());
            System.out.println(person.getIncome());
            System.out.println(person);

            if (person instanceof Pensioner) {
                System.out.println(((Pensioner) person).getPension());
            } else if (person instanceof Student) {
                System.out.println(((Student) person).getIndex());
            } else if (person instanceof Worker) {
                System.out.println(((Worker) person).getPosition());
            }
        }
        //private static void overrideIncomeExample (Pensioner pensioner, Student student, Worker worker){
         //   System.out.println(pensioner.getIncome());
        //    System.out.println(student.getIncome());
        //    System.out.println(worker.getIncome());
        }

        private static void overrideStringExample (Person tomasz, Pensioner pensioner, Student student, Worker worker){
            System.out.println(tomasz);
            System.out.println(pensioner);
            System.out.println(student);
            System.out.println(worker);
        }
    }
