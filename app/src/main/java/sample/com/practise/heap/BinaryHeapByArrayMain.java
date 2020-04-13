package sample.com.practise.heap;

public class BinaryHeapByArrayMain {

    public static void main(String[] args) {

        BinaryHeapByArray binaryHeapByArray = new BinaryHeapByArray();

        System.out.println("Creating a blank Heap of Size 10");
        binaryHeapByArray.createBinaryHeap(10);

        binaryHeapByArray.insertValueIntoBinaryHeap(100);
        binaryHeapByArray.insertValueIntoBinaryHeap(90);
        binaryHeapByArray.insertValueIntoBinaryHeap(80);
        binaryHeapByArray.insertValueIntoBinaryHeap(70);
        binaryHeapByArray.insertValueIntoBinaryHeap(60);
        binaryHeapByArray.insertValueIntoBinaryHeap(50);
        binaryHeapByArray.insertValueIntoBinaryHeap(40);
        binaryHeapByArray.insertValueIntoBinaryHeap(30);
        binaryHeapByArray.insertValueIntoBinaryHeap(20);

        System.out.println("Traversing Binary Heap");
        binaryHeapByArray.levelOrderTraversal();

        System.out.println("\n\nPeek value from Binary Heap");
        binaryHeapByArray.peekFromBinaryHeap();

        System.out.println("\nDelete value from Binary Heap");
        binaryHeapByArray.deleteValueFromBinaryHeap();

        System.out.println("\nTraversing Binary Heap");
        binaryHeapByArray.levelOrderTraversal();

        System.out.println("\n\nInsert new value into Binary Heap");
        binaryHeapByArray.insertValueIntoBinaryHeap(110);

        System.out.println("\n\nTraversing Binary Heap");
        binaryHeapByArray.levelOrderTraversal();

        System.out.println("\n\nDelete value from Binary Heap");
        binaryHeapByArray.deleteValueFromBinaryHeap();

        System.out.println("\n\nTraversing Binary Heap");
        binaryHeapByArray.levelOrderTraversal();
    }

}
