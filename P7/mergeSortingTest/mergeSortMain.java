package P7.mergeSortingTest;

public class mergeSortMain {
    public static void main(String[] args) {
        int data[] = { 10, 40, 30, 50, 70, 20, 100, 90 };
        System.out.println("Sorting menggunakan merge sort");
        mergeSorting23 mSort = new mergeSorting23();
        System.out.println("Data Awal");
        mSort.printArray(data);
        mSort.mergeSorting23(data);
        System.out.println("Setelah Diurutkan");
        mSort.printArray(data);
    }
}
