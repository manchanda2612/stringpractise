package sample.com.practise.neeraj_linked_list;

public class SingleLinkedList {

    private Node head;
    private Node tail;

    public void createNode(int value) {


        head = null;
        tail = null;

        Node node = new Node(value);

        head = node;
        tail = node;

    }


    public void traverseSingleLinkedList() {


        if(head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp.next != tail) {
                System.out.print(temp.value + "\t");
                temp = temp.next;
            }
            System.out.print(temp.value + "\n");
        }
    }


    private int getSizeOfList() {

        int size = 1;
        Node temp = head;
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }


    public void insertNodeAtFirstLastMiddle(int location, int nodeValue) {

        // if list is empty
        if (head == null) {
            System.out.println("List is Empty");
        }

        // if we want to add new node at first location
        else if (location == 1) {
            Node node = new Node(nodeValue);

            node.next = head;
            head = node;

        }

        // if we want to add new node at last location
        else if((getSizeOfList() + 1) == location) {

            Node node = new Node(nodeValue);
            tail.next = node;
            tail = node;

        }


        // if we want to insert a node in any particular location
        else if (location <= getSizeOfList()){
            Node temp = head;
            for(int i = 2; i <= location - 1; i++) {
                temp = temp.next;
            }

            Node node = new Node(nodeValue);
            node.next = temp.next;
            temp.next = node;
        }

    }



    public String searchElementInLinkedList(int searchValue) {

        if(head == null) {
            return "List is empty";
        }

        else {

            Node temp = head;
            while (temp != tail) {

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

        // if list is empty
        if(head == null) {
            System.out.println("List is empty");
        }

        // if we want to delete node at fist location
        else if (location == 1) {

            // if there is only one node
            if(head == tail) {
                head = null;
                tail = null;
            } else {
                // if more than one node in list
                head = head.next;
            }
        }



        // if we want to delete node at last location
        else if (getSizeOfList() == location) {

            // if there is only one node
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                // if more than one node in list
                Node temp = head;
                for (int i = 2; i <= location - 1; i++) {
                    temp = temp.next;
                }

                temp.next = null;
                tail = temp;
            }
        }

        // if we want to delete a node at any particular location
        else if (location < getSizeOfList()){
            Node temp = head;
            for(int i = 2; i <= location - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;

        }
    }


    public void deleteEntireLinkedList() {
        head = null;
        tail = null;
    }


}
