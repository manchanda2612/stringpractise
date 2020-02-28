package sample.com.practise.queue;

public class QueueLinkedListMainClass {

    public static void main(String[] args) {

        System.out.println("Creating an empty queue...");
        QueueLinkedListImplementation queue = new QueueLinkedListImplementation();
        queue.createQueue(10);

        System.out.println("\nEnqueuing 6 values in the queue...");
        for (int i = 2; i <= 6; i++) {
            queue.enqueueItemIntoQueue(i * 10);
        }

        queue.enqueueItemIntoQueue(70);

        System.out.println("----------------------------------");

        queue.traverseQueue();

        System.out.println("----------------------------------");

        queue.dequeueItemFromQueue();
        queue.dequeueItemFromQueue();

        System.out.println("----------------------------------");

        queue.traverseQueue();
        System.out.println("----------------------------------");

        System.out.println("Enqueuing new value in the queue");
        queue.enqueueItemIntoQueue(80);
        queue.traverseQueue();

        System.out.println("----------------------------------");
        queue.dequeueItemFromQueue();
        queue.traverseQueue();

        System.out.println("----------------------------------");
        queue.deleteQueue();

    }

}
