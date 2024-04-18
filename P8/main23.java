package P8;
import java.util.Scanner;
public class main23 {   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Gudang :");
        int kap = s.nextInt();
        gudang23 gudang = new gudang23(kap);

        boolean kondisi = true;
        while (kondisi) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Tampilkan Barang Teratas");
            System.out.println("5. Tampilkan Barang Terbawah");
            System.out.println("6. Cari Barang ");
            System.out.println("7. Exit");
            System.out.print("Pilih Operasi :");
            int pilihan = s.nextInt();
            s.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Barang :");
                    int kode = s.nextInt();
                    s.nextLine();
                    System.out.print("Masukkan Nama Barang :");
                    String nama = s.nextLine();
                    System.out.print("Masukkan Nama Kategori :");
                    String kategori = s.nextLine();
                    barang23 barangbaru = new barang23(kode, nama, kategori);
                    gudang.tambahBarang(barangbaru);
                    break;
                case 2:
                    gudang.ambilBarang23();
                    break;

                case 3:
                    gudang.tampilkanBarang();
                    break;

                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.print("Masukkan Nama Barang Yang Di cari :");
                    String namaa = s.nextLine();
                    gudang.cariBarang(namaa);
                    break;
                case 7:
                    System.out.println("Terimakasih telah menggunakan layanan kami");
                    kondisi=false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silahkan coba lagi");
            }
        }
    }
}
