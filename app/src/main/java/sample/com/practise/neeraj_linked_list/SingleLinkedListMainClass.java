package sample.com.practise.neeraj_linked_list;

public class SingleLinkedListMainClass {

    public static void main(String[] args) {


        SingleLinkedList linkedListExample = new SingleLinkedList();
        linkedListExample.createNode(10);

        linkedListExample.insertNodeAtFirstLastMiddle(2,20);
        linkedListExample.insertNodeAtFirstLastMiddle(3,30);
        linkedListExample.insertNodeAtFirstLastMiddle(4,40);
        linkedListExample.insertNodeAtFirstLastMiddle(5,50);
        linkedListExample.insertNodeAtFirstLastMiddle(6,60);


        linkedListExample.traverseSingleLinkedList();

        linkedListExample.insertNodeAtFirstLastMiddle(4,35);
        linkedListExample.insertNodeAtFirstLastMiddle(6,45);

        linkedListExample.traverseSingleLinkedList();

        System.out.println(linkedListExample.searchElementInLinkedList(35));
        System.out.println(linkedListExample.searchElementInLinkedList(70));


        linkedListExample.deleteNodeAtFirstLastMiddle(1);
        linkedListExample.traverseSingleLinkedList();


        linkedListExample.deleteNodeAtFirstLastMiddle(3);
        linkedListExample.traverseSingleLinkedList();


        linkedListExample.deleteNodeAtFirstLastMiddle(6);
        linkedListExample.traverseSingleLinkedList();

        linkedListExample.deleteEntireLinkedList();
        linkedListExample.traverseSingleLinkedList();


    }

}
