package Praktikum11;

public class Mahasiswa18 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa18() {

    }

    public Mahasiswa18(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.printf("%-10s %-15s %-5s %-5s\n",nama,nim,kelas,ipk);
    }
}

