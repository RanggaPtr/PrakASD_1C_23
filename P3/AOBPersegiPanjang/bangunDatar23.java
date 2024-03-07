package P3.AOBPersegiPanjang;

import P3.segitiga23.segitiga23;

public class bangunDatar23 {
    segitiga23[] segitigas;
    PersegiPanjang23[] persegiPanjangs;

    void tambahsgt(segitiga23[] segitiga) {
        this.segitigas = segitiga;
    }

    void tambahPp(PersegiPanjang23[] persegiPanjang) {
        this.persegiPanjangs = persegiPanjang;
    }

    void tampilBangunDatar() {

        for (int i = 0; i < persegiPanjangs.length; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.println("Panjang: " + persegiPanjangs[i].panjang + " Lebar: " + persegiPanjangs[i].lebar);
        }

        System.out.println("=========================================================");
        for (int i = 0; i < persegiPanjangs.length; i++) {
            System.out.println("Segitiga ke-" + (i + 1));
            System.out.println("Alas: " + segitigas[i].alas + " Tinggi: " + segitigas[i].tinggi);
        }
    }

}
