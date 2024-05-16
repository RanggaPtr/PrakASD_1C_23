    package P11.tugas_p11.no2;

    public class main {
        public static void main(String[] args) {
            singleLinkedList singLL = new singleLinkedList();
            singLL.print();

            dataMahasiswa mhs1 = new dataMahasiswa("anton", 123);
            dataMahasiswa mhs2 = new dataMahasiswa("prita", 456);
            dataMahasiswa mhs3 = new dataMahasiswa("yusuf", 789);
            dataMahasiswa mhs4 = new dataMahasiswa("doni", 101);
            dataMahasiswa mhs5 = new dataMahasiswa("sari", 102);
            System.out.println("==============================================================================================");
            System.out.println("penambahan antrian");
            System.out.println("==============================================================================================");
            singLL.addLast(mhs1);
            singLL.print();
            singLL.addLast(mhs2);
            singLL.print();
            singLL.addLast(mhs3);
            singLL.print();
            singLL.addLast(mhs4);
            singLL.print();
            singLL.addLast(mhs5);
            singLL.print();
            System.out.println("==============================================================================================");
            System.out.println("Urutan keluar Antrian");
            System.out.println("==============================================================================================");
            singLL.print();
            singLL.removeFirst();
            singLL.print();
            singLL.removeFirst();
            singLL.print();
            singLL.removeFirst();
            singLL.print();
            singLL.removeFirst();
            singLL.print();
            singLL.removeFirst();
            singLL.print();

        }
    }
