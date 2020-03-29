package sample.com.practise.binary_tree;

public class BinaryTreeByArray {

    int[] arr;
    int mLastUsedLocation;


    public BinaryTreeByArray() {
    }

    public void createBinaryTree(int size) {

        arr = new int[size + 1];
        mLastUsedLocation = 0;
    }

    public boolean isBinaryTreeFull() {
        return arr.length == mLastUsedLocation;
    }

    public boolean isBinaryTreeEmpty() {
        return arr == null;
    }

    public void insertIntoBinaryTree (int value) {

        if(isBinaryTreeFull()) {
            System.out.println("Binary Tree is Full");
            return;
        }

        System.out.println("Value inserted " + value);
        arr[mLastUsedLocation + 1] = value;
        mLastUsedLocation++;

    }

    public void searchValueInBinaryTree (int value) {

        if(isBinaryTreeEmpty()) {
            System.out.println("Binary Tree is empty");
            return;
        }

        for(int i = 1; i <= mLastUsedLocation; i++) {

            if(arr[i] == value) {
                System.out.println("Value " + value + " exist in binary tree");
                return;
            }
        }
        System.out.println("Value " + value + " is not exist in binary tree");
    }

    public void inOrderTraversal(int index) {
        if(isBinaryTreeEmpty()) {
            System.out.println("Binary Tree is empty");
            return;
        }

        if(index > mLastUsedLocation) {
            return;
        }

        inOrderTraversal(2 * index);
        System.out.print(arr[index] + "\t");
        inOrderTraversal(2 * index + 1);
    }


    public void preOrderTraversal(int index) {
        if(isBinaryTreeEmpty()) {
            System.out.println("Binary Tree is empty");
            return;
        }

        if(index > mLastUsedLocation) {
            return;
        }

        System.out.print(arr[index] + "\t");
        preOrderTraversal(2 * index);
        preOrderTraversal(2 * index + 1);
    }


    public void postOrderTraversal(int index) {
        if(isBinaryTreeEmpty()) {
            System.out.println("Binary Tree is empty");
            return;
        }

        if(index > mLastUsedLocation) {
            return;
        }

        postOrderTraversal(2 * index);
        postOrderTraversal(2 * index + 1);
        System.out.print(arr[index] + "\t");
    }


    public void levelOrderTraversal(int index) {
        if(isBinaryTreeEmpty()) {
            System.out.println("Binary Tree is empty");
            return;
        }

        for(int i = index; i <= mLastUsedLocation; i++) {
            System.out.print(arr[i] + "\t");
        }
    }


    public void deleteValueFromBinaryTree(int value) {

        if(isBinaryTreeEmpty()) {
            System.out.println("Binary Tree is empty");
            return;
        }

        for(int i = 1; i <= mLastUsedLocation; i++) {

            if(arr[i] == value) {
                arr[i] = arr[mLastUsedLocation];
                mLastUsedLocation--;
                System.out.print("Value " + value + " deleted successfully");
                return;
            }
        }

        System.out.println("Value " + value + " is not exist in tree");

    }

    public void deleteBinaryTree() {
        arr = null;
        System.out.println("Binary Tree successfully deleted");
    }


}
