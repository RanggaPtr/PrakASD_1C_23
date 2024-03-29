package P6.bubbleSort.latihanPraktikum;


public class hotelService23 {
    hotel23 rooms23[] = new hotel23[5];
    int index;

    // method tambah
    void tambah(hotel23 h) {
        if (index < rooms23.length) {
            rooms23[index] = h;
            index++;
        } else {
            System.out.println("Data Sudah Penuh !!!");
        }
    }

    // method tampil all
    void tampilAll() {
        for (hotel23 h : rooms23) {
            h.tampilDaftarHotel();
        }
    }

    // harga
    // bubble sort ascending
    void bubbleSortHA() {
        for (int i = 0; i < rooms23.length - 1; i++) {
            for (int j = 0; j < rooms23.length - i - 1; j++) {
                if (rooms23[j].harga > rooms23[j + 1].harga) {
                    hotel23 tempHotel23 = rooms23[j];
                    rooms23[j] = rooms23[j + 1];
                    rooms23[j + 1] = tempHotel23;
                }
            }
        }
    }

    // selection sort ascending
    void selectionSortHA() {
        for (int i = 0; i < rooms23.length - 1; i++) {
            int idMin = i;
            for (int j = i + 1; j < rooms23.length; j++) {
                if (rooms23[j].harga < rooms23[idMin].harga) {
                    idMin = j;
                }
            }

            // swap
            hotel23 tempHotel23 = rooms23[idMin];
            rooms23[idMin] = rooms23[i];
            rooms23[i] = tempHotel23;
        }
    }


    // rating
    // bubble sort descending
    void bubbleSortRD() {
        for (int i = 0; i < rooms23.length - 1; i++) {
            for (int j = 0; j < rooms23.length - i - 1; j++) {
                if (rooms23[j].bintang < rooms23[j + 1].bintang) {
                    hotel23 tempHotel23 = rooms23[j];
                    rooms23[j] = rooms23[j + 1];
                    rooms23[j + 1] = tempHotel23;
                }
            }
        }
    }

    // selection sort descending
    void selectionSortRD() {
        for (int i = 0; i < rooms23.length - 1; i++) {
            int idMax = i;
            for (int j = i + 1; j < rooms23.length; j++) {
                if (rooms23[j].bintang > rooms23[idMax].bintang) {
                    idMax = j;
                }
            }

            // swap
            hotel23 tempHotel23 = rooms23[idMax];
            rooms23[idMax] = rooms23[i];
            rooms23[i] = tempHotel23;
        }
    }
}
