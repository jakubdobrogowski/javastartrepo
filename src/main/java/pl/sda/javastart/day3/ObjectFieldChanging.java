package pl.sda.javastart.day3;

public class ObjectFieldChanging {

    public static void main(String[] args) {

        //  simpleReferences();
        changingObjectInternalsByReferences();


        String text = "napis";

        //  text + "t"; // tak nie mozna bo String w java'ie jest niemutowany !!!
        //  text.substring(1,4); tez nic to nie zmienia

    }

    private static void changingObjectInternalsByReferences() {
        ExperimentalObject reference1 =
                new ExperimentalObject(123);
        ExperimentalObject reference2 = reference1;
        System.out.println(reference1.getAttribute());
        System.out.println(reference2.getAttribute());

        reference1.setAttribute(1);

        System.out.println(reference1.getAttribute());
        System.out.println(reference2.getAttribute());

        ExperimentalObject reference3 = new ExperimentalObject(123);
        ExperimentalObject reference4 = reference3;
        System.out.println(reference3.getAttribute());
        System.out.println(reference4.getAttribute());
        reference4 = new ExperimentalObject(3);
        System.out.println(reference3.getAttribute());
        System.out.println(reference4.getAttribute());
    }

    private static void simpleReferences() {
        Object referenceToObjectX = new Object();
        Object anotherReferenceWithTheSameObjectX= referenceToObjectX;
        Object referenceToObjectY = new Object();

        System.out.println(referenceToObjectX);
        System.out.println(anotherReferenceWithTheSameObjectX);
        System.out.println(referenceToObjectY);
    }


}
