package Praktikum11;

public class Mahasiswa18 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    Mahasiswa18() {

    }

    public Mahasiswa18(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilInformasi() {
        System.out.printf("%-10s %-15s %-5s %-5s\n",nim,nama,prodi,kelas);
    }
}

