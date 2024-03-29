package P6.bubbleSort.latihanPraktikum;

public class hotel23 {
    String nama;
    String kota;
    int harga;
    byte bintang;

    public hotel23(String nama, String kota, int harga, byte bintang) {
        this.nama = nama;
        this.kota = kota;
        this.harga = harga;
        this.bintang = bintang;
    }

    public void tampilDaftarHotel() {
        System.out.println("Nama Hotel : " + nama);
        System.out.println("Kota : " + kota);
        System.out.println("Harga Inap Perhari : " + harga);
        System.out.println("Rating : " + bintang);
    }
}
