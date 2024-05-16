package P11.singleLinkedList;

public class SLLMAIN {
   public static void main(String[] args) {
       singleLinkedList singLL = new singleLinkedList();

       singLL.print();
       singLL.addFirst(890);
       singLL.print();
       singLL.addLast(760);
       singLL.print();
       singLL.addFirst(700);
       singLL.print();
       singLL.insertAfter(700, 999);
       singLL.print();
       singLL.insertAt(3, 888);
       singLL.print();

   }
}
