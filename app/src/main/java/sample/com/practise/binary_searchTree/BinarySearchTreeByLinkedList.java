package sample.com.practise.binary_searchTree;

import java.util.LinkedList;
import java.util.Queue;

import sample.com.practise.udemy_data_structure.node.BinaryNode;

public class BinarySearchTreeByLinkedList {


    Node root;

    public Node createNewNode(int value) {
        return new Node(value);
    }


    public void searchValueInBinarySearchTree(Node root, int value) {

        if(root == null) {
            System.out.println("Either Binary Search Tree is blank or Value not found");;
        }

        else if (root.value == value) {
            System.out.println("Value found in Binary Search Tree");
            return;
        }

        else if (root.value > value) {
            searchValueInBinarySearchTree(root.left,value);
        }

        else {
            searchValueInBinarySearchTree(root.right, value);
        }
    }


    public void inOrderTraversal(Node root) {
        if(root == null) {
            System.out.println("Binary Search Tree is blank");
        }

        inOrderTraversal(root.left);
        System.out.print(root.value + "\t");
        inOrderTraversal(root.right);
    }

    public void preOrderTraversal(Node root) {
        if(root == null) {
            System.out.println("Binary Search Tree is blank");
        }

        System.out.print(root.value + "\t");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal(Node root) {
        if(root == null) {
            System.out.println("Binary Search Tree is blank");
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value + "\t");
    }

    public void levelOrderTraversal(Node node) {

        if(node == null) {
            System.out.println("Binary Search Tree is blank");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()) {

            Node temp = queue.remove();

            System.out.print(temp.value + "\t");

            if(null != temp.left) {
                queue.add(temp.left);
            }

            if(null != temp.right) {
                queue.add(temp.right);
            }
        }
    }

    public void insert(int valueToBeInserted) {
        System.out.println("Value to be inserted at " + valueToBeInserted);
        root = insertValueAtBinarySearchTree(root, valueToBeInserted);
    }

    public Node insertValueAtBinarySearchTree (Node node, int value) {
        if(node == null) {
            return createNewNode(value);
        }

        else if (node.value > value) {
            node.left =  insertValueAtBinarySearchTree(node.left, value);
        }

        else {
            node.right =  insertValueAtBinarySearchTree(node.right, value);
        }
        return node;
    }

    // Helper Method for delete
    public Node deleteNodeOfBST(Node root, int value) {
        if (root == null) {
            System.out.println("\nValue not found in BST");
            return null;
        }
        if (value < root.value) {
            root.left = deleteNodeOfBST(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNodeOfBST(root.right, value);
        } else { // If currentNode is the node to be deleted

            if (root.left != null && root.right != null) { // if nodeToBeDeleted have both children
                Node temp = root;
                Node minNodeForRight = minimumElement(temp.right);// Finding minimum element from right subtree
                root.value = minNodeForRight.value; // Replacing current node with minimum node from right subtree
                root.right = deleteNodeOfBST(root.right, minNodeForRight.value);  // Deleting minimum node from right now
            } else if (root.left != null) {// if nodeToBeDeleted has only left child
                root = root.left;
            } else if (root.right != null) {// if nodeToBeDeleted has only right child
                root = root.right;
            } else // if nodeToBeDeleted do not have child (Leaf node)
                root = null;
        }
        return root;
    }



    private Node minimumElement(Node node) {

        Node temp = node;

        while (null != temp.left) {

            temp = temp.left;

        }
        return temp;
    }


    public void deleteBinarySearchTree() {
        root = null;
        System.out.println("\nBinary search tree deleted");
    }
}
