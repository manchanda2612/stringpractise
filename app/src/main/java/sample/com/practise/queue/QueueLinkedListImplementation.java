package sample.com.practise.queue;

public class QueueLinkedListImplementation {

    Node head = null;
    Node tail = null;

    public void createQueue(int value) {

        Node node = new Node(value);
        head = node;
        tail = node;
    }

    private boolean isQueueEmpty() {
        return head == null && tail == null;
    }


    public void enqueueItemIntoQueue(int value) {

        // if queue is empty
        if(isQueueEmpty()) {
            createQueue(value);
        }

        // if we enqueue value at any other location
        else {
            Node node = new Node(value);
            tail.next = node;
            tail = node;
            System.out.println("Enqueue Value is " + tail.value);
        }
    }

    public void dequeueItemFromQueue() {

        if(isQueueEmpty()) {
            System.out.println("Queue is Empty");
        }

        // if there is only one item exist in queue
        else if (head == tail){
            System.out.println("Dequeue Value is " + head.value);
            head = null;
            tail = null;
        }

        // if there are more item in the queue
        else {
            System.out.println("Dequeue Value is " + head.value);
            head = head.next;

        }
    }

    public void peekItemFromQueue() {
        if(isQueueEmpty()) {
            System.out.println("Queue is Empty");
        }

        else {
            System.out.println("Peek Value is " + head.value);
        }
    }

    public void traverseQueue () {
        if (isQueueEmpty()) {
            System.out.println("Queue is Empty");
        }

        else {
            System.out.println("Traversing Queue............");
            Node temp = head;

            while (temp != tail) {
                System.out.println(temp.value);
                temp = temp.next;
            }
            System.out.println(temp.value);
        }
    }

    public void deleteQueue() {
        head = null;
        tail = null;
        System.out.println("Queue is Empty");
    }

}
