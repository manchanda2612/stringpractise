package sample.com.practise.sortings;

public class BubbleSortMain {

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();

        int[] arr = { 10, 5, 30, 15, 50, 6 };
        System.out.println("Array to be sorted...");
        bubbleSort.traverse(arr);

        bubbleSort.bubbleSort(arr);

        System.out.println("\nSorted Array...");
        bubbleSort.traverse(arr);

    }

}
