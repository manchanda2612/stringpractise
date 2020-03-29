package sample.com.practise.binary_tree;


import java.util.LinkedList;
import java.util.Queue;

/**
 * I have tried a lot to implement binary tree with own created queue but it will require number of operations.
 * I have seen no of example on GeekForGeeks in which even people hasn't used their own queue else they used Queue Interface.
 * So I am going to implement binary tree with Queue interface.
 */
public class BinaryTreeByLinkedList {

    Node root;

    // for level order traversing
    QueueNode dequeue = null;
    QueueNode enqueue = null;

    public void createBlankTree() {
        root = null;
    }


    public void insertIntoBinaryTreeByLinkedList(int value) {
        Node node = new Node(value);
        // if there is no node in the tree
        if(root == null) {
            root = node;
            System.out.println("Successfully inserted new node at Root !");
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.remove();
            System.out.println("Binary Tree value is : " + temp.value);

            if(temp.left == null) {
                temp.left = node;
                System.out.println("Successfully inserted new node !");
                break;
            }

            else if(temp.right == null) {
                temp.right = node;
                System.out.println("Successfully inserted new node !");
                break;
            }

            else {
                queue.add(temp.left);
                queue.add(temp.right);
            }
        }
    }


    public void searchIntoBinaryTreeByLinkedList(int value) {

        if(null == root) {
            System.out.println("Binary Tree is blank");
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {

            Node temp = queue.remove();

            if(temp.value == value) {
                System.out.println("Value-"+value+" is found in Tree !");
                return;

            }

            if (temp.left != null) {
                queue.add(temp.left);
            }

            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
        System.out.println("Value-"+value+" is not found in Tree !");
    }

    public void preOrderTraversal(Node nodeAddress) {

        if(nodeAddress == null) {
            return;
        }

        System.out.print(nodeAddress.value + "\t");
        preOrderTraversal(nodeAddress.left);
        preOrderTraversal(nodeAddress.right);
    }


    public void inOrderTraversal(Node nodeAddress) {

        if(nodeAddress == null) {
            return;
        }

        inOrderTraversal(nodeAddress.left);
        System.out.print(nodeAddress.value + "\t");
        inOrderTraversal(nodeAddress.right);

    }

    public void postOrderTraversal(Node nodeAddress) {

        if(nodeAddress == null) {
            return;
        }

        postOrderTraversal(nodeAddress.left);
        postOrderTraversal(nodeAddress.right);
        System.out.print(nodeAddress.value + "\t");

    }


    public void levelOrderTraversal() {

        if(root == null) {
            System.out.println("Binary Tree is empty");
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {

            Node node = queue.remove();

            System.out.print(node.value + "\t");

            if(node.left != null) {
                queue.add(node.left);
            }

            if(node.right != null) {
                queue.add(node.right);
            }
        }
    }




    public void deleteNodeFromBinaryTree(int value) {

        if(null == root) {
            System.out.println("Binary Tree is empty");
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {

            Node node = queue.remove();

            if (null != node) {

                if (node.value == value) {
                    node.value = getDeepestNode().value;
                    deleteDeepestNode();
                    System.out.println("Value deleted");
                    return;
                }

                queue.add(node.left);
                queue.add(node.right);

            }
        }

        System.out.println("Value " + value + " is not in the tree");
    }



    public void deleteDeepestNode() {
        if(null == root) {
            System.out.println("Binary tree is empty");
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        Node previousNode, presentNode = null;

        while (!queue.isEmpty()) {

            Node node = queue.remove();

            previousNode = presentNode;
            presentNode = node;

            if(null == presentNode.left) {
                previousNode.right = null;
                return;
            }

            else if(null == presentNode.right) {

                presentNode.left = null;
                return;

            }

            queue.add(node.left);
            queue.add(node.right);
        }
    }

    public Node getDeepestNode() {
        if(null == root) {
            System.out.println("Binary tree is empty");
            return  null;
        }


        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        Node node = null;
        while (!queue.isEmpty()) {

            node = queue.remove();

            if(null != node.left) {
                queue.add(node.left);
            }

            if(null != node.right) {
                queue.add(node.right);
            }
        }
        return node;
    }


    public void deleteTree() {
        root = null;
        System.out.println("Binary Tree has been deleted successfully");
    }
}
