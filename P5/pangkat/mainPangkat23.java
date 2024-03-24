package P5.pangkat;

import java.util.Scanner;

public class mainPangkat23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        System.out.println("====================================================================");
        System.out.print("Masukkan jumlah elemen yang dihitung : ");
        int elemen = sc23.nextInt();
        System.out.println("====================================================================");

        System.out.println();

        System.out.println("====================================================================");
        pangkat23[] png23 = new pangkat23[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan : ");
            int nilai = sc23.nextInt();
            System.out.print("Masukkan nilai pemangkat : ");
            int pangkat = sc23.nextInt();
            png23[i] = new pangkat23(nilai, pangkat);
        }
        System.out.println("====================================================================");

        System.out.println();

        System.out.println("====================================================================");
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println(
                    "Hasil dari " + png23[i].nilai + " Pangkat " + png23[i].pangkat + " Adalah : "
                            + png23[i].pangkatBF(png23[i].nilai, png23[i].pangkat));
        }
        System.out.println("====================================================================");

        System.out.println();

        System.out.println("====================================================================");
        System.out.println("HASIL PANGKAT - DIVIDE & CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println(
                    "Hasil dari " + png23[i].nilai + " Pangkat " + png23[i].pangkat + " Adalah : "
                            + png23[i].pangkatDC(png23[i].nilai, png23[i].pangkat));
        }
        System.out.println("====================================================================");

    }
}
