package P5.sumArray;

import java.util.Scanner;

public class mainSum23 {

    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("program menghitung keuntungan total (Satuan juataan : 6.9)");
        System.out.print("Masukkan jumlah bulan :");
        int elm = sc23.nextInt();
        sum23 sm23 = new sum23(elm);
        System.out.println("===================================================");
        for (int i = 0; i < elm; i++) {
            System.out.print("Masukkan untung bulan ke - " + (i + 1) + " = ");
            sm23.keuntungan[i] = sc23.nextDouble();
        }

        System.out.println("===================================================");
        System.out.println("ALGORITMA - BRUTE FORCE");
        System.out.println("Total keuntungan selama " + sm23.elemen +
                " bulan adalah : " +
                sm23.totalBF(sm23.keuntungan));
        System.out.println("===================================================");
        System.out.println("ALGORITMA - DIVIDE & QONQUER");
        System.out.println(
                "Total keuntungan selama " +
                        sm23.elemen +
                        " bulan adalah : " +
                        sm23.totalDC(sm23.keuntungan, 0, sm23.elemen - 1));
        System.out.println("===================================================");
    }
}
