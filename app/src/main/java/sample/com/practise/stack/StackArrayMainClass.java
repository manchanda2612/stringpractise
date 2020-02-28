package sample.com.practise.stack;

public class StackArrayMainClass {

    public static void main(String[] args) {

        StackArrayImplementation stackArrayImplementation = new StackArrayImplementation();

        stackArrayImplementation.createStack(10);
        stackArrayImplementation.pushValueOntoStack(10);
        stackArrayImplementation.pushValueOntoStack(20);
        stackArrayImplementation.pushValueOntoStack(30);
        stackArrayImplementation.pushValueOntoStack(40);
        stackArrayImplementation.pushValueOntoStack(50);
        stackArrayImplementation.pushValueOntoStack(60);
        stackArrayImplementation.pushValueOntoStack(70);
        stackArrayImplementation.pushValueOntoStack(80);
        stackArrayImplementation.pushValueOntoStack(90);
        stackArrayImplementation.pushValueOntoStack(100);
        stackArrayImplementation.pushValueOntoStack(110);

        stackArrayImplementation.traverseStack();


        stackArrayImplementation.popValueFromStack();
        stackArrayImplementation.popValueFromStack();
        stackArrayImplementation.popValueFromStack();
        stackArrayImplementation.popValueFromStack();

        stackArrayImplementation.traverseStack();


        stackArrayImplementation.deletionOfStack();
        stackArrayImplementation.traverseStack();




    }
}
