package sample.com.practise.sortings;

public class BubbleSort {

    public void bubbleSort(int[] arr) {

        if(null == arr) {
            System.out.println("List is empty");
            return;
        }

        int size = arr.length;
        int temp;
        for(int i = 0; i < size - 1; i++) {

            for(int j = 0; j < size - i - 1; j++) {

                if(arr[j] > arr[j + 1]) {
                   temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
                }
            }
        }
    }


    public void traverse(int[] arr) {

        if(null == arr) {
            System.out.println("List is empty");
            return;
        }

        int size = arr.length;
        for (int i = 0; i < size; i++) {

            System.out.print(arr[i] + "\t");

        }
    }

}
