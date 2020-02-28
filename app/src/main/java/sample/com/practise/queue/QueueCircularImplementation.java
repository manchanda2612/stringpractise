package sample.com.practise.queue;

public class QueueCircularImplementation {

    private int[] arr;
    private int dequeue = -1;
    private int enqueue = -1;

    public void createCircularQueue(int size) {

        arr = new int[size];
    }


    private boolean isQueueEmpty() {
        return dequeue == -1 && enqueue == -1;
    }

    private boolean isQueueFull() {
        return (dequeue == 0 && enqueue == arr.length -1) // normal condition of queue is full
                ||
                (enqueue + 1 == dequeue); //If we have completed a circle, then we can say that Queue is full
    }


    public void enqueueItemInCircularQueue(int value) {

        // if queue is full
        if(isQueueFull()) {
            System.out.println("Queue is Full");
        }

        // insert value at first position
        else if (dequeue == -1 && enqueue == -1) {
            dequeue++;
            enqueue++;
            arr[enqueue] = value;
            System.out.println("Value inserted " + arr[enqueue]);
        }

        // if enqueue is at last position and dequeue is somewhere between 0 to last position
        else if (enqueue == arr.length - 1) {
            enqueue = 0;
            arr[enqueue] = value;
            System.out.println("Value inserted " + arr[enqueue]);
        }

        // if all other condition fails then simply increase enqueue and put value in that
        else {
            enqueue++;
            arr[enqueue] = value;
            System.out.println("Value inserted " + arr[enqueue]);
        }
    }


    public void deleteItemInCircularQueue () {

        // if queue is empty
        if(isQueueEmpty()) {
            System.out.println("Queue is Empty");
        }

        // if dequeue and enqueue is at same position
        else if (dequeue == enqueue) {
            System.out.println("Delete Value is " + arr[dequeue]);
            arr[dequeue] = 0;
            enqueue = -1;
            dequeue = -1;
        }

        // if dequeue is at last position and enqueue is at somewhere in middle
        // if circle is completed
        else if(dequeue == arr.length - 1) {
            System.out.println("Delete Value is " + arr[dequeue]);
            arr[dequeue] = 0;
            dequeue = 0;
        }

        // if all other condition fails then simply increase enqueue and put value in that
        else {
            System.out.println("Delete Value is " + arr[dequeue]);
            arr[dequeue] = 0;
            dequeue++;
        }

    }


    public void peekItemFromCircularQueue() {
        if(isQueueEmpty()) {
            System.out.println("Queue is Empty");
        }

        else {
            System.out.println("Peek value is " + arr[dequeue]);
        }
    }


    public void deletingEntireQueue() {
        arr = null;
        System.out.print("Entire Queue is deleted");
    }


    //Print entire array
    public void printArray() {
        System.out.println("Traversing Queue now...");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println("\nEnqueue position = " + enqueue);
        System.out.println("Dequeue position = "+ dequeue);
    }


}
