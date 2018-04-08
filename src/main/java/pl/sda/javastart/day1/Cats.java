package pl.sda.javastart.day1;

public class Cats {

    public static void main(String[] args) {

        createcatsArrayWithIndeksAdding();

        createcatsArrayWithInicialization();

        //TABLICA
    }


    private static void createcatsArrayWithInicialization() {

        Cat firstcast = new Cat();
        Cat secondcat = new Cat();
        Cat thirdcat = new Cat();

        firstcast.setName("Mruczek");
        Cat[] cats = new Cat[]{firstcast, secondcat, thirdcat};

        for (Cat catty : cats) {        //ocb

            System.out.println(catty.getName());

        }

    }
        private static void createcatsArrayWithIndeksAdding() {
            Cat firstcast = new Cat();
            Cat secondcat = new Cat();
            Cat thirdcat = new Cat();

            firstcast.setName("Mruczek");


            Cat[] cats = new Cat[3];
            cats[0] = firstcast;
            cats[1] = secondcat;
            cats[2] = thirdcat;

            for (Cat catty : cats) {        //ocb

                System.out.println(catty.getName());
            }
        }
    }
