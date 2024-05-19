package P12.tugas_no2;

import java.lang.reflect.Method;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        method mt = new method();
        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah data awal");
            System.out.println("2. Tambah data akhir");
            System.out.println("3. Tambah data index tertentu");
            System.out.println("4. Hapus data pertama");
            System.out.println("5. Hapus data terakhir");
            System.out.println("6. Hapus data tertenru");
            System.out.println("7. Cetak");
            System.out.println("8. Cari Id film");
            System.out.println("9. Urut data rating film (DESC)");
            System.out.println("10. Exit");
            System.out.print("Pilih menu: ");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Masukkan ID film: ");
                    int idFilm = scanner.nextInt();
                    System.out.print("Masukkan judul film: ");
                    String judulFilm = scanner.next();
                    System.out.print("Masukkan rating film: ");
                    double ratingFilm = scanner.nextDouble();
                    dataFilm dataFilm = new dataFilm(idFilm, judulFilm, ratingFilm);
                    mt.addFirst(dataFilm);
                    break;
                case 2:
                    System.out.print("Masukkan ID film: ");
                    idFilm = scanner.nextInt();
                    System.out.print("Masukkan judul film: ");
                    judulFilm = scanner.next();
                    System.out.print("Masukkan rating film: ");
                    ratingFilm = scanner.nextDouble();
                    dataFilm = new dataFilm(idFilm, judulFilm, ratingFilm);
                    mt.addLast(dataFilm);
                    break;
                case 3:
                    System.out.print("Masukkan ID film: ");
                    idFilm = scanner.nextInt();
                    System.out.print("Masukkan judul film: ");
                    judulFilm = scanner.next();
                    System.out.print("Masukkan rating film: ");
                    ratingFilm = scanner.nextDouble();
                    dataFilm = new dataFilm(idFilm, judulFilm, ratingFilm);
                    System.out.print("Masukkan index: ");
                    int index = scanner.nextInt();
                    mt.add(dataFilm, index);
                    break;
                case 4:
                    mt.removeFirst();
                    break;
                case 5:
                    mt.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan index: ");
                    index = scanner.nextInt();
                    mt.remove(index);
                    break;
                case 7:
                    mt.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID film yang dicari: ");
                    idFilm = scanner.nextInt();
                    Node result = mt.searchByID(idFilm);
                    if (result != null) {
                        System.out.println("Data ditemukan: ");
                        System.out.println(
                                "|" + "\t" + "ID" + "\t" + "|" + "\t" + "JUDUL FILM" + "\t" + "|" + "RATING" + "\t"
                                        + "|");
                        System.out.print("|" + "\t" + result.data.id + "\t" + "|" + "\t" + result.data.judulFilm + "\t"
                                + "|" + "\t" + "|" + result.data.rating + "\t"
                                + "|" + "\n");
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                    break;
                case 9:
                    mt.selectionSort();
                    System.out.println("Data berhasil diurutkan berdasarkan rating film secara descending.");
                    break;
                case 10:
                    System.out.println("Keluar dari program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }

        } while (menu != 4);
    }
}
