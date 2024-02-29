public class bukuu23 {

    String judul, pengarang;
    int halaman, stok, harga;

    public bukuu23() {

    }

    public bukuu23(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        stok -= jml;
        if (stok < 0) {
            System.out.println("Stock yang tersedia kurang");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int jmlh) {
        return harga * jmlh;

    }

    double hitungDiskon(int jmlh) {
        if (hitungHargaTotal(jmlh) > 150000) {
            int hargaSebelum = hitungHargaTotal(jmlh);
            double diskon = hargaSebelum * 0.12;
            return diskon;
        } else if (hitungHargaTotal(jmlh) > 75000 && hitungHargaTotal(jmlh) < 150000) {
            int hargaSebelum = hitungHargaTotal(jmlh);
            double diskon = hargaSebelum * 0.05;
            return diskon;
        } else {
            return 0;
        }
    }

    double hitungHargaBayar(int jmlh) {
        double diskon = hitungDiskon(jmlh);
        double hargaBayar = hitungHargaTotal(jmlh) - diskon;
        return hargaBayar;
    }

}
