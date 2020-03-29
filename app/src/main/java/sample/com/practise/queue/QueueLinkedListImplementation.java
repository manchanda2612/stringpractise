package sample.com.practise.queue;

public class QueueLinkedListImplementation {

    Node dequeue = null;
    Node enqueue = null;

    public void createQueue(int value) {

        Node node = new Node(value);
        dequeue = node;
        enqueue = node;
    }

    private boolean isQueueEmpty() {
        return dequeue == null && enqueue == null;
    }


    public void enqueueItemIntoQueue(int value) {

        // if queue is empty
        if(isQueueEmpty()) {
            createQueue(value);
        }

        // if we enqueue value at any other location
        else {
            Node node = new Node(value);
            enqueue.next = node;
            enqueue = node;
            System.out.println("Enqueue Value is " + enqueue.value);
        }
    }

    public void dequeueItemFromQueue() {

        if(isQueueEmpty()) {
            System.out.println("Queue is Empty");
        }

        // if there is only one item exist in queue
        else if (dequeue == enqueue){
            System.out.println("Dequeue Value is " + dequeue.value);
            dequeue = null;
            enqueue = null;
        }

        // if there are more item in the queue
        else {
            System.out.println("Dequeue Value is " + dequeue.value);
            dequeue = dequeue.next;

        }
    }

    public void peekItemFromQueue() {
        if(isQueueEmpty()) {
            System.out.println("Queue is Empty");
        }

        else {
            System.out.println("Peek Value is " + dequeue.value);
        }
    }

    public void traverseQueue () {
        if (isQueueEmpty()) {
            System.out.println("Queue is Empty");
        }

        else {
            System.out.println("Traversing Queue............");
            Node temp = dequeue;

            while (temp != enqueue) {
                System.out.println(temp.value);
                temp = temp.next;
            }
            System.out.println(temp.value);
        }
    }

    public void deleteQueue() {
        dequeue = null;
        enqueue = null;
        System.out.println("Queue is Empty");
    }

}
