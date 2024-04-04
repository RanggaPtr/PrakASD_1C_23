package P7;

public class searchingbuku23 {
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

    // searching sequential
    public int findSeqSearch(int cari) {
        int posisi = -1;
        for (int i = 0; i < listBk23.length; i++) {
            if (listBk23[i].kodeBuku == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    // tampilkan posisi key
    public void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " Ditemukan pada index : " + pos);
        } else {
            System.out.println("Data : " + x + " Tidak ditemukan ");
        }
    }

    // tampilkan data
    public void tampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku : " + x);
            System.out.println("Judul : " + listBk23[pos].judulBuku);
            System.out.println("Tahun Terbit : " + listBk23[pos].tahunTerbit);
            System.out.println("Pengarang : " + listBk23[pos].pengarang);
            System.out.println("Stock : " + listBk23[pos].stock);
        } else {
            System.out.println("Data : " + x + " Tidak ditemukan ");
        }
    }

    // findbuku
    public buku23 findBuku23(int cari) {
        buku23 result = new buku23(cari, "tidak ditemukan", cari, "tidak ditemukan", cari);
        for (int i = 0; i < listBk23.length; i++) {
            if (listBk23[i].kodeBuku == cari) {
                result = listBk23[i];
                break;
            }
        }
        return result;
    }
}
