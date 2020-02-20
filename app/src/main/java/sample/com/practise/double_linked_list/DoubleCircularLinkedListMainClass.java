package sample.com.practise.double_linked_list;

public class DoubleCircularLinkedListMainClass {


    public static void main(String[] args) {

        DoubleCircularLinkedList doubleCircularLinkedList = new DoubleCircularLinkedList();
        doubleCircularLinkedList.createDoubleCircularLinkedList(10);

        doubleCircularLinkedList.insertNodeAtFirstLastMiddle(2,20);
        doubleCircularLinkedList.insertNodeAtFirstLastMiddle(3,30);
        doubleCircularLinkedList.insertNodeAtFirstLastMiddle(4,40);
        doubleCircularLinkedList.insertNodeAtFirstLastMiddle(5,50);
        doubleCircularLinkedList.insertNodeAtFirstLastMiddle(6,60);

        doubleCircularLinkedList.forwardTraverseDoubleCircularLinkedList();
        doubleCircularLinkedList.backwardTraverseDoubleCircularLinkedList();

        doubleCircularLinkedList.insertNodeAtFirstLastMiddle(4,35);
        doubleCircularLinkedList.insertNodeAtFirstLastMiddle(6,45);

        doubleCircularLinkedList.forwardTraverseDoubleCircularLinkedList();
        doubleCircularLinkedList.backwardTraverseDoubleCircularLinkedList();

        System.out.print(doubleCircularLinkedList.searchElementInDoubleCircularLinkedList(35) + "\n");
        System.out.print(doubleCircularLinkedList.searchElementInDoubleCircularLinkedList(70) + "\n");


        doubleCircularLinkedList.deleteNodeAtFirstLastMiddle(1);
        doubleCircularLinkedList.forwardTraverseDoubleCircularLinkedList();
        doubleCircularLinkedList.backwardTraverseDoubleCircularLinkedList();


        doubleCircularLinkedList.deleteNodeAtFirstLastMiddle(3);
        doubleCircularLinkedList.forwardTraverseDoubleCircularLinkedList();
        doubleCircularLinkedList.backwardTraverseDoubleCircularLinkedList();


        doubleCircularLinkedList.deleteNodeAtFirstLastMiddle(6);
        doubleCircularLinkedList.forwardTraverseDoubleCircularLinkedList();
        doubleCircularLinkedList.backwardTraverseDoubleCircularLinkedList();

        doubleCircularLinkedList.deleteEntireDoubleCircularLinkedList();
        doubleCircularLinkedList.forwardTraverseDoubleCircularLinkedList();
        doubleCircularLinkedList.backwardTraverseDoubleCircularLinkedList();

    }


}
