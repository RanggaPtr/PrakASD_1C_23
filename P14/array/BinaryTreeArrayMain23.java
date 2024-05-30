package P14.array;

public class BinaryTreeArrayMain23 {
    public static void main(String[] args) {
        BinaryTreeArray23 bta = new BinaryTreeArray23();
        int data[] = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0 };
        int idxLast = 6;
        bta.populateData(data, idxLast);

        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);

        System.out.print("\nPreOrder Traversal : ");
        bta.traversePreOrder(0);

        System.out.print("\nPostOrder Traversal : ");
        bta.traversePostOrder(0);

        System.out.println("\nMin value: " + bta.findMin(0));
        System.out.println("Max value: " + bta.findMax(0));

        System.out.print("Leaf Nodes: ");
        bta.printLeafNodes(0);
        System.out.println();

        System.out.println("Number of Leaf Nodes: " + bta.countLeafNodes(0));

        bta.add(10);
        System.out.print("InOrder Traversal after adding 10: ");
        bta.traverseInOrder(0);
        System.out.println();
    }
}
