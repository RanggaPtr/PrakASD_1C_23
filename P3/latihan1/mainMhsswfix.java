package P3.latihan1;

import java.util.Scanner;

public class mainMhsswfix {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        Scanner car23 = new Scanner(System.in);

        dataMahasiswa[] data = new dataMahasiswa[3];
        inputDataMahasiswa(sc23, car23, data);

        System.out.println("====================TAMPILAN DATA MAHASISWA====================");
        tampilkanDataMahasiswa(data);

        System.out.println("================================================================");
        double rataIpk = hitungRataIpk(data);
        System.out.println("Rata-Rata IPK: " + rataIpk);

        int indeksIpkTertinggi = cariIndeksIpkTertinggi(data);
        System.out.println("Mahasiswa dengan IPK tertinggi: ");
        tampilkanDataMahasiswa(data[indeksIpkTertinggi]);
    }

    public static void inputDataMahasiswa(Scanner sc23, Scanner car23, dataMahasiswa[] data) {
        for (int i = 0; i < 3; i++) {
            data[i] = new dataMahasiswa();
            System.out.println("Mahasiswa ke-" + i);

            System.out.print("Masukkan nama: ");
            data[i].nama = sc23.nextLine();
            System.out.print("Masukkan NIM: ");
            data[i].nim = sc23.nextLine();
            System.out.print("Masukkan jenis kelamin P/L: ");
            data[i].jenisKelamin = car23.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            data[i].ipk = car23.nextDouble();
        }
    }

    public static void tampilkanDataMahasiswa(dataMahasiswa[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Data Mahasiswa ke-" + i);
            System.out.println("Nama: " + data[i].nama);
            System.out.println("NIM: " + data[i].nim);
            System.out.println("Jenis Kelamin: " + data[i].jenisKelamin);
            System.out.println("IPK: " + data[i].ipk);
        }
    }

    public static void tampilkanDataMahasiswa(dataMahasiswa data) {
        System.out.println("Nama: " + data.nama);
        System.out.println("NIM: " + data.nim);
        System.out.println("Jenis Kelamin: " + data.jenisKelamin);
        System.out.println("IPK: " + data.ipk);
    }

    public static double hitungRataIpk(dataMahasiswa[] data) {
        double totalIpk = 0;
        for (int i = 0; i < data.length; i++) {
            totalIpk += data[i].ipk;
        }
        return totalIpk / data.length;
    }

    public static int cariIndeksIpkTertinggi(dataMahasiswa[] data) {
        double ipkTertinggi = 0;
        int indeksIpkTertinggi = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i].ipk > ipkTertinggi) {
                ipkTertinggi = data[i].ipk;
                indeksIpkTertinggi = i;
            }
        }
        return indeksIpkTertinggi;
    }
}
