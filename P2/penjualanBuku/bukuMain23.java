public class bukuMain23 {
    public static void main(String[] args) {
        bukuu23 bk1 = new bukuu23();

        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok=13;
        bk1.harga = 71000;
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        System.out.println("=============================================");

        bukuu23 bk2 = new bukuu23();

        bk2.judul = "How To train Your Dragon";
        bk2.pengarang = "Cressida Cowwel";
        bk2.halaman = 432;
        bk2.stok = 0;
        bk2.harga = 275000;
        bk2.tampilInformasi();
        bk2.terjual(4);
        System.out.println("Setelah pengurangan stock");
        bk2.tampilInformasi();

    
    }
}
