package pl.sda.javastart.Homework.OdPochcia;

public class Order {

    public static void main(String[] args) {

        Autor potopAuthorFirst = new Autor("Henryk ", "Sienkiewicz");
        Autor potopAuthorSecond = new Autor("Salvador ", "Dali");
        Autor[] potopAuthor = new Autor[]{potopAuthorFirst, potopAuthorSecond};
        Book potop = new Book("Potop", 12.50, potopAuthor, 1974);
    }
}
