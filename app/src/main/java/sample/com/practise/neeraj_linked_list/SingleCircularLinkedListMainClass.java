package sample.com.practise.neeraj_linked_list;

public class SingleCircularLinkedListMainClass {


    public static void main(String[] args) {

        SingleCircularLinkedList singleCircularLinkedList = new SingleCircularLinkedList();

        singleCircularLinkedList.createCircularLinkedList(10);

        singleCircularLinkedList.insertAtFirstLastInBetween(2, 20);
        singleCircularLinkedList.insertAtFirstLastInBetween(3, 30);
        singleCircularLinkedList.insertAtFirstLastInBetween(4, 40);
        singleCircularLinkedList.insertAtFirstLastInBetween(5, 50);
        singleCircularLinkedList.insertAtFirstLastInBetween(6, 60);


        singleCircularLinkedList.traverseSingleCircularLinkedList();

        singleCircularLinkedList.insertAtFirstLastInBetween(4, 35);
        singleCircularLinkedList.insertAtFirstLastInBetween(6, 45);

        singleCircularLinkedList.traverseSingleCircularLinkedList();

        System.out.println(singleCircularLinkedList.searchInSingleCircularLinkedList(35));
        System.out.println(singleCircularLinkedList.searchInSingleCircularLinkedList(70));


        singleCircularLinkedList.deleteNodeAtFirstLastInBetween(1);
        singleCircularLinkedList.traverseSingleCircularLinkedList();


        singleCircularLinkedList.deleteNodeAtFirstLastInBetween(3);
        singleCircularLinkedList.traverseSingleCircularLinkedList();


        singleCircularLinkedList.deleteNodeAtFirstLastInBetween(6);
        singleCircularLinkedList.traverseSingleCircularLinkedList();

        singleCircularLinkedList.deleteEntireSingleCircularLinkedList();
        singleCircularLinkedList.traverseSingleCircularLinkedList();

    }
}
