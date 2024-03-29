package P6.bubbleSort.latihanPraktikum;

public class mainHotel233 {
    
public static void main(String[] args) {
    hotelService23 listHotel23 =new hotelService23();

    hotel23 h = new hotel23("Hotel Paramita", "Malang", 600000, (byte)5);
    hotel23 h1 = new hotel23("Hotel Niagara", "Malang", 250000, (byte)3);
    hotel23 h2 = new hotel23("Hotel Puspita", "Malang", 450000, (byte)4);
    hotel23 h3 = new hotel23("Hotel Kencana", "Malang", 150000, (byte)2);
    hotel23 h4 = new hotel23("Hotel Regina", "Malang", 350000,(byte) 4);

    listHotel23.tambah(h);
    listHotel23.tambah(h1);
    listHotel23.tambah(h2);
    listHotel23.tambah(h3);
    listHotel23.tambah(h4);

    System.out.println("====================================");
    System.out.println("Data Sebelum Diurutkan ");
    listHotel23.tampilAll();

    System.out.println("====================================");
    System.out.println("Data Sesudah Diurutkan Secara Ascending Berdasarkan Harga (Bubble Sort)");
    listHotel23.bubbleSortHA();
    listHotel23.tampilAll();

    System.out.println("====================================");
    System.out.println("Data Sesudah Diurutkan Secara Ascending berdasarkan Harga (Selection Sort)");
    listHotel23.selectionSortHA();
    listHotel23.tampilAll();


    System.out.println("====================================");
    System.out.println("Data Sesudah Diurutkan Secara Descending Berdasarkan Rating(Bubble Sort)");
    listHotel23.bubbleSortRD();
    listHotel23.tampilAll();

    System.out.println("====================================");
    System.out.println("Data Sesudah Diurutkan Secara Descending Berdasarkan Rating(Selection Sort)");
    listHotel23.selectionSortRD();
    listHotel23.tampilAll();

}
}
