package P3.AOBPersegiPanjang;

import java.util.Scanner;

public class ArrayObjects23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        PersegiPanjang23[] ppArray = new PersegiPanjang23[3];

        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang23();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc23.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc23.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
            ;
        }

        // ppArray[0] = new PersegiPanjang23();
        // ppArray[0].panjang = 110;
        // ppArray[0].lebar = 30;

        // ppArray[1] = new PersegiPanjang23();
        // ppArray[1].panjang = 80;
        // ppArray[1].lebar = 40;

        // ppArray[2] = new PersegiPanjang23();
        // ppArray[2].panjang = 100;
        // ppArray[2].lebar = 20;

        // System.out.println("Persegi Panjang ke-0, panjang " + ppArray[0].panjang + ",
        // lebar: " + ppArray[0].lebar);
        // System.out.println("Persegi Panjang ke-1, panjang " + ppArray[1].panjang + ",
        // lebar: " + ppArray[1].lebar);
        // System.out.println("Persegi Panjang ke-2, panjang " + ppArray[2].panjang + ",
        // lebar: " + ppArray[2].lebar);

    }
}
