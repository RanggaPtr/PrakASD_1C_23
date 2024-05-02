package P10.tugas;

public class pembeli {
    String nama;
    String noHp;

    public pembeli(String nama, String noHp) {
        this.nama = nama;
        this.noHp = noHp;
    }

    public String toString() {
        return "Nama: " + nama + ", No HP: " + noHp;
    }
}
