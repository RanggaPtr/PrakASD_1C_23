package P10.tugas;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan kapasitas queue:");
        int n = sc.nextInt();

        queue daftar = new queue(n);
        int pilih;
        do {
            queue.menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama:");
                    sc.nextLine(); // membersihkan newline
                    String nama = sc.nextLine();
                    System.out.print("Nomor Hp:");
                    String noHp = sc.nextLine();
                    pembeli pb = new pembeli(nama, noHp);
                    daftar.enqueue(pb);
                    break;
                case 2:
                    pembeli data = daftar.dequeue();
                    if (data != null) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHp);
                    }
                    break;
                case 3:
                    daftar.print();
                    break;
                case 4:
                    daftar.peek();
                    break;
                case 5:
                    daftar.clear();
                    break;
                case 6:
                    daftar.peekRear();
                    break;
                case 7:
                    daftar.daftarPembeli();
                    break;
                case 8:
                    System.out.println("Masukkan Nama Pelanggan Yang ingin dicari :");
                    sc.nextLine(); // membersihkan newline
                    String cari = sc.nextLine();
                    daftar.peekPosition(cari);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
