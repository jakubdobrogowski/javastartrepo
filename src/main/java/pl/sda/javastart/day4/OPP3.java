package pl.sda.javastart.day4;

import pl.sda.javastart.day3.Person;

public class OPP3 {

    public static void main(String[] args) {

        Person simplePerson = null;
        Person pensioner = new Pensioner("Adam", "Nowak", 78, 800);
        Person student = new Student("Maciek", "Nowak", 19, 123123, 100, 120);
        Person worker = new Worker("Jan", "Nowak", 23, 1000, "PhysicalWorker");
        Person[] people = new Person[]{pensioner, student, worker};

        //abstractClassesExample(people);

        //  ((Pensioner) pensioner).getPension(); //kastowanie?????? mozemy kastowac rzutowac w dol
        //  overrideStringExample(tomasz, (Pensioner) pensioner, student, worker);
        //  overrideIncomeExample((Pensioner) pensioner, student, worker);

        interfaceExample();
    }

    private static void interfaceExample() {

        Person studentAsPerson = new Student("MAciek", "Nowak", 19, 123123, 100, 120);
        FaltinfoHolder studentWithFlatInfo = new Student("Tomasz", "Nowak", 19, 123123, 100, 120);

        System.out.println(studentAsPerson.getIncome());
        System.out.println(studentWithFlatInfo.getFlatInfoWithPrefix());
    }

    private static void abstractClassesExample(Person[] people) {

        for (Person person : people) {
            if(person==null){
                continue;
            }
            System.out.println(person.getClass().getSimpleName());
            System.out.println(person);
            System.out.println(person.getIncome());

            if (person instanceof Pensioner) {
                System.out.println("Emerytura: " + ((Pensioner) person).getPension());
            } else if (person instanceof Worker) {
                System.out.println("Stanowisko " + ((Worker) person).getPosition());
            } else if (person instanceof Student) {
                System.out.println("Index nr: " + ((Student) person).getIndex());
            }
        }
    }

    private static void overrideIncomeExample(Person simplePerson, Pensioner pensioner, Student student, Worker worker) {
        System.out.println(student.getClass().getSimpleName() + " Income: " + student.getIncome());
        System.out.println(simplePerson.getClass().getSimpleName() + " Income: " + simplePerson.getIncome());
        System.out.println(worker.getClass().getSimpleName() + " Income: " + worker.getIncome());
        System.out.println(pensioner.getClass().getSimpleName() + " Income: " + pensioner.getIncome());
    }

    private static void overrideStringExample(Person simplePerson, Pensioner pensioner, Student student, Worker worker) {
        System.out.println(simplePerson);
        System.out.println(pensioner);
        System.out.println(student);
        System.out.println(worker);
    }
}
