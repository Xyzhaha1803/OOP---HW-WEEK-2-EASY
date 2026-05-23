/*Class Initialization through Constructor. Create a class Book with attributes title and author.
Initialize them using a constructor, and print the details using a method showBook(). */

class Book{
    String title;
    String author;

    Book(String t, String a){
        this.title = t;
        this.author = a;
    }

    public void showBook(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Q7{
    public static void main(String[] args){
        Book book = new Book("Hunger Games", "Dylan Patel");

        book.showBook();
    }
}