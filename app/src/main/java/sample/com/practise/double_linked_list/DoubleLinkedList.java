package sample.com.practise.double_linked_list;

public class DoubleLinkedList {


    private Node head = null;
    private Node tail = null;


    public void createDoubleLinkedList(int nodeValue) {

        Node node = new Node(nodeValue);

        head = node;
        tail = node;


    }

    public int getListSize() {


        if(head == null) {
            return 0;
        }

        else {

            Node temp = head;
            int size = 1;
            while (temp != tail) {
                size++;
                temp = temp.next;
            }
            return size;
        }
    }


    public void forwardTraverseDoubleLinkedList() {

        if(head == null) {
            System.out.print("List is empty" + "\n");
        }

        else {

            Node temp = head;

            while(temp.next != null) {
                System.out.print(temp.value + "\t");
                temp = temp.next;
            }
            System.out.print(temp.value + "\n");
        }
    }


    public void backwardTraverseDoubleLinkedList() {

        if(head == null) {
            System.out.print("List is empty" + "\n");
        }

        else {

            Node temp = tail;

            while(temp.previous != null) {
                System.out.print(temp.value + "\t");
                temp = temp.previous;
            }
            System.out.print(temp.value + "\n");
        }
    }


    public void insertNodeAtFirstLastMiddle(int location, int nodeValue) {

        if(head == null) {
            System.out.print("List is empty" + "\n");
        }

        // if user want to add a node at first location
        else if (location == 1) {

            Node node = new Node(nodeValue);
            node.next = head;
            head.previous = node;
            head = node;

        }

        // if use want to add a node at last location
        else if (location == (getListSize() + 1)) {

            Node node = new Node(nodeValue);

            tail.next = node;
            node.previous = tail;
            tail = node;

        }

        // if user want to add a node at any location except 1st and last
        else {


            Node node = new Node(nodeValue);
            Node temp = head;

            for(int i = 2; i <=(location - 1); i++) {
                temp = temp.next;
            }

            node.next = temp.next;
            node.previous = temp;
            node.next.previous = node;
            temp.next = node;

        }

    }


    public String searchVallueInLinkedList(int nodeValue) {

        if(head == null) {
            return "List is empty";
        }

        else {

            Node temp = head;

            while (temp.next != null) {
                if(temp.value == nodeValue) {
                    return "Value Found";
                }
                temp = temp.next;
            }

            if(temp.value == nodeValue) {
                return "Value Found";
            } else {
                return "Value Not Found";
            }

        }
    }



    public void deleteNodeAtFirstLastMiddle(int location) {


        if(head == null) {
            System.out.print("List is empty" + "\n");
        }


        // if user want to delete a node at first location
        else if (location == 1) {

            if(head == tail) {
                head = null;
                tail = null;
            }

            else {
                head = head.next;
                head.previous = null;
            }

        }


        // if user want to delete a node at last location
        else if (location == getListSize()) {

            if(head == tail) {
                head = null;
                tail = null;
            }

            else {
                tail = tail.previous;
                tail.next = null;
            }
        }


        else {

            Node temp = head;

            for(int i = 2; i <= location - 1; i++) {
                temp = temp.next;
            }


            temp.next = temp.next.next;
            temp.next.previous = temp;

        }
    }


    public void deleteEntireLinkedList() {

        if(head == null) {
            System.out.print("List is empty" + "\n");
        }

        else {

            Node temp = head;

            while (temp != tail) {
                temp.previous = null;
                temp = temp.next;
            }

            head = null;
            tail = null;

        }
    }




}
