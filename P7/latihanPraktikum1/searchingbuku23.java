package P7.latihanPraktikum1;

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

    // searching sequential
    public int findSeqSearch(String cari) {
        int posisi = -1;
        for (int i = 0; i < listBk23.length; i++) {
            if (listBk23[i].kodeBuku.equals(cari)) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    // tampilkan posisi key
    public void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " Ditemukan pada index : " + pos);
        } else {
            System.out.println("Data : " + x + " Tidak ditemukan ");
        }
    }

    // tampilkan data
    public void tampilData(String x, int pos) {
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
    public buku23 findBuku23(String cari) {
        buku23 result = new buku23(cari, "tidak ditemukan", 0, "tidak ditemukan", 0);
        for (int i = 0; i < listBk23.length; i++) {
            if (listBk23[i].kodeBuku.equals(cari)) {
                result = listBk23[i];
                break;
            }
        }
        return result;
    }

    // method binary search
    public int findBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari.equals(listBk23[mid].kodeBuku)) {
                return (mid);
            } else if (listBk23[mid].kodeBuku.compareTo(cari) > 0) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
