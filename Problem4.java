package Practice_4Pillars;
/*In a library management system, create a superclass 'Item' with attributes like 'title', 'author', and 'year'.
Create subclasses 'Book' and 'Magazine' with additional attributes like 'isbn' for Book and 'issueNumber' for Magazine.
Write a Java program to demonstrate this inheritance structure.
*/
class Item{
    String title;
    String author;
    int year;

    Item(String title, String author, int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }

    void Display(){
        System.out.println("Details: ");
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Year: "+year);
    }

}

class Book extends Item{
    String isbn;
    Book(String title, String author, int year, String isbn){
        super(title, author, year);
        this.isbn=isbn;
    }

    void Show(){
        super.Display();
        System.out.println("isbn: "+isbn);
        System.out.println();
    }
}

class Magazine extends Item{
    int issueNumber;
    Magazine(String title, String author, int year, int issueNumber){
        super(title, author, year);
        this.issueNumber=issueNumber;
    }

    void Show(){
        super.Display();
        System.out.println("IssueNumber: "+issueNumber);
        System.out.println();
    }
}


public class Problem4 {
    public static void main(String[] args) {
        Book bk1 = new Book("Java Programming", "A.N.Sharma", 2014, "LB23001");
        bk1.Show();

        Magazine mz1 = new Magazine("JalTarang", "P.D.Mhatre", 1999, 106);
        mz1.Show();
    }
}
