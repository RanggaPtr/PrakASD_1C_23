package P1;

import java.util.Scanner;

public class nilaiAkhirMahasiswa23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas (0-100) : ");
        int nilaiTugas = scanner.nextInt();
        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.print("Masukkan nilai kuis (0-100) : ");
        int nilaiKuis = scanner.nextInt();
        if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.print("Masukkan nilai UTS (0-100) : ");
        int nilaiUTS = scanner.nextInt();
        if (nilaiUTS < 0 || nilaiUTS > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.print("Masukkan nilai UAS (0-100) : ");
        int nilaiUAS = scanner.nextInt();
        if (nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }
        System.out.println("============================================");
        double nilaiAkhir = 0.2 * nilaiTugas + 0.2 * nilaiKuis + 0.3 * nilaiUTS + 0.3 * nilaiUAS;
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        String nilaiHuruf;
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        System.out.println("Nilai Huruf: " + nilaiHuruf);

        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+")) {
            System.out.println("LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }
        System.out.println("============================================");
    }
}
