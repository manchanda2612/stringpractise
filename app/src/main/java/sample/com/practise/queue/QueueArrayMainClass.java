package sample.com.practise.queue;


public class QueueArrayMainClass {

    public static void main(String[] args) {

        QueueArrayImplementation queueArrayImplementation = new QueueArrayImplementation();
        queueArrayImplementation.createLinearQueueArrayImplementation(10);

        queueArrayImplementation.enqueueArrayImplementation(10);
        queueArrayImplementation.enqueueArrayImplementation(20);
        queueArrayImplementation.enqueueArrayImplementation(30);
        queueArrayImplementation.enqueueArrayImplementation(40);
        queueArrayImplementation.enqueueArrayImplementation(50);
        queueArrayImplementation.enqueueArrayImplementation(60);
        queueArrayImplementation.enqueueArrayImplementation(70);
        queueArrayImplementation.enqueueArrayImplementation(80);
        queueArrayImplementation.enqueueArrayImplementation(90);
        queueArrayImplementation.enqueueArrayImplementation(100);

        queueArrayImplementation.traverseQueue();

        queueArrayImplementation.dequeueArrayImplementation();
        queueArrayImplementation.traverseQueue();

        queueArrayImplementation.dequeueArrayImplementation();
        queueArrayImplementation.traverseQueue();

        queueArrayImplementation.dequeueArrayImplementation();
        queueArrayImplementation.traverseQueue();

        queueArrayImplementation.dequeueArrayImplementation();
        queueArrayImplementation.traverseQueue();

        queueArrayImplementation.peekQueueArrayImplementation();

        queueArrayImplementation.deletionOfQueue();

    }
}
