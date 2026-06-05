package Praktikum15;

public class Book18 {
    public String isbn;
    public String title;
 
    public Book18() {
    }
 
    public Book18(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
 
    public String toString() {
        return "ISBN: " + this.isbn + " Title: " + this.title;
    }
}
