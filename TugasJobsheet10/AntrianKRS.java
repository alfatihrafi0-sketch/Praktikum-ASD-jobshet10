package TugasJobsheet10;

public class AntrianKRS {
     MahasiswaKRS[] data;   // array data antrian
    int front;
    int rear;
    int size;              // jumlah mahasiswa dalam antrian saat ini
    int max;               // kapasitas antrian (maks 10)
    int jumlahDiproses;    // jumlah mahasiswa yang sudah melakukan proses KRS
    int batasProsesDPA;    // batas jumlah mahasiswa yang ditangani DPA (30)
 
    // Konstruktor
    public AntrianKRS(int max, int batasProsesDPA) {
        this.max = max;
        this.batasProsesDPA = batasProsesDPA;
        this.data = new MahasiswaKRS[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.jumlahDiproses = 0;
    }
 
    // Cek antrian kosong
    public boolean isEmpty() {
        return size == 0;
    }
 
    // Cek antrian penuh
    public boolean isFull() {
        return size == max;
    }
 
    // Mengosongkan antrian
    public void kosongkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong.");
        } else {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        }
    }
 
    // Menambahkan antrian
    public void tambahAntrian(MahasiswaKRS mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambah mahasiswa.");
            return;
        }
        if (jumlahDiproses >= batasProsesDPA) {
            System.out.println("DPA sudah menangani " + batasProsesDPA + " mahasiswa. Sesi selesai.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian KRS.");
    }
 
    // Memanggil antrian untuk proses KRS - setiap 1x panggilan terdiri dari 2 mahasiswa
    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang diproses.");
            return;
        }
        System.out.println("=== Proses KRS ===");
        int diprosesSekali = 0;
        while (diprosesSekali < 2 && !isEmpty()) {
            if (jumlahDiproses >= batasProsesDPA) {
                System.out.println("Batas penanganan DPA (" + batasProsesDPA + " mahasiswa) telah tercapai.");
                break;
            }
            MahasiswaKRS mhs = data[front];
            front = (front + 1) % max;
            size--;
            jumlahDiproses++;
            diprosesSekali++;
            System.out.print("Mahasiswa #" + jumlahDiproses + " diproses: ");
            mhs.tampilkanData();
        }
        if (diprosesSekali == 0) {
            System.out.println("Tidak ada mahasiswa yang diproses.");
        }
    }
 
    // Menampilkan semua antrian
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Antrian KRS:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
 
    // Menampilkan 2 antrian terdepan
    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("2 Antrian Terdepan:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        int tampil = Math.min(2, size);
        for (int i = 0; i < tampil; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
 
    // Menampilkan antrian paling akhir
    public void tampilkanPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling akhir:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
 
    // Cetak jumlah antrian saat ini
    public int getJumlahAntrian() {
        return size;
    }
 
    // Cetak jumlah yang sudah melakukan proses KRS
    public int getJumlahDiproses() {
        return jumlahDiproses;
    }
 
    // Cetak jumlah mahasiswa yang belum melakukan proses KRS
    public int getJumlahBelumProses() {
        return size; // yang masih dalam antrian = belum diproses
    }
    
}
