package P7.latihanPraktikum2;

import java.util.Scanner;

public class bukuMain23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        searchingbuku23 data = new searchingbuku23();
        buku23 m = new buku23("111", "Algoritma", 2019, "Wahyuni", 5);
        buku23 m1 = new buku23("123", "algoritma", 2020, "Susilo", 3);
        buku23 m2 = new buku23("125", "Desain UI", 2021, "Supriadi", 6);
        buku23 m3 = new buku23("126", "Web Programming", 2022, "Pustaka Adi", 2);
        buku23 m4 = new buku23("127", "Etika Mahasiswa", 2023, "Darmawan Adi", 1);
        data.tambah(m);
        data.tambah(m1);
        data.tambah(m2);
        data.tambah(m3);
        data.tambah(m4);

        System.out.println("=======================================================================");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        // pencarian
        System.out.println("=======================================================================");
        System.out.println("=======================================================================");
        System.out.println("Pencarian Data Berdasarkan Judul Buku");
        System.out.println("Masukkan Judul Buku Yang Dicari");
        System.out.print("Judul Buku : ");
        String cariJudul = s.nextLine();
        System.out.println("=======================================================================");
        System.out.println("=======================================================================");

        System.out.println("Menggunakan Sequential Search");
        int posisi = data.findSeqSearchJudul(cariJudul);
        data.tampilPosisiJudul(cariJudul, posisi);
        System.out.println("=======================================================================");

        // menampilkan data yang ada
        data.tampilDataJudul(cariJudul, posisi);

        // menggunakan tipe object
        System.out.println("=======================================================================");
        buku23 dataBuku = data.findBukuJudul(cariJudul);
        dataBuku.tampilDataBuku();

        System.out.println("=======================================================================");
        System.out.println("Menggunakan Binary Search : ");
        posisi = data.findBinarySearchJudul(cariJudul, 0, data.idx - 1);
        data.tampilPosisiJudul(cariJudul, posisi);
        data.tampilDataJudul(cariJudul, posisi);
    }
}
