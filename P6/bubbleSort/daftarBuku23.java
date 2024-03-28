package P6.bubbleSort;

public class daftarBuku23 {
    buku23 listBk23[] = new buku23[5];
    int idx;

    // method tambah
    void tambah(buku23 m) {
        if (idx < listBk23.length) {
            listBk23[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh !!!");
        }
    }

    // method tampil
    void tampil() {
        for (buku23 m : listBk23) {
            m.tampilDataBuku();
        }
    }

    // method bubble sort
    void bubbleSort() {
        for (int i = 0; i < listBk23.length - 1; i++) {
            for (int j = 0; j < listBk23.length - i - 1; j++) {
                if (listBk23[j].stock > listBk23[j + 1].stock) {
                    buku23 tempBuku23 = listBk23[j];
                    listBk23[j] = listBk23[j + 1];
                    listBk23[j + 1] = tempBuku23;

                }
            }
        }
    }

    // method selection sort
    void selectionSort() {
        for (int i = 0; i < listBk23.length - 1; i++) {
            int idMax = i;
            for (int j = i + 1; j < listBk23.length; j++) {
                if (listBk23[j].stock > listBk23[idMax].stock) {
                    idMax = j;
                }
            }

            // swap
            buku23 tempBuku23 = listBk23[idMax];
            listBk23[idMax] = listBk23[i];
            listBk23[i] = tempBuku23;
        }
    }

}
