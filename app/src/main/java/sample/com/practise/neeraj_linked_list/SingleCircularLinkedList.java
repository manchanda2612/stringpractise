package sample.com.practise.neeraj_linked_list;

public class SingleCircularLinkedList {

    private Node head;
    private Node tail;

    public void createCircularLinkedList(int nodeValue) {

        head = null;
        tail = null;

        Node node = new Node(nodeValue);

        head = node;
        tail = node;
        node.next = node;

    }


    private int getSizeOfList() {

        int size = 1;

        // if list is empty
        if(head == null) {
            return 0;
        }

        // if list is not empty
        else {

            Node temp = head;

            while (temp.next != tail) {
                size++;
                temp = temp.next;
            }
            return size;
        }
    }


    public void traverseSingleCircularLinkedList() {

        if(head == null) {
            System.out.println("List is empty");
        }

        else {

            Node temp = head;

            while(temp.next != tail) {
                System.out.print(temp.value + "\t");
                temp = temp.next;
            }

            System.out.print(temp.value + "\n");

        }
    }


    public void insertAtFirstLastInBetween(int location, int nodeValue) {

        // if there is not node in list
        if(head == null) {
            System.out.println("List is Empty");
        }


        // if we are adding first node in the list
        // here 1 means at 1st position not 2nd position.
        if(location == 1) {

            // if there is no node exist
            if(head == null) {

                Node node = new Node(nodeValue);
                head = node;
                tail = node;
                node.next = node;

            }

            // if more than one node exist in list
            else {

                Node node = new Node(nodeValue);
                node.next = head;
                head = node;
                tail.next = head;

            }
        }


        // if user want to add a node at last location
        else if (location >= (getSizeOfList() + 1)) {

            Node node = new Node(nodeValue);

            node.next = tail.next;
            tail.next = node;
            tail = node;

        }


        // if user want to add a node at any particular location
        else {


            Node temp = head;

            for(int i = 2; i <= location -1; i++) {
                temp = temp.next;
            }

            Node node = new Node(nodeValue);
            node.next = temp.next;
            temp.next = node;
        }
    }



    public void deleteEntireSingleCircularLinkedList() {
        head = null;
        tail.next = null;
        tail = null;
    }


    public void deleteNodeAtFirstLastInBetween(int location) {


        if(head == null) {
            System.out.println("List is empty");
        }


        // if user want to delete first node
        if(location == 1) {


            // if there is only one node in list
            if(head == tail) {

                head.next = null;
                head = null;
                tail = null;

                // if there is more than one node in list
            } else {

                head = head.next;
                tail.next = head;

            }
        }



        // if user want to delete last node
        if(location == getSizeOfList()) {

            // if there is only one node in list
            if (head == tail) {

                head.next = null;
                head = null;
                tail = null;

                // if there is more than one node in list
            } else {

                Node temp = head;

                for (int i = 2; i <= location - 1; i++) {
                    temp = temp.next;
                }


                temp.next = head;
                tail = temp;
            }
        }



        // if user want to delete any particular node between 1st and last node
        else {

            Node temp = head;

            for(int i = 2; i <= location - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;

        }

    }




    public String searchInSingleCircularLinkedList(int searchValue) {

        if(head == null) {
            return "List is empty";
        }

        else {

            Node temp = head;

            while (temp.next != tail) {

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




}
