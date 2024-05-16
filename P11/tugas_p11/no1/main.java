package P11.tugas_p11.no1;

public class main {
    public static void main(String[] args) {
        singleLinkedList singLL = new singleLinkedList();
        singLL.print();

        dataMahasiswa mhs1 = new dataMahasiswa("Rangga", 123);
        dataMahasiswa mhs2 = new dataMahasiswa("Putra", 456);
        dataMahasiswa mhs3 = new dataMahasiswa("Syananda", 789);
        dataMahasiswa mhs4 = new dataMahasiswa("Budhi", 101);
        dataMahasiswa mhs5 = new dataMahasiswa("Setiawan", 102);

        singLL.addFirst(mhs1);
        singLL.print();
        singLL.addLast(mhs2);
        singLL.print();
        singLL.addFirst(mhs3);
        singLL.print();
        singLL.insertAfter(123, mhs4);
        singLL.print();
        singLL.insertAt(3, mhs5);
        singLL.print();
    }
}
