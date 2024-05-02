package P10.praktikum2;

import java.util.*;

public class queueNasabah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Masukkan kapasitas queue:");
        int n = sc.nextInt();

        queue antri = new queue(n);
        int pilih;
        do {
            queue.menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No rekening:");
                    String norek = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Nama:");
                    String nama = sc.nextLine();
                    System.out.print("Alamat:");
                    String alamat = sc.nextLine();
                    System.out.print("Umur:");
                    int umur = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Saldo:");
                    double saldo = sc.nextDouble();
                    nasabah nb = new nasabah(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.enqueue(nb);
                    break;
                case 2:
                    nasabah data = antri.dequeue();
                    if (!"".equals (data.noRek) && !"".equals (data.nama) && !"".equals (data.alamat) && data.umur != 0 && data. saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data.noRek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    antri.print();
                    break;
                case 4:
                    antri.peek();
                    break;
                case 5:
                    antri.clear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
