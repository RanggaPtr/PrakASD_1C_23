package P12.tugas_no1;

import java.lang.reflect.Method;
import java.util.Scanner;

public class main {
     public static void main(String[] args) throws Exception{
         method mt = new method();
        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Pasien");
            System.out.println("2. Hapus Data Pasien Paling Depan");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nomor antri: ");
                    int nomorAntri = scanner.nextInt();
                    System.out.print("Masukkan nama: ");
                    String nama = scanner.next();
                    dataPasien dataPasien = new dataPasien(nomorAntri, nama);
                    mt.addLast(dataPasien);
                    break;
                case 2:
                    mt.removeFirst();
                    dataPasien first = mt.getFirst();
                    System.out.println(first.nama+" Telah divaksinasi");
                    break;
                case 3:
                    mt.print();
                    break;
                case 4:
                System.out.println("Keluar dari program.");
                System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (menu != 4);
    }
}
