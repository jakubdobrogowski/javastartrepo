package pl.sda.javastart.Homework.OdPochcia;

public class Book {

    private String name;
    private double price;
    private Autor[] authorList;
    private int publicationDate;

    public Book(String name, double price, Autor[] authorList, int publicationDate) {
        this.name = name;
        this.price = price;
        this.authorList = authorList;
        this.publicationDate = publicationDate;
    }
        public void setAuthorList (Autor[]authorList){
            this.authorList = authorList;
        }

        public Autor[] getAuthorList () {
            return authorList;
        }
    }
