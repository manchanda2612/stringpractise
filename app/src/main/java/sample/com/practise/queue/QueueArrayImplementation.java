package sample.com.practise.queue;

public class QueueArrayImplementation {

    private int[] arr;
    private int enqueue = -1, dequeue = -1;

    public void createLinearQueueArrayImplementation(int size) {

        arr = new int[size];
    }


    public void enqueueArrayImplementation(int value) {

        // if queue is full
        if(isQueueFull()) {

            System.out.println("Queue is Full");

         // insert value at 0th position
        } else if (enqueue == -1 && dequeue == -1) {
            enqueue++;
            dequeue++;
            arr[enqueue] = value;
            System.out.println("Value inserted : " + value);
        }

        // insert value at any location
        else {
            enqueue++;
            arr[enqueue] = value;
            System.out.println("Value inserted : " + value);
        }
    }

    public void dequeueArrayImplementation() {

        // if queue is empty
        if(isQueueEmpty()) {
            System.out.println("Queue is Empty");


        }

        // if there is only one item exist in queue
        else if (enqueue == dequeue) {
            System.out.println("Value deleted : " + arr[dequeue]);
            enqueue = -1;
            dequeue = -1;
        }

        // if there is more than one item exist
        else {
            System.out.println("Value deleted : " + arr[dequeue]);
            dequeue++;
        }
    }

    public void peekQueueArrayImplementation() {

        if(isQueueEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Peek operation : " + arr[dequeue]);
        }
    }

    public void deletionOfQueue() {
        arr = null;
        System.out.println("Queue is Empty");
    }

    public void traverseQueue() {
        if(isQueueEmpty()) {
            System.out.println("Queue is Empty");
        } else {

            for(int i = dequeue; i <= enqueue; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.print("\n");
        }
    }

    private boolean isQueueFull() {
       return (enqueue +1) == arr.length;
    }

    private boolean isQueueEmpty(){
        return dequeue == -1 && enqueue == -1;
    }
}
