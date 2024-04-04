package P7;

import java.util.Scanner;

public class bukuMain23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        searchingbuku23 data = new searchingbuku23();
        int jumBuku = 5;

        System.out.println("=======================================================================");
        System.out.println("Masukkan data buku secara urut dari kodeBuku terkecil ke terbesar : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("=====================================");
            System.out.print("Kode Buku : ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock : ");
            int stock = s.nextInt();
            System.out.println("=====================================");

            buku23 m = new buku23(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("=======================================================================");
        System.out.println("Data Keseluruhan Mahasiswa : ");
        data.tampil();

        // pencarian
        System.out.println("=======================================================================");
        System.out.println("Pencarian Data  ");
        System.out.println("Masukkan Kode Buku Yang dicari  ");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
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
    }

}
