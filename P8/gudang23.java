package P8;

public class gudang23 {
    barang23[] tumpukan;
    int size;
    int top;

    public gudang23(int kapasitas) {
        size = kapasitas;
        tumpukan = new barang23[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    // push menambahkan ke stack
    public void tambahBarang(barang23 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + "Berhadil ditambahkan ke-gudang");
        } else {
            System.out.println("Gagal!Tumpukan barang di gudang sudah penuh");
        }
    }

    // pop | mengambil teratas
    public barang23 ambilBarang23() {
        if (!cekKosong()) {
            barang23 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " Diambil dari gudang");
            System.out.println("Kode Unik dalam biner: "+konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tidak ada tumpukan barang (kosong)");
            return null;
        }
    }

    // peek | melihat barangg teratas
    public barang23 lihatBarangTeratas() {
        if (!cekKosong()) {
            barang23 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas" + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tidak ada tumpukan barang (kosong)");
            return null;
        }
    }

    // tampilkan
    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian Barang Di-Gudang");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori%s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tidak ada tumpukan barang (kosong)");
        }
    }
    
    // konversi desimal ke biner
    public String konversiDesimalKeBiner(int kode) {
        stackKonversi23 stack = new stackKonversi23();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
