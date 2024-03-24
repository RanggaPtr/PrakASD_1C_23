package P5.sumArray;

public class sum23 {
    int perusahaan;
    int elemen;
    double keuntungan[][];
    double totalPerusahaan[];

    sum23(int perusahaan, int elemen) {
        this.perusahaan = perusahaan;
        this.elemen = elemen;
        this.keuntungan = new double[perusahaan][elemen];
        this.totalPerusahaan = new double[perusahaan];
    }
    
    void hitungTotalPerusahaan() {
        for (int i = 0; i < perusahaan; i++) {
            double total = 0;
            for (int j = 0; j < elemen; j++) {
                total += keuntungan[i][j];
            }
            totalPerusahaan[i] = total;
        }
    }

    double totalSemuaPerusahaan() {
        double total = 0;
        for (int i = 0; i < perusahaan; i++) {
            total += totalPerusahaan[i];
        }
        return total;
    }

    
    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum;
        }
        return 0;
    }
    // double totalBF(double arr[]) {
    //     for (int i = 0; i < elemen; i++) {
    //         total = total + arr[i];
    //     }
    //     return total;
    // }
}
