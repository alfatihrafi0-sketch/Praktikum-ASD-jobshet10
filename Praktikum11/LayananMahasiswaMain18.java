package Praktikum11;
    import java.util.Scanner;
    
    public class LayananMahasiswaMain18 {
    
        public static void menu() {
    
            System.out.println("\n===== MENU ANTRIAN =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Belakang");
            System.out.println("6. Jumlah Mahasiswa Mengantre");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
        }
    
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
    
            LayananMahasiswa18 antrian = new LayananMahasiswa18();
    
            int pilih;
    
            do {
    
                menu();
                pilih = sc.nextInt();
                sc.nextLine();
    
                switch (pilih) {
    
                    case 1:
    
                        System.out.print("Masukkan NIM   : ");
                        String nim = sc.nextLine();
    
                        System.out.print("Masukkan Nama  : ");
                        String nama = sc.nextLine();
    
                        System.out.print("Masukkan Prodi : ");
                        String prodi = sc.nextLine();
    
                        System.out.print("Masukkan Kelas : ");
                        String kelas = sc.nextLine();
    
                        Mahasiswa18 mhs = new Mahasiswa18(nim, nama, prodi, kelas);
    
                        antrian.tambahAntrian(mhs);
    
                        break;
    
                    case 2:
                        antrian.panggilAntrian();
                        break;
    
                    case 3:
                        antrian.tampilSemua();
                        break;
    
                    case 4:
                        antrian.tampilDepan();
                        break;
    
                    case 5:
                        antrian.tampilBelakang();
                        break;
    
                    case 6:
                        antrian.jumlahAntrian();
                        break;
    
                    case 7:
                        antrian.clear();
                        break;

                    case 0:
                        System.out.println("Program Selesai");
                        break;
                    default:
                        System.out.println("Menu Tidak Tersedia");
                }
    
            } while (pilih != 0);
    
            sc.close();
        }
    }
