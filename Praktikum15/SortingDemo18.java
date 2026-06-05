package Praktikum15;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo18 {
    public static void main(String[] args) {
 
        // Sorting data String
        System.out.println("=== Sorting daftar siswa (String) ===");
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);
        System.out.println(daftarSiswa);
 
        // Sorting collection of objects berdasarkan name 
        System.out.println("\n=== Sorting customers berdasarkan name ===");
        ArrayList<Customer18> customers = new ArrayList<>();
        customers.add(new Customer18(5,   "Zakia"));
        customers.add(new Customer18(1,   "Budi"));
        customers.add(new Customer18(4,   "Cica"));
        customers.add(new Customer18(100, "Rosa"));
        customers.add(new Customer18(201, "Della"));
 
        System.out.println("Sebelum sort:");
        System.out.println(customers);
 
        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
 
        System.out.println("\nSetelah sort berdasarkan name:");
        System.out.println(customers);
    } 
}
