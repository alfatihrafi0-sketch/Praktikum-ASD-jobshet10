package Praktikum11;

public class LayananMahasiswa18 {

    Node18 front;
    Node18 rear;
    int size;

    public LayananMahasiswa18() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false;
    }

    public void clear() {
        front = rear = null;
        size = 0;

        System.out.println("Antrian berhasil dikosongkan");
    }

    public void tambahAntrian(Mahasiswa18 mhs) {

        Node18 newNode = new Node18(mhs, null);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;

        System.out.println("Mahasiswa berhasil masuk antrian");
    }

    public void panggilAntrian() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {

            System.out.println("Mahasiswa dipanggil : ");
            front.data.tampilInformasi();

            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }

    public void tampilDepan() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {

            System.out.println("Antrian terdepan : ");
            front.data.tampilInformasi();
        }
    }

    public void tampilBelakang() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {

            System.out.println("Antrian paling belakang : ");
            rear.data.tampilInformasi();
        }
    }

    public void tampilSemua() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {

            Node18 temp = front;

            System.out.println("Daftar Antrian : ");

            while (temp != null) {

                temp.data.tampilInformasi();
                System.out.println("----------------------");

                temp = temp.next;
            }
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang mengantre : " + size);
    }
}
