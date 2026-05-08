package Praktikum11;

import java.util.Scanner;

public class SLLMain18 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner (System.in);
        SingleLinkedList18 sll = new SingleLinkedList18();

        Mahasiswa18 mhs1 = new Mahasiswa18("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa18 mhs2 = new Mahasiswa18("23212201", "bimon", "2B", 3.8);
        Mahasiswa18 mhs3 = new Mahasiswa18("22212202", "Cintia", "3C", 3.5);
        Mahasiswa18 mhs4 = new Mahasiswa18("21212203", "Dirga", "4D", 3.6);

        sll.addLast(mhs4); // Index 0: Dirga
        sll.addLast(mhs3); // Index 1: Cintia
        sll.addLast(mhs2); // Index 2: Bimon
        sll.addLast(mhs1); // Index 3: Alvaro
       
        System.out.println("Data pada index 1 : ");
        sll.getData(1);

        System.out.println("Data mahasiswa an Ayu berada pada index : "
                + sll.indexOf("22212202"));

        System.out.println("Remove First");
        sll.removeFirst();
        sll.print();

        System.out.println("Remove Last");
        sll.removeLast();
        sll.print();

        System.out.println("Remove data Cintia");
        sll.remove("23212201");
        sll.print();

        System.out.println("Remove at index 0");
        sll.removeAt(0);
        sll.print();

        // System.out.print("Masukkan NIM : ");
        // String nim = sc.nextLine();

        // System.out.print("Masukkan Nama : ");
        // String nama = sc.nextLine();

        // System.out.print("Masukkan Kelas : ");
        // String kelas = sc.nextLine();

        // System.out.print("Masukkan IPK : ");
        // double ipk = sc.nextDouble();

        // Mahasiswa18 mhs = new Mahasiswa18(nim, nama, kelas, ipk);

        // sll.addFirst(mhs);

        // sll.print();
    }


    // sll.print();
    // sll.addFirst(mhs4);
    // sll.print();
    // sll.addLast(mhs1);
    // sll.print();
    // sll.insertAfter("Dirga", mhs3);
    // sll.insertAt(2, mhs2);
    // sll.print();
}
