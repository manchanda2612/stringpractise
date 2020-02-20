package sample.com.practise.double_linked_list;


public class DoubleLinkedListMainClass {


    public static void main(String[] args) {

        DoubleLinkedList linkedListExample = new DoubleLinkedList();
        linkedListExample.createDoubleLinkedList(10);

        linkedListExample.insertNodeAtFirstLastMiddle(2,20);
        linkedListExample.insertNodeAtFirstLastMiddle(3,30);
        linkedListExample.insertNodeAtFirstLastMiddle(4,40);
        linkedListExample.insertNodeAtFirstLastMiddle(5,50);
        linkedListExample.insertNodeAtFirstLastMiddle(6,60);

        linkedListExample.forwardTraverseDoubleLinkedList();
        linkedListExample.backwardTraverseDoubleLinkedList();

        linkedListExample.insertNodeAtFirstLastMiddle(4,35);
        linkedListExample.insertNodeAtFirstLastMiddle(6,45);

        linkedListExample.forwardTraverseDoubleLinkedList();
        linkedListExample.backwardTraverseDoubleLinkedList();

        System.out.println(linkedListExample.searchVallueInLinkedList(35) + "\n");
        System.out.println(linkedListExample.searchVallueInLinkedList(70) + "\n");


        linkedListExample.deleteNodeAtFirstLastMiddle(1);
        linkedListExample.forwardTraverseDoubleLinkedList();
        linkedListExample.backwardTraverseDoubleLinkedList();


        linkedListExample.deleteNodeAtFirstLastMiddle(3);
        linkedListExample.forwardTraverseDoubleLinkedList();
        linkedListExample.backwardTraverseDoubleLinkedList();


        linkedListExample.deleteNodeAtFirstLastMiddle(6);
        linkedListExample.forwardTraverseDoubleLinkedList();
        linkedListExample.backwardTraverseDoubleLinkedList();

        linkedListExample.deleteEntireLinkedList();
        linkedListExample.forwardTraverseDoubleLinkedList();
        linkedListExample.backwardTraverseDoubleLinkedList();

    }

}
