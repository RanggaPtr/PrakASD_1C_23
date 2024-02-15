package P1;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiSetara, totalNilai = 0, ipSMT = 0;
        int sksTotal = 0;
        String nilaiHuruf;
        String[] matkuls = new String[9];
        double[] bobotSKS = new double[9];
        double[] nilaiAngka = new double[9];

        matkuls[0] = "Matematika";
        matkuls[1] = "Fisika";
        matkuls[2] = "Kimia";
        matkuls[3] = "Biologi";
        matkuls[4] = "Bahasa Inggris";
        matkuls[5] = "Bahasa Indonesia";
        matkuls[6] = "Pendidikan Agama";
        matkuls[7] = "Pendidikan Kewarganegaraan";
        matkuls[8] = "Pendidikan Jasmani";

        for (int i = 0; i < 9; i++) {
            System.out.print("Bobot SKS untuk " + matkuls[i] + " : ");
            double bobot = sc.nextDouble();
            bobotSKS[i] = bobot;
            sksTotal += bobot;

            System.out.print("Nilai Angka untuk " + matkuls[i] + " : ");
            double nilai = sc.nextDouble();
            nilaiAngka[i] = nilai;

            sc.nextLine();
        }

        System.out.println("===============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");

        System.out.println("Mata Kuliah\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        for (int i = 0; i < 9; i++) {
            if (nilaiAngka[i] >= 81) {
                nilaiHuruf = "A";
                nilaiSetara = 4;
            } else if (nilaiAngka[i] >= 74) {
                nilaiHuruf = "B+";
                nilaiSetara = 3.5;
            } else if (nilaiAngka[i] >= 66) {
                nilaiHuruf = "B";
                nilaiSetara = 3;
            } else if (nilaiAngka[i] >= 61) {
                nilaiHuruf = "C+";
                nilaiSetara = 2.5;
            } else if (nilaiAngka[i] >= 51) {
                nilaiHuruf = "C";
                nilaiSetara = 2;
            } else if (nilaiAngka[i] >= 40) {
                nilaiHuruf = "D";
                nilaiSetara = 1;
            } else {
                nilaiHuruf = "E";
                nilaiSetara = 0;
            }

            System.out.printf("%-15s\t%.2f\t\t%s\t\t%.2f\n", matkuls[i], nilaiAngka[i], nilaiHuruf,
                    bobotSKS[i] * nilaiSetara);

            totalNilai += bobotSKS[i] * nilaiSetara;
        }

        ipSMT = totalNilai / sksTotal;

        System.out.println("======================");
        System.out.printf("IP : %.2f%n", ipSMT);
    }
}
