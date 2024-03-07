package P3.latihan1;

import java.util.Scanner;

import P3.AOBPersegiPanjang.PersegiPanjang23;
import P3.arrayBalok.Balok23;
import P3.segitiga23.main;

public class mainMahasiswa23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        Scanner car23 = new Scanner(System.in);

        double totalIpk = 0;
        double ipkTertinggi = 0;
        int indeksIpkTertinggi = 0;

        dataMahasiswa[] data = new dataMahasiswa[3];

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

            // untuk mendapatkan total kesuluruhan total ipk mahasiswa guna mencari rata rata ipk mahasiswa
            totalIpk += data[i].ipk;

            // untuk mencari indeks mahasiswa ipk terbesar
            if (data[i].ipk > ipkTertinggi) {
                ipkTertinggi = data[i].ipk;
                indeksIpkTertinggi = i;
            }
        }

        double rataIpk = totalIpk / data.length;
        
        System.out.println("====================TAMPILAN DATA MAHASISWA====================");

        for (int i = 0; i < data.length; i++) {
            System.out.println("Data Mahasiswa ke-" + i);
            System.out.println("Nama: " + data[i].nama);
            System.out.println("NIM: " + data[i].nim);
            System.out.println("Jenis Kelamin: " + data[i].jenisKelamin);
            System.out.println("IPK: " + data[i].ipk);
        }
        
        System.out.println("================================================================");
        System.out.println("Rata-Rata IPK: " + rataIpk);
        System.out.println("Mahasiswa dengan IPK tertinggi: ");
        System.out.println("Nama: " + data[indeksIpkTertinggi].nama);
        System.out.println("NIM: " + data[indeksIpkTertinggi].nim);
        System.out.println("Jenis Kelamin: " + data[indeksIpkTertinggi].nim);
        System.out.println("IPK: " + data[indeksIpkTertinggi].ipk);
        

    }

}
