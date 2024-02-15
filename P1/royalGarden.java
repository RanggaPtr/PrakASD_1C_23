package P1;

public class royalGarden {
    public static void main(String[] args) {
        int[][] stockBunga = {
                { 10, 5, 15, 7 }, // RoyalGarden 1
                { 6, 11, 9, 12 }, // RoyalGarden 2
                { 2, 10, 10, 5 }, // RoyalGarden 3
                { 5, 7, 12, 9 } // Royal Garden 4
        };

        int[] hargaBunga = { 75000, 50000, 60000, 10000 };

        int[] pendapatanCabang = hitungPendapatan(stockBunga, hargaBunga);

        // Menampilkan pendapatan cabang
        System.out.println("Pendapatan Cabang:");
        for (int i = 0; i < pendapatanCabang.length; i++) {
            System.out.println("Cabang " + (i + 1) + ": " + pendapatanCabang[i]);
        }

        // Mengurangi stock bunga pada cabang 4
        stockBunga[3][0] -= 1; // Aglonema dikurangi 1
        stockBunga[3][1] -= 2; // Keladi dikurangi 2
        // Alocasia tidak diubah
        stockBunga[3][3] -= 5; // Mawar dikurangi 5

        // Menampilkan stock sisa
        String[] jenisBunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
        System.out.println("\nStock Sisa:");
        for (int i = 0; i < stockBunga.length; i++) {
            System.out.println("Royal Garden " + (i + 1) + ":");
            for (int j = 0; j < jenisBunga.length; j++) {
                System.out.println(jenisBunga[j] + ": " + stockBunga[i][j]);
            }
            System.out.println("---------------------");
        }
    }

    public static int[] hitungPendapatan(int[][] stockBunga, int[] hargaBunga) {
        int[] pendapatanCabang = new int[stockBunga.length];

        for (int i = 0; i < stockBunga.length; i++) {
            int totalPendapatanCabang = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPendapatanCabang += stockBunga[i][j] * hargaBunga[j];
            }
            pendapatanCabang[i] = totalPendapatanCabang;
        }

        return pendapatanCabang;
    }
}
