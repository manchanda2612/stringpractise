package sample.com.practise.stack;

public class StackArrayImplementation {

    int arr[];
    int top = -1;

    public void createStack(int size) {
        arr = new int[size];
        System.out.println("Stack is created of lenght " + size);
    }


    public void pushValueOntoStack(int value) {

        if(checkWhetherStackIsFull()) {
            System.out.println("Stack is Full");
        } else {
            top++;
            arr[top] = value;
            System.out.println("Pushed Value" + arr[top]);
        }
    }

    public void popValueFromStack() {
        if(checkWhetherStackIsEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Popped Value" + arr[top]);
            top--;
        }
    }

    public void peekValueFromStack() {
        if(checkWhetherStackIsEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.print("Peek Value is " + arr[top]);
        }
    }

    private boolean checkWhetherStackIsEmpty() {
        return top == -1;
    }


    private boolean checkWhetherStackIsFull(){
        return top == arr.length - 1;
    }


    public void deletionOfStack() {
        arr = null;
    }

    public void traverseStack() {
        if(top > -1 && null != arr) {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + "\t");
            }
            System.out.print("\n");
        } else {
            System.out.print("Stack is Empty");
        }

    }

}
