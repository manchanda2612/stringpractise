package sample.com.practise.heap;

public class BinaryHeapByArray {

    int arr[];
    int sizeOfHeap = 0;

    public void createBinaryHeap(int size) {
        arr = new int[size + 1];
    }

    public void peekFromBinaryHeap() {
        if(null == arr) {
            System.out.println("Binary Heap is blank");
        }

        System.out.println("Top of the heap is " + arr[1]);
    }


    public void sizeOfBinaryHeap() {
        System.out.println("Size of Binary Heap is " + sizeOfHeap);
    }

    public void insertValueIntoBinaryHeap(int value) {
        if(null == arr) {
            System.out.println("Binary Heap is empty");
            return;
        }

        if(arr.length > sizeOfHeap) {
            arr[sizeOfHeap + 1] = value;
            sizeOfHeap++;
            heapifyBottomToTop(sizeOfHeap);
        }
    }


    private void heapifyBottomToTop(int index) {
        int parentIndex = index / 2;

        // We are at root of the tree. Hence no more Heapifying is required.
        if (index <= 1) {
            return;
        }
        // If Current value is smaller than its parent, then we need to swap
        if(arr[parentIndex] > arr[index]) {
            arr[index] = arr[parentIndex] + arr[index];
            arr[parentIndex] = arr[index] - arr[parentIndex];
            arr[index] = arr[index] - arr[parentIndex];
        }

        heapifyBottomToTop(parentIndex);

    }

    public void levelOrderTraversal() {
        if(null == arr) {
            System.out.println("Binary Heap is empty");
        }

        for(int i = 1; i <= sizeOfHeap; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    // Extract value from binary Heep
    public void deleteValueFromBinaryHeap() {

        if(0 == sizeOfHeap) {
            System.out.print("Binary Heap is empty");
            return;
        } else {

            System.out.println("Head of the Heap is: " + arr[1]);
            System.out.println("Extracting it now...");
            arr[1] = arr[sizeOfHeap];
            sizeOfHeap--;
            heapifyToptoBottom(1);
            System.out.println("Successfully extracted value from Heap.");
        }
    }


    private void heapifyToptoBottom(int index) {
        int left = index * 2;   // for storing left node
        int right = (index * 2) + 1;  // for storing right node
        int smallest = 0;

        if(sizeOfHeap < left) {   // if there is no child exist
            return;
        }

        else if (sizeOfHeap == left) {  // if there is only one child exist
            if(arr[index] > arr[left]) {
                arr[index] = arr[index] + arr[left];
                arr[left] = arr[index] - arr[left];
                arr[index] = arr[index] - arr[left];
            }
            return;
        }

        else { // if both child exist

            if (arr[left] < arr[right]) {
                smallest = left;
            }
            else {
                smallest = right;
            }

            if (arr[index] > arr[smallest]) {
                arr[index] = arr[index] + arr[smallest];
                arr[smallest] = arr[index] - arr[smallest];
                arr[index] = arr[index] - arr[smallest];
            }
        }

        heapifyToptoBottom(smallest);


    }





}
