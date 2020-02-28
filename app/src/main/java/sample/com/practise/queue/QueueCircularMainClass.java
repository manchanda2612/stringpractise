package sample.com.practise.queue;



public class QueueCircularMainClass {

    public static void main(String[] args) {

        System.out.println("Creating an empty queue...");
        QueueCircularImplementation queue = new QueueCircularImplementation();
        queue.createCircularQueue(5);

        System.out.println("\nEnqueuing 5 values in the queue...");
        for (int i = 1; i <= 5; i++) {
            queue.enqueueItemInCircularQueue(i * 10);
        }
        queue.enqueueItemInCircularQueue(60);
        System.out.println("----------------------------------");

        queue.deleteItemInCircularQueue();
        queue.deleteItemInCircularQueue();

        System.out.println("----------------------------------");

        queue.printArray();
        System.out.println("----------------------------------");

        System.out.println("Enqueuing new value in the queue");
        queue.enqueueItemInCircularQueue(60);
        queue.printArray();

        System.out.println("----------------------------------");
        queue.deleteItemInCircularQueue();
        queue.printArray();

        System.out.println("----------------------------------");
        queue.deletingEntireQueue();


    }
}
