package Praktikum15;

import java.util.Stack;

public class StackDemo18 {
     public static void main(String[] args) {
 
        // Langkah 2 & 3: buat object Book18, push ke Stack 
        Book18 book1 = new Book18("1234", "Dasar Pemrograman");
        Book18 book2 = new Book18("7145", "Hafalah Shalat Delisa");
        Book18 book3 = new Book18("3562", "Muhammad Al-Fatih");
 
        Stack<Book18> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);
 
        // Langkah 4: peek() 
        System.out.println("=== Langkah 4: peek() ===");
        Book18 temp = books.peek();
        if (temp != null) {
            System.out.println("Peek: " + temp.toString());
        }
 
        // pop() 
        Book18 temp2 = books.pop();
        if (temp2 != null) {
            System.out.println("Pop:  " + temp2.toString());
        }
 
        // Langkah 6: looping cetak sisa stack 
        System.out.println("\n=== Langkah 6: Sisa buku dalam stack ===");
        for (Book18 book : books) {
            System.out.println(book.toString());
        }
 
        // Langkah 7: cetak langsung
        System.out.println("\n=== Langkah 7: println(books) ===");
        System.out.println(books);
 
        // Langkah 8: search()
        System.out.println("\n=== Langkah 8: search(book1) ===");
        books.push(book3);
        int posisi = books.search(book1);
        System.out.println("Posisi book1 (Dasar Pemrograman) dari puncak: " + posisi);
    }
}
