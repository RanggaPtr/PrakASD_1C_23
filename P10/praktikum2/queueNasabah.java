package P10.praktikum2;

import java.util.*;

public class queueNasabah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
                    System.out.print("Nama:");
                    String nama = sc.nextLine();
                    System.out.print("Alamat:");
                    String alamat = sc.nextLine();
                    System.out.print("Umur:");
                    int umur = sc.nextInt();
                    System.out.print("Saldo:");
                    double saldo = sc.nextDouble();


                    break;
                case 2:
                    
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
