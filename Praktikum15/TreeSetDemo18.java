package Praktikum15;

import java.util.TreeSet;

public class TreeSetDemo18 {
      public static void main(String[] args) {
 
        // Langkah 2: instansiasi TreeSet of String 
        TreeSet<String> fruits = new TreeSet<>();
 
        fruits.add("Mangga");
        fruits.add("Apel");
        fruits.add("Jeruk");
        fruits.add("Jambu");
 
        // Langkah 3: cetak dengan looping
        System.out.println("=== Langkah 3: Data dalam TreeSet (urutan otomatis) ===");
        for (String temp : fruits) {
            System.out.println(temp);
        }
 
        // Langkah 5 & 6: method-method TreeSet
        System.out.println("\n=== Langkah 5 & 6: Method TreeSet ===");
        System.out.println("First: " + fruits.first());
        System.out.println("Last: "  + fruits.last());
 
        fruits.remove("Jeruk");
        System.out.println("Setelah remove: " + fruits);
 
        fruits.pollFirst();
        System.out.println("Setelah pollFirst: " + fruits);
 
        fruits.pollLast();
        System.out.println("Setelah pollLast: " + fruits);
    }
}
