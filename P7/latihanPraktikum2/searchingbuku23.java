package P7.latihanPraktikum2;

public class searchingbuku23 {
    buku23 listBk23[] = new buku23[5];
    public int idx;

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

    // searching sequential berdasarkan judul
    public int findSeqSearchJudul(String cari) {
        int posisi = -1;
        int count = 0;
        for (int i = 0; i < listBk23.length; i++) {
            if (listBk23[i].judulBuku.equalsIgnoreCase(cari)) {
                posisi = i;
                count++;
                if (count > 1) {
                    System.out.println("PERINGATAN!!! Ditemukan lebih dari satu judul buku yang sama");
                    break;
                }
            }
        }
        return posisi;
    }

    // tampilkan posisi key berdasarkan judul
    public void tampilPosisiJudul(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data dengan Judul '" + x + "' ditemukan pada index : " + pos);
        } else {
            System.out.println("Data dengan Judul '" + x + "' tidak ditemukan ");
        }
    }

    // tampilkan data berdasarkan judul
    public void tampilDataJudul(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku : " + listBk23[pos].kodeBuku);
            System.out.println("Judul : " + listBk23[pos].judulBuku);
            System.out.println("Tahun Terbit : " + listBk23[pos].tahunTerbit);
            System.out.println("Pengarang : " + listBk23[pos].pengarang);
            System.out.println("Stock : " + listBk23[pos].stock);
        } else {
            System.out.println("Data dengan Judul '" + x + "' tidak ditemukan ");
        }
    }

    // find buku berdasarkan judul
    public buku23 findBukuJudul(String cari) {
        buku23 result = new buku23("tidak ditemukan", "tidak ditemukan", 0, "tidak ditemukan", 0);
        for (int i = 0; i < listBk23.length; i++) {
            if (listBk23[i].judulBuku.equalsIgnoreCase(cari)) {
                result = listBk23[i];
                break;
            }
        }
        return result;
    }

    // method binary search berdasarkan judul
    public int findBinarySearchJudul(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari.equalsIgnoreCase(listBk23[mid].judulBuku)) {
                return (mid);
            } else if (listBk23[mid].judulBuku.compareToIgnoreCase(cari) > 0) {
                return findBinarySearchJudul(cari, left, mid - 1);
            } else {
                return findBinarySearchJudul(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
