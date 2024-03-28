package P6.bubbleSort;

public class mainBuku23 {
    public static void main(String[] args) {

        daftarBuku23 listBuku23 = new daftarBuku23();

        buku23 m = new buku23(20215, "Algoritma", 2019, "Wahyuni", 5);
        buku23 m1 = new buku23(20214, "Big Data", 2020, "Susilo", 3);
        buku23 m2 = new buku23(20213, "Desain UI", 2021, "Supriadi", 6);
        buku23 m3 = new buku23(20212, "Web Programming", 2022, "Pustaka Adi", 2);
        buku23 m4 = new buku23(20211, "Etika Mahasiswa", 2023, "Darmawan Adi", 1);
        listBuku23.tambah(m);
        listBuku23.tambah(m1);
        listBuku23.tambah(m2);
        listBuku23.tambah(m3);
        listBuku23.tambah(m4);

        System.out.println("====================================");
        System.out.println("Data Sebelum Diurutkan ");
        listBuku23.tampil();

        System.out.println("====================================");
        System.out.println("Data Sesudah Diurutkan Secara Ascending (Bubble Sort)");
        listBuku23.bubbleSort();
        listBuku23.tampil();

        System.out.println("====================================");
        System.out.println("Data Sesudah Diurutkan Secara Descending (Selection Sort)");
        listBuku23.selectionSort();
        listBuku23.tampil();
    }

}
