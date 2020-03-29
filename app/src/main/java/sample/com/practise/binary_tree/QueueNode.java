package sample.com.practise.binary_tree;

public class QueueNode {

    Node value;
    QueueNode next = null;

    public QueueNode(Node nodeAddress) {
        value = nodeAddress;
    }

    public void setValue(Node nodeAddress) {
        value = nodeAddress;
    }
}
