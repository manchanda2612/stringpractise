package sample.com.practise.double_linked_list;

public class DoubleCircularLinkedList {

    private Node head = null;
    private Node tail = null;


    public void createDoubleCircularLinkedList(int nodeValue) {

        Node node = new Node(nodeValue);

        head = node;
        tail = node;
        node.next = node;
        node.previous = node;

    }

    private int getSizeOfList() {

        if(head == null) {
            return 0;
        }

        else {

            int size = 1;
            Node temp = head;

            while (temp != tail) {
                size++;
                temp = temp.next;
            }
            return size;
        }
    }



    public void forwardTraverseDoubleCircularLinkedList() {

        if(head == null) {
            System.out.print("List is empty" + "\n");
        }
        else {

            Node temp = head;

            while (temp != tail) {
                System.out.print(temp.value + "\t");
                temp = temp.next;
            }

            System.out.print(temp.value);
            System.out.print("\n");

        }
    }


    public void backwardTraverseDoubleCircularLinkedList() {

        if(head == null) {
            System.out.print("List is empty" + "\n");
        }
        else {

            Node temp = tail;

            while (temp != head) {
                System.out.print(temp.value + "\t");
                temp = temp.previous;
            }

            System.out.print(temp.value);
            System.out.print("\n");

        }
    }



    public void insertNodeAtFirstLastMiddle(int location, int nodeValue) {

        if(head == null) {
            System.out.print("List is empty" + "\n");
        }

        else if (location == 1) {

            Node node = new Node(nodeValue);

            node.previous = head.previous;  // or node.previous = tail;
            node.next = head;
            head.previous = node;
            head = node;
            tail.next = node;

        }

        else if (location == getSizeOfList() + 1) {

            Node node = new Node(nodeValue);

            node.previous = tail;
            node.next = head;
            tail.next = node;
            head.previous = node;
            tail = node;

        }

        else {

            Node temp = head;

            for (int i = 2; i <= location - 1; i++) {
                temp = temp.next;
            }

            Node node = new Node(nodeValue);

            node.next = temp.next;
            node.previous = temp;
            temp.next.previous = node;
            temp.next = node;

        }
    }


    public String searchElementInDoubleCircularLinkedList(int searchValue) {

        if(head == null) {
            return "List is empty";
        }

        else {

            Node temp = head;

            while(temp != tail) {
                if(temp.value == searchValue) {
                    return "Value Found";
                }
                temp = temp.next;
            }

            if(temp.value == searchValue) {
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


        else if (location == 1) {


            if(head == tail) {

                head.next = null;
                head.previous = null;
                head = null;
                tail = null;

            }

            else {

                head = head.next;
                head.previous = tail;
                tail.next = head;
            }

        }


        else if (location == getSizeOfList()) {

            if(head == tail) {

                head.next = null;
                head.previous = null;
                head = null;
                tail = null;

            }

            else {

               tail = tail.previous;
               tail.next = head;
               head.previous = tail;

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



    public void deleteEntireDoubleCircularLinkedList() {

        Node temp = head;

        while (temp != tail) {
            temp.previous = null;
            temp = temp.next;
        }

        temp.previous = null;
        head = null;
        tail.next = null;
        tail = null;


    }

}


