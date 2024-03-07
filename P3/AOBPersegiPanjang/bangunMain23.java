package P3.AOBPersegiPanjang;

import P3.segitiga23.segitiga23;

public class bangunMain23 {
    public static void main(String[] args) {
        segitiga23 sg1 = new segitiga23(5, 10);
        segitiga23 sg2 = new segitiga23(10, 15);
        segitiga23 sg3 = new segitiga23(15, 20);

        PersegiPanjang23 pp1 = new PersegiPanjang23(5, 10);
        PersegiPanjang23 pp2 = new PersegiPanjang23(2, 8);
        PersegiPanjang23 pp3 = new PersegiPanjang23(10, 15);

        segitiga23[] s = new segitiga23[3];
        PersegiPanjang23[] p = new PersegiPanjang23[3];

        s[0] = sg1;
        s[1] = sg2;
        s[2] = sg3;
        p[0] = pp1;
        p[1] = pp2;
        p[2] = pp3;

        bangunDatar23 bd = new bangunDatar23();
        bd.tambahsgt(s);
        bd.tambahPp(p);
        bd.tampilBangunDatar();
    }
}
