package sample.com.practise.binary_searchTree;


public class BinarySearchTreeMain {

    public static void main(String[] args) {

        //Constructor
        BinarySearchTreeByLinkedList tree = new BinarySearchTreeByLinkedList();

        //Inserting values in BST
        System.out.println("Inserting 11 nodes in Tree");
        tree.insert(100);
        tree.insert(80);
        tree.insert(70);
        tree.insert(90);
        tree.insert(50);
        tree.insert(150);
        tree.insert(180);
        tree.insert(200);
        tree.insert(250);
        tree.insert(135);
        tree.insert(165);


        //Searching non-existing value in Tree
        System.out.println("\n\nSearching for value on BST...");
        tree.searchValueInBinarySearchTree(tree.root, 170);

        //Searching non-existing value in Tree
        System.out.println("\n\nSearching for value on BST...");
        tree.searchValueInBinarySearchTree(tree.root, 60);

        //Searching existing value in Tree
        System.out.println("\nSearching for value on BST...");
        tree.searchValueInBinarySearchTree(tree.root, 250);

        //Searching existing value in Tree
        System.out.println("\nSearching for value on BST...");
        tree.searchValueInBinarySearchTree(tree.root, 135);

        //Deleting Node from Tree
        tree.deleteNodeOfBST(tree.root, 35); //Node does not exists
        System.out.println("\nLevel Order Traversal : ");
        tree.levelOrderTraversal(tree.root);

        tree.deleteNodeOfBST(tree.root, 50); //Node is having 0 Child
        System.out.println("\nLevel Order Traversal : ");
        tree.levelOrderTraversal(tree.root);

        tree.deleteNodeOfBST(tree.root, 200); //Node is having 1 Child
        System.out.println("\nLevel Order Traversal : ");
        tree.levelOrderTraversal(tree.root);

        tree.deleteNodeOfBST(tree.root, 100); //Node is having 2 Child
        System.out.println("\nLevel Order Traversal : ");
        tree.levelOrderTraversal(tree.root);

        //Deleting entire Tree
        tree.deleteBinarySearchTree();

        //Traversing Tree
        System.out.println("\nLevel Order Traversal : ");
        tree.levelOrderTraversal(tree.root);

    }

}
