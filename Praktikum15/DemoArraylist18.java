package Praktikum15;

import java.util.ArrayList;

public class DemoArraylist18 {
     public static void main(String[] args) {
 
        // Langkah 2: instansiasi ArrayList dengan initial capacity 2 
        ArrayList<Customer18> customers = new ArrayList<>(2);
 
        Customer18 customer1 = new Customer18(1, "Zakia");
        Customer18 customer2 = new Customer18(5, "Budi");
 
        customers.add(customer1);
        customers.add(customer2);
 
        // Langkah 3: cetak dengan foreach 
        System.out.println("=== Langkah 3: Data awal ===");
        for (Customer18 cust : customers) {
            System.out.println(cust.toString());
        }
 
        // Langkah 4 & 5: tambah object melebihi kapasitas awal (2) 
        customers.add(new Customer18(4, "Cica"));
 
        System.out.println("\n=== Langkah 5: Setelah add Customer18 ke-3 (Cica) ===");
        for (Customer18 cust : customers) {
            System.out.println(cust.toString());
        }
 
        // Langkah 6 & 7: tambah pada index tertentu 
        customers.add(2, new Customer18(100, "Rosa"));
 
        System.out.println("\n=== Langkah 7: Setelah add Rosa di index 2 ===");
        for (Customer18 cust : customers) {
            System.out.println(cust.toString());
        }
 
        // Langkah 8: indexOf() 
        System.out.println("\n=== Langkah 8: indexOf(customer2) ===");
        System.out.println("Posisi customer2 (Budi): " + customers.indexOf(customer2));
 
        // Langkah 9: get() 
        System.out.println("\n=== Langkah 9: get(1) lalu ubah nama ===");
        Customer18 customer = customers.get(1);
        System.out.println("Sebelum diubah: " + customer.name);
        customer.name = "Budi Utomo";
        System.out.println("Setelah diubah:");
        for (Customer18 cust : customers) {
            System.out.println(cust.toString());
        }
 
        // Langkah 10: instansiasi tanpa size 
        System.out.println("\n=== Langkah 10: ArrayList tanpa initial size ===");
        ArrayList<Customer18> customers2 = new ArrayList<>();
        customers2.add(new Customer18(10, "Andi"));
        customers2.add(new Customer18(11, "Siti"));
        System.out.println(customers2);
 
        // Langkah 11: addAll() 
        System.out.println("\n=== Langkah 11: addAll(newCustomers) ===");
        ArrayList<Customer18> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer18(201, "Della"));
        newCustomers.add(new Customer18(202, "Victor"));
        newCustomers.add(new Customer18(203, "Sarah"));
 
        customers.addAll(newCustomers);
        for (Customer18 cust : customers) {
            System.out.println(cust.toString());
        }
 
        // Langkah 12: println langsung 
        System.out.println("customers");
        System.out.println(customers);
    }
}

