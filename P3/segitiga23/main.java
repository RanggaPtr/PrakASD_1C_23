package P3.segitiga23;

import P3.arrayBalok.Balok23;

public class main {
    public static void main(String[] args) {
        segitiga23[] sgArray23 = new segitiga23[4];

        sgArray23[0] = new segitiga23(10, 4);
        sgArray23[1] = new segitiga23(20, 10);
        sgArray23[2] = new segitiga23(15, 6);
        sgArray23[3] = new segitiga23(25, 10);

        System.out.println("segitiga ke-1 memliki luas: " + sgArray23[0].hitungluas() + " dan memilki keliling: "
                + sgArray23[0].hitungKeliling());
        System.out.println("segitiga ke-2 memliki luas: " + sgArray23[1].hitungluas() + " dan memilki keliling: "
                + sgArray23[1].hitungKeliling());
        System.out.println("segitiga ke-3 memliki luas: " + sgArray23[2].hitungluas() + " dan memilki keliling: "
                + sgArray23[2].hitungKeliling());
        System.out.println("segitiga ke-4 memliki luas: " + sgArray23[3].hitungluas() + " dan memilki keliling: "
                + sgArray23[3].hitungKeliling());

        System.out.println("========MEMAKAI LOOPING=========");

        for (int i = 0; i < sgArray23.length; i++) {
            System.out
                    .println("segitiga ke-" + i + "Memiliki Luas: " + sgArray23[i].hitungluas() + " dan memiliki keliling: "+sgArray23[i].hitungKeliling());
        }
    }
}
