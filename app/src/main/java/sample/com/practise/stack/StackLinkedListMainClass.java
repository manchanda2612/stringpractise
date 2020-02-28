package sample.com.practise.stack;

public class StackLinkedListMainClass {

    public static void main(String[] args) {

        StackLinkedListImplementation stackLinkedListImplementation = new StackLinkedListImplementation();

        stackLinkedListImplementation.createStack();

        System.out.println(stackLinkedListImplementation.isStackEmpty() ? "Stack is Empty" : "Stack is not Empty");

        stackLinkedListImplementation.pushOperationOntoStack(10);
        stackLinkedListImplementation.pushOperationOntoStack(20);
        stackLinkedListImplementation.pushOperationOntoStack(30);
        stackLinkedListImplementation.pushOperationOntoStack(40);
        stackLinkedListImplementation.pushOperationOntoStack(50);

        stackLinkedListImplementation.traverseStack();

        stackLinkedListImplementation.popOperationOntoStack();
        stackLinkedListImplementation.popOperationOntoStack();
        stackLinkedListImplementation.popOperationOntoStack();

        stackLinkedListImplementation.traverseStack();

        stackLinkedListImplementation.peekOperationOfStack();
        stackLinkedListImplementation.peekOperationOfStack();
        stackLinkedListImplementation.peekOperationOfStack();

        stackLinkedListImplementation.traverseStack();

        stackLinkedListImplementation.deletionOfStack();

        stackLinkedListImplementation.traverseStack();


    }

}
