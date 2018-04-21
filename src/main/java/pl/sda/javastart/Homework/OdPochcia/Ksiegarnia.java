package pl.sda.javastart.Homework.OdPochcia;

public class Ksiegarnia {

   private String libraryName;
   private Employee [] employeeList;
   private String [] booksList;

   public Ksiegarnia(String libraryName, Employee[] employeeList, String[] booksList) {
      this.libraryName = libraryName;
      this.employeeList = employeeList;
      this.booksList = booksList;
   }
}
