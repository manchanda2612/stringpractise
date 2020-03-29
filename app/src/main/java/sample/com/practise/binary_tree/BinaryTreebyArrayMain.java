package sample.com.practise.binary_tree;

public class BinaryTreebyArrayMain {

    public static void main(String[] args) {

        //Create a blank array to store Binary Tree
        System.out.println("Creating a blank Array to store Binary Tree...");
        BinaryTreeByArray tree = new BinaryTreeByArray();
        tree.createBinaryTree(10);


        //Insert 10 values in the tree
        System.out.println("Inserting 10 values in the Tree...");
        for(int i = 1; i<=10; i++){
            tree.insertIntoBinaryTree(i*10);
        }


        //Level order Traverse
        System.out.println("\nLevel-order Traversal:");
        tree.levelOrderTraversal(1);


        //Pre order Traverse
        System.out.println("\n\nPre-order Traversal:");
        tree.preOrderTraversal(1);


        //Post order Traverse
        System.out.println("\n\nPost-order Traversal:");
        tree.postOrderTraversal(1);

        //In order Traverse
        System.out.println("\n\nIn-order Traversal:");
        tree.inOrderTraversal(1);


        //Search for value in Tree
        System.out.println("\n\nSearching value 500 in the tree...");
        tree.searchValueInBinaryTree(500);


        //Search for value in Tree
        System.out.println("Searching value 40 in the tree...");
        tree.searchValueInBinaryTree(40);


        //Delete value from Tree
        System.out.println("\nDeleting node 500 from the tree...");
        tree.deleteValueFromBinaryTree(500);


        //Delete value from Tree
        System.out.println("Deleting node 40 from the tree...");
        tree.deleteValueFromBinaryTree(40);


        //Level order Traverse
        System.out.println("\nLevel-order Traversal:");
        tree.levelOrderTraversal(1);


        //Delete the entire Tree
        System.out.println("\n\nDeleting the entire Tree...");
        tree.deleteBinaryTree();


    }

}
