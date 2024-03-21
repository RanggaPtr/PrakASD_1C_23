package P5.faktorial;

import java.util.Scanner;

public class MainFaktorial23 {
    public static void main(String[] args) {
        // input nilai n
        Scanner sc23 = new Scanner(System.in);
        System.out.println("==========================");
        System.out.print("Masukkan Jumlah Elemen:");
        int iJml = sc23.nextInt();

        // array of object
        faktorial23[] fk23 = new faktorial23[iJml];
        for (int i = 0; i < iJml; i++) {
            fk23[i] = new faktorial23();
            System.out.println("Massukkan nilai data ke-" + (i + 1) + ":");
            fk23[i].nilai= sc23.nextInt();
        }

        // tampilkan hasil pemanggilan method
        System.out.println("Hasil - Brute Force ");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan brute force  adalah "
                    + fk23[i].faktorialBF(fk23[i].nilai));
        }
        System.out.println("Hasil - Divide And Qonquer ");
        for (int i = 0; i < fk23.length; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan divide and qonquer  adalah "
                    + fk23[i].faktorialDC(fk23[i].nilai));

        }
    }
}
