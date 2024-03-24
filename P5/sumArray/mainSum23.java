package P5.sumArray;

import java.util.Scanner;

public class mainSum23 {

    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("program menghitung keuntungan total (Satuan juataan : 6.9)");
        System.out.print("Masukkan Jumlah Perusahaan : ");
        int perusahaan = sc23.nextInt();
        System.out.print("Masukkan jumlah bulan :");
        int elm = sc23.nextInt();
        sum23 sm23 = new sum23(perusahaan, elm);
        System.out.println("===================================================");
        for (int i = 0; i < perusahaan; i++) {
            System.out.println("Perusahaan " + (i + 1));
            for (int j = 0; j < elm; j++) {
                System.out.print("Masukkan untung bulan ke - " + (j + 1) + " = ");
                sm23.keuntungan[i][j] = sc23.nextDouble();
            }
        }

        sm23.hitungTotalPerusahaan();
        System.out.println("===================================================");
        for (int i = 0; i < perusahaan; i++) {
            System.out.println("Total keuntungan perusahaan " + (i + 1) + " adalah : " + sm23.totalPerusahaan[i]);
        }
        System.out.println("===================================================");
        System.out.println("Total keuntungan semua perusahaan adalah : " + sm23.totalSemuaPerusahaan());
        System.out.println("===================================================");
        
        // System.out.println("===================================================");
        // System.out.println("ALGORITMA - BRUTE FORCE");
        // System.out.println("Total keuntungan selama " + sm23.elemen +
        // " bulan adalah : " +
        // sm23.totalBF(sm23.keuntungan));
        // System.out.println("===================================================");
        // System.out.println("ALGORITMA - DIVIDE & QONQUER");
        // System.out.println(
        // "Total keuntungan selama " +
        // sm23.elemen +
        // " bulan adalah : " +
        // sm23.totalDC(sm23.keuntungan, 0, sm23.elemen - 1));
        // System.out.println("===================================================");
    }
}
