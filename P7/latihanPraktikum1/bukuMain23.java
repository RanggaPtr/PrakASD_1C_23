package P7.latihanPraktikum1;

import java.util.Scanner;

public class bukuMain23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        searchingbuku23 data = new searchingbuku23();
        buku23 m = new buku23("111", "Algoritma", 2019, "Wahyuni", 5);
        buku23 m1 = new buku23("123", "Big Data", 2020, "Susilo", 3);
        buku23 m2 = new buku23("125", "Desain UI", 2021, "Supriadi", 6);
        buku23 m3 = new buku23("126", "Web Programming", 2022, "Pustaka Adi", 2);
        buku23 m4 = new buku23("127", "Etika Mahasiswa", 2023, "Darmawan Adi", 1);
        data.tambah(m);
        data.tambah(m1);
        data.tambah(m2);
        data.tambah(m3);
        data.tambah(m4);

        System.out.println("=======================================================================");
        System.out.println("Data Keseluruhan Mahasiswa : ");
        data.tampil();

        // pencarian
        System.out.println("=======================================================================");
        System.out.println("=======================================================================");
        System.out.println("Pencarian Data  ");
        System.out.println("Masukkan Kode Buku Yang dicari  ");
        System.out.print("Kode Buku : ");
        String cari = s.next();
        System.out.println("=======================================================================");
        System.out.println("=======================================================================");

        System.out.println("Menggunakan Sequential Search  ");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        System.out.println("=======================================================================");

        // menampilkan data yang ada
        data.tampilData(cari, posisi);

        // menggunakan tipe object

        System.out.println("=======================================================================");
        buku23 dataBuku23 = data.findBuku23(cari);
        dataBuku23.tampilDataBuku();

        System.out.println("=======================================================================");
        System.out.println("Menggunakan Binary Search : ");
        posisi = data.findBinarySearch(cari, 0, data.idx - 1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}
