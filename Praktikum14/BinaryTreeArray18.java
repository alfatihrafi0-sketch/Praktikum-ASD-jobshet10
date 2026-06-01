package Praktikum14;

public class BinaryTreeArray18 {
    Mahasiswa18[] dataMahasiswa;
    int idxLast;
 
    public BinaryTreeArray18() {
        this.dataMahasiswa = new Mahasiswa18[10];
           this.idxLast = -1;
    }
    
    void populateData(Mahasiswa18 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
    // tugas 4
     void add(Mahasiswa18 data) {
        int idx = 0;
        // jika tree masih kosong
        if (dataMahasiswa[0] == null) {
            dataMahasiswa[0] = data;
            idxLast = 0;
            return;
        }
        // cari posisi yang tepat berdasarkan IPK
        while (idx < dataMahasiswa.length) {
            if (dataMahasiswa[idx] == null) {
                dataMahasiswa[idx] = data;
                if (idx > idxLast) idxLast = idx;
                return;
            } else {
                if (data.ipk < dataMahasiswa[idx].ipk) {
                    idx = 2 * idx + 1; // ke kiri
                } else {
                    idx = 2 * idx + 2; // ke kanan
                }
            }
        }
        System.out.println("Array penuh, tidak bisa menambah data.");
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
 
