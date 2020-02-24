package sample.com.practise.stack_array;

public class StackLinkedListImplementation {

    private Node top;

    public void createStack() {

        top = null;

    }


    public void pushOperationOntoStack(int value) {

        Node node = new Node(value);
        node.next = top;
        top = node;

    }

    public void popOperationOntoStack() {
        if(isStackEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Popped Value is " + top.value);
            top = top.next;
        }
    }


    public void peekOperationOfStack() {
        if(isStackEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Peeked Value is " + top.value);
        }
    }

    public void deletionOfStack() {
        if(isStackEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            top = null;
        }
    }

    public void traverseStack() {
        if(isStackEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            Node temp = top;

            while (temp != null) {
                System.out.print(temp.value + "\t");
                temp = temp.next;
            }

            System.out.print("\n");
        }
    }


    public boolean isStackEmpty() {
        return top == null;
    }
}
